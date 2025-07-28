package Arreglos;

import java.util.Scanner;

public class EjemploArreglosDesplazarPosicion {
    public static void main(String[] args) {
        int[] num = new int[10];

        Scanner s = new Scanner(System.in);

        System.out.println(" Este programa desplaza un numero en un arreglo");
        for (int i = 0; i < num.length; i++) {
            System.out.println("Introduzca un numero entero");
            num[i] = s.nextInt();
        }
        int aux;
        int aux2;
        for (int i = num.length - 1; i > 0; i--) {
            aux = num[i];
            aux2 = num[i - 1];
            num[i] = aux2;
            num[i - 1] = aux;

        }

        for (int i = 0; i < num.length; i++) {
            System.out.println("La posicion " + i + " contiene el número: " + num[i]);
        }

    }
}
