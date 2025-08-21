package Arreglos;

import java.util.Scanner;

public class EjercicioCatorceNumeroMasAltoDeUnArreglo {
    public static void main(String[] args) {

        int[] numeros = new int[7];

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("introduzca un entero dentro del rango (11 - 99) para la posición del array = " + i + 1);
            numeros[i] = sc.nextInt();
        }

        System.out.println("Procedemos a buscar el mayor número");
        int max = 0;
        for (int i = 1; i < numeros.length; i++) {
            max = (numeros[max] > numeros[i]) ? max : i;
        }

        System.out.println("mayor = " + numeros[max]);
    }
}
