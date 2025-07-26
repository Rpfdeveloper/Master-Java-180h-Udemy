package Arreglos;

import java.util.Arrays;

public class EjemploArreglosForInverso {
    public static void main(String[] args) {

        //String [] productos = new String[7];
        String [] productos = {"Kinstong Pendrive 64GV","Samsung Galaxy",
                "Disco duro SSD Samsung Externo", "Asus NoteBook",
                "MacBook Air", "Chromecast 4ta generación", "Bicicleta Oxford"};

        int count = productos.length;

        /*productos[0] = "Kinstong Pendrive 64GV";
        productos[1] = "Samsung Galaxy";
        productos[2] = "Disco duro SSD Samsung Externo";
        productos[3] = "Asus NoteBook";
        productos[4] = "MacBook Air";
        productos[5] = "Chromecast 4ta generación";
        productos[6] = "Bicicleta Oxford";*/

        Arrays.sort(productos);

        System.out.println("==== Usando for =====");
        for (int i = 0; i < count; i++){
            System.out.println("Para indice " + i + " : " + productos[i]);
        }

        System.out.println("==== Usando for inverso =====");
        for(int i = 0; i < count; i++){
            System.out.println("Para i = " + (count - 1 - i) + " valor " + productos[count - 1 - i]);

        }

        System.out.println("==== Usando for inverso 2 =====");
        for(int i = count - 1; i >= 0; i--){
            System.out.println("Para i = " + i + " valor " + productos[i]);
        }

    }
}