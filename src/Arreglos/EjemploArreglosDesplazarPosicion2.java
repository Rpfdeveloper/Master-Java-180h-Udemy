package Arreglos;

import java.util.Scanner;

public class EjemploArreglosDesplazarPosicion2 {
    public static void main(String[] args) {

        int[] num = new int[10];
        int position;
        int insert;
        Scanner s = new Scanner(System.in);
        num[9] = 0;
        System.out.println(" Este programa desplaza un numero insertado a petición en un arreglo");

        for (int i = 0; i < num.length - 1; i++) {
            System.out.println("Introduzca un numero entero");
            num[i] = s.nextInt();
        }
        System.out.println();

        System.out.println("Introduzca la posición en la que insertar el número entero entre (0 - 9): ");
        position = s.nextInt();

        System.out.println("Introduzca el número entero a insertar: ");
        insert = s.nextInt();

        for (int i = num.length - 2; i >= position; i--) {
            num[i + 1] = num[i];
        }

        num[position] = insert;

        for (int i = 0; i < num.length; i++) {
            System.out.println("La posicion " + i + " contiene el número: " + num[i]);
        }
    }
}