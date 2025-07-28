package Arreglos;

import java.util.Scanner;

public class EjemploArregloDetectarOrden {
    public static void main(String[] args) {

        int[] a = new int[7];

        Scanner s = new Scanner(System.in);
        System.out.println("Introduzca 7 números:");

        for (int i = 0; i < a.length; i++) {
            a[i] = s.nextInt();
        }

        boolean ascendente = false;
        boolean descendente = false;

        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] > a[i + 1]) {
                descendente = true;
            }

            if (a[i] < a[i + 1]) {
                ascendente = true;
            }
        }
        if (ascendente && descendente) {
            System.out.println("Arreglo = desordenado");
        }

        if (!ascendente && !descendente) {
            System.out.println("Arreglo = todos son iguales");
        }

        if (ascendente && !descendente) {
            System.out.println("Arreglo = Ordenado de forma ascendente");
        }

        if (!ascendente && descendente) {
            System.out.println("Arreglo = ordenado de forma descendente");
        }

    }
}
