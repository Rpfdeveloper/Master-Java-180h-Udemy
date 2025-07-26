package Arreglos;

import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class EjemploArreglosFor {
    public static void main(String[] args) {

        String [] productos = new String[7];
        int count = productos.length;

        productos[0] = "Kinstong Pendrive 64GV";
        productos[1] = "Samsung Galaxy";
        productos[2] = "Disco duro SSD Samsung Externo";
        productos[3] = "Asus NoteBook";
        productos[4] = "MacBook Air";
        productos[5] = "Chromecast 4ta generación";
        productos[6] = "Bicicleta Oxford";

        Arrays.sort(productos);

        for (int i = 0; i < count; i++){
            System.out.println("Para indice " + i + " : " + productos[i]);
        }

        System.out.println("==== Usando for each =====");
        for (String prod: productos){
            System.out.println("prod = " + prod);
        }
        System.out.println("===== Usando While =====");
        int i = 0;
        while(i < count){
            System.out.println("Para indice " + i + " : "  + productos[i]);
            i++;
        }

        System.out.println("===== Usando do While =====");
        int j = 0;
        do{
            System.out.println("Para indice " + j + " : "  + productos[j]);
            j++;
        }while(j < count);

        int [] numeros = new int[10];

        int totalNumeros = numeros.length;
        for (int k = 0; k < totalNumeros; k++ ){
            numeros[k] = k*3;
        }

        for (int k = 0; k < totalNumeros; k++ ){
            System.out.println("numeros = " + numeros[k]);
        }
    }
}