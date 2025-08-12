package Arreglos;

import java.util.Scanner;

public class EjercicioTreceOrdenarArregloDeLaFormaUltimoPrimero {
    public static void main(String[] args) {

        int[] numeros = new int[10];
        int[] a = new int[10];
        Scanner s = new Scanner(System.in);

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Introduzca número entero " + (i + 1) + ": ");
            numeros[i] = s.nextInt();
        }
        // Reorganizar: último, primero, penúltimo, segundo, etc.
        int aux = 0;
        for (int i = 0; i < numeros.length - i; i++) {
            a[aux++] = numeros[numeros.length - 1 - i]; // último, penúltimo...
            a[aux++] = numeros[i];// Primero, segundo...
        }
        for (int i = 0; i < a.length; i++) {
            System.out.println("i = " + i + " ->  valor: " + a[i]);
        }
    }
}
