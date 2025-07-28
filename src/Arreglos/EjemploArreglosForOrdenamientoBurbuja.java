package Arreglos;

import java.util.Arrays;

public class EjemploArreglosForOrdenamientoBurbuja {

    public static void arregloInverso(String[] arreglo) {
        int count = arreglo.length;
        int count2 = arreglo.length;
        for (int i = 0; i < count2; i++) {
            String actual = arreglo[i];
            String inverso = arreglo[count - 1 - i];
            arreglo[i] = inverso;
            arreglo[count - 1 - i] = actual;
            count2--;
        }
    }

    //Ordenamiento burbuja de con array de cualquier tipo mediante Object
    public static void sortBurbuja(Object[] arreglo) {
        int count = arreglo.length;
        int count2 = 0;


        for (int i = 0; i < arreglo.length - 1; i++) {
            for (int j = 0; j < arreglo.length - 1 - i; j++) {
                if (((Comparable) arreglo[j + 1]).compareTo(arreglo[j]) < 0) {
                    Object auxiliar = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = auxiliar;
                }
                count2++;
            }
        }
    }

    public static void main(String[] args) {

        //String [] productos = new String[7];
        String[] productos = {"Kinstong Pendrive 64GV", "Samsung Galaxy",
                "Disco duro SSD Samsung Externo", "Asus NoteBook",
                "MacBook Air", "Chromecast 4ta generación", "Bicicleta Oxford"};


        int count = productos.length;
        //llamamos al metodo
        sortBurbuja(productos);

        System.out.println("==== Usando for =====");
        for (int i = 0; i < count; i++) {
            System.out.println("Para indice " + i + " : " + productos[i]);
        }

        Integer[] numeros = new Integer[4];


        numeros[0] = 10;
        numeros[1] = Integer.valueOf("7");
        numeros[2] = 35;
        numeros[3] = -1;

        sortBurbuja(numeros);

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("numeros = " + numeros[i]);
        }
    }
}