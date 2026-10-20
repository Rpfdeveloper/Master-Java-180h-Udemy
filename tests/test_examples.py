"""Compile the coursework and verify selected console examples end to end."""
import os
from pathlib import Path
import shutil
import subprocess
import tempfile
import unittest


ROOT = Path(__file__).resolve().parents[1]


class JavaExamplesTest(unittest.TestCase):
    @classmethod
    def setUpClass(cls):
        java_home = os.environ.get("JAVA_HOME")
        suffix = ".exe" if os.name == "nt" else ""
        cls.java = str(Path(java_home) / "bin" / ("java" + suffix)) if java_home else shutil.which("java")
        javac = str(Path(java_home) / "bin" / ("javac" + suffix)) if java_home else shutil.which("javac")
        if not cls.java or not javac or not Path(javac).is_file():
            raise RuntimeError("Install a JDK and set JAVA_HOME or add java and javac to PATH.")
        cls.build = tempfile.TemporaryDirectory()
        cls.addClassCleanup(cls.build.cleanup)
        sources = sorted((ROOT / "src").rglob("*.java"))
        subprocess.run([javac, "-encoding", "UTF-8", "-d", cls.build.name,
                        *map(str, sources)], check=True, capture_output=True, text=True, timeout=60)

    def run_example(self, name, input_text=""):
        result = subprocess.run([self.java, "-Dfile.encoding=UTF-8", "-cp", self.build.name, name],
                                input=input_text, capture_output=True, text=True,
                                encoding="utf-8", timeout=15)
        self.assertEqual(result.returncode, 0, result.stderr)
        self.assertEqual(result.stderr, "")
        return result.stdout

    def test_largest_integer_handles_negative_and_boundary_values(self):
        cases = [([1, 2, 3, 4, 5], 5), ([-9, -2, -8, -4, -5], -2),
                 ([7, 7, 7, 7, 7], 7), ([2147483647, 0, -2147483648, 3, 2], 2147483647),
                 ([-2147483648] * 5, -2147483648)]
        for values, expected in cases:
            with self.subTest(values=values):
                output = self.run_example("Arreglos.EjemploArreglosNumeroMayor", "\n".join(map(str, values)) + "\n")
                self.assertIn(f"max = {expected}", output.splitlines())

    def test_matrix_transpose_preserves_rows_and_columns(self):
        output = self.run_example("Matrices.EjemploMatricesTranspuesta")
        original, transposed = output.split("Matriz transpuesta")
        original_rows = [[int(n) for n in row.split()] for row in original.splitlines()[1:] if row.strip()]
        transposed_rows = [[int(n) for n in row.split()] for row in transposed.splitlines() if row.strip()]
        expected_original = [[1, 2, 3, 4], [5, 6, 7, 8], [9, 10, 11, 12], [13, 14, 15, 16]]
        expected_transposed = [[1, 5, 9, 13], [2, 6, 10, 14], [3, 7, 11, 15], [4, 8, 12, 16]]
        self.assertEqual(original_rows, expected_original)
        self.assertEqual(transposed_rows, expected_transposed)

    def test_cars_keep_separate_instance_values(self):
        output = self.run_example("poo.EjemploAutomovil")
        for value in ("Subaru", "Impreza", "2.0", "Blanco", "Mazda", "BT-50", "3.0", "Rojo"):
            self.assertIn(value, output)


if __name__ == "__main__":
    unittest.main()
