# Java · Arrays, matrices y primeros pasos con objetos

**Java · Algoritmos básicos · Arrays · Matrices · Programación orientada a objetos**

Repositorio de seguimiento de un curso de Java en Udemy. Contiene **93 archivos fuente** organizados por temas y ejemplos ejecutables desde consola. Su propósito es mostrar práctica y evolución durante la formación.

**English:** Java coursework organised into fundamentals, arrays, matrices and introductory object-oriented examples. This is a learning repository, not a production application.

## Qué contiene

| Carpeta | Temas | Punto de entrada sugerido |
| --- | --- | --- |
| [`src/HelloWord`](src/HelloWord) | Operadores, strings, control de flujo, fechas y argumentos. | [`ProgramaManejoDeNombres.java`](src/HelloWord/ProgramaManejoDeNombres.java) |
| [`src/Arreglos`](src/Arreglos) | Búsqueda, ordenación, recorridos, combinación y desplazamiento de arrays. | [`EjemploArreglosNumeroMayor.java`](src/Arreglos/EjemploArreglosNumeroMayor.java) |
| [`src/Matrices`](src/Matrices) | Sumas, transposición, identidad y simetría. | [`EjemploMatricesTranspuesta.java`](src/Matrices/EjemploMatricesTranspuesta.java) |
| [`src/poo`](src/poo) | Clases, atributos, instancias y métodos. | [`EjemploAutomovil.java`](src/poo/EjemploAutomovil.java) |

## Ejecutar el ejemplo de objetos

Requisitos: Git y JDK 17.

```bash
git clone https://github.com/Rpfdeveloper/Master-Java-180h-Udemy.git
cd Master-Java-180h-Udemy
javac -encoding UTF-8 -d build/classes src/poo/Automovil.java src/poo/EjemploAutomovil.java
java -cp build/classes poo.EjemploAutomovil
```

El programa crea dos automóviles y muestra sus atributos. Es una introducción al modelado de objetos; no implementa persistencia ni una aplicación de gestión.

## Compilar toda la colección

**Windows PowerShell**

```powershell
$fuentesJava = (Get-ChildItem -Path src -Recurse -Filter *.java).FullName
javac -encoding UTF-8 -d build/classes $fuentesJava
java -cp build/classes Arreglos.EjemploArreglosNumeroMayor
```

**Linux / macOS**

```bash
find src -name '*.java' > sources.txt
javac -encoding UTF-8 -d build/classes @sources.txt
java -cp build/classes Arreglos.EjemploArreglosNumeroMayor
```

El ejemplo pide cinco enteros y muestra el mayor. Las clases se ejecutan por separado; algunas requieren datos por consola o recursos específicos.

## Estado de verificación

Los 93 archivos fuente compilan con Java 17. La compilación muestra avisos de operaciones genéricas sin comprobar en algunos ejemplos.

Se han añadido **tres pruebas automatizadas** que ejecutan las clases reales: búsqueda del mayor con cinco conjuntos de datos (incluidos negativos y límites de enteros), transposición de la matriz del ejemplo y conservación de los datos de dos automóviles distintos. Las tres pasan en la revisión local con Java 17. No certifican el funcionamiento de los demás ejemplos del curso.

Requisitos para las pruebas: Python 3 y JDK 17, con `java` y `javac` en el PATH o `JAVA_HOME` configurado.

```bash
python -m unittest discover -s tests -v
```

En Windows también se puede usar `py -3 -m unittest discover -s tests -v`. La suite compila todos los fuentes en una carpeta temporal; no utiliza los `.class` históricos. El workflow [Java examples](https://github.com/Rpfdeveloper/Master-Java-180h-Udemy/actions) está configurado para ejecutar las comprobaciones en cada push y pull request.

Hay archivos `.class` históricos en el repositorio. Los comandos anteriores recompilan el código fuente en `build/classes` y no utilizan esos binarios.

## Contexto y autoría

Ejercicios de formación de [Roberto Pajuelo · Rpfdeveloper](https://github.com/Rpfdeveloper), basados en el curso indicado por el nombre del repositorio. Los ejemplos no se presentan como productos originales ni como experiencia profesional en Java.

La documentación y las comprobaciones automatizadas añadidas el 20 de octubre de 2026 se han preparado con asistencia de IA.
