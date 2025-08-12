package Arreglos;

import java.util.Scanner;

public class EjemploArreglosDesplazarPosicion2b {
    public static void main(String[] args) {

        int[] num = new int[10];
        int position;
        int insert;
        int ultimo;
        Scanner s = new Scanner(System.in);
        num[9] = 0;
        System.out.println(" Este programa desplaza un numero insertado a petición en un arreglo");

        for (int i = 0; i < num.length; i++) {
            System.out.println("Introduzca un numero entero");
            num[i] = s.nextInt();
        }
        System.out.println();

        System.out.println("Introduzca la posición en la que insertar el número entero entre (0 - 9): ");
        position = s.nextInt();

        System.out.println("Introduzca el número entero a insertar: ");
        insert = s.nextInt();

        ultimo = num[num.length - 1];
        for (int i = num.length - 2; i >= position; i--) {
            num[i + 1] = num[i];
        }
        int[] num2 = new int[num.length + 1];
        System.arraycopy(num,0,num2,0,num.length);
        num = num2;
        num2[position] = insert;

        num2[num2.length - 1]= ultimo;

        for (int i = 0; i < num.length; i++) {
            System.out.println("La posicion " + i + " contiene el número: " + num[i]);
        }
    }
}