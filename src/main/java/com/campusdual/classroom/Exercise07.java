package com.campusdual.classroom;


import java.util.ArrayList;
import java.util.List;

public class Exercise07 {

    public static void main(String[] args) {
        positionInAList(3);
        sumFirstNaturalNumbers(3);
        showFirstNaturalNumbers(3);
    }

    //TODO ↓
    // ESTE MÉTODO NO ES NECESARIO HACERLO POR PARTE DE LOS ALUMNOS
    // Crear una List<Integer> con los números del 10 al 1. Luego buscar el elemento
    // que se le pasa por parámetro.
    // Si lo encuentra, que imprima el siguiente mensaje → El elemento X se encuentra en la posición: Y
    // Si NO lo encuentra, que imprima el siguiente mensaje → El elemento X no se encuentra en la lista.
    public static void positionInAList(int num) {
        List<Integer> l = new ArrayList<>();
        for (int i = 0; i <= 10; i++) {
            l.add(i);
        }

        int pos = l.indexOf(num);

        if(pos != -1){
            System.out.println("El elemento "+ num +
                    " se encuentra en la posición: "+ pos);
        }else{
            System.out.println("El elemento "+num+
                    " no se encuentra en la lista.");
        }
    }

    //TODO ↓
    // Que imprima como mensaje la suma de los primeros N números positivos
    public static void sumFirstNaturalNumbers(int num) {
        int sum = 0;
        for (int i = 1; i <= num ; i++) {
            sum += i;
        }
        System.out.println("La suma de los primeros "+num+" numeros naturales es: "+sum);

        /*ArrayList<Integer> l = new ArrayList<>();
        int suma = 0;
        for (int i = 10; i > 0; i--) {
            l.add(i);
        }

        for(int i = 1; i <= num; i++){
            if(l.get(i) > 0){
                suma = suma + l.get(i);
            }else{
                System.out.println("");
            }

        }
        System.out.println(suma);*/
    }

    //TODO ↓
    // Que imprima por pantalla los N primeros números positivos
    public static void showFirstNaturalNumbers(int num) {
        System.out.println("Los primerod "+num+" numeros naturales son: ");
        for (int i = 1; i <= num; i++) {
            System.out.println(i+" ");
        }
        System.out.println();

        /*ArrayList<Integer> l = new ArrayList<>();
        int suma = 0;
        for (int i = 10; i > 0; i--) {
            l.add(i);
        }

        for(int i = 1; i <= num; i++){
            if(l.get(i) > 0){
                System.out.print(l.get(i)+" ");
            }else{
                System.out.println("");
            }

        }*/
    }

}
