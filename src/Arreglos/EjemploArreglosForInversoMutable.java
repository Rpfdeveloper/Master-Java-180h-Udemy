package Arreglos;

import java.util.Arrays;

public class EjemploArreglosForInversoMutable {

    public static void arregloInverso(String[] arreglo){
        int count = arreglo.length;
        int count2 = arreglo.length;
        for (int i = 0; i < count2; i++){
            String actual = arreglo[i];
            String inverso = arreglo[count - 1 - i];
            arreglo[i] = inverso;
            arreglo[count - 1 - i] = actual;
            count2--;
        }
    }

    public static void main(String[] args) {

        //String [] productos = new String[7];
        String [] productos = {"Kinstong Pendrive 64GV","Samsung Galaxy",
                "Disco duro SSD Samsung Externo", "Asus NoteBook",
                "MacBook Air", "Chromecast 4ta generación", "Bicicleta Oxford"};

        int count = productos.length;

        Arrays.sort(productos);
        arregloInverso(productos);

        //Collections.reverse(Arrays.asList(productos));

        System.out.println("==== Usando for =====");
        for (int i = 0; i < count; i++){
            System.out.println("Para indice " + i + " : " + productos[i]);
        }
    }
}