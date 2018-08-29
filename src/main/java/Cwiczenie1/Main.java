package Cwiczenie1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        int[] numberTable = {7, 6, 1, 3, 8, 10, 13, 2};

        //System.out.println(findMin(numberTable));
        //System.out.println(findMax(numberTable));
       // reverseTable(numberTable);
        //showReverseTable(reverseTable(numberTable));
        //showArray(doubleTable(numberTable));
        showArray(numberTable);
        showArray(changePlaceInArray(numberTable));



    }

    private static int[] changePlaceInArray(int[] numberTable) {
        int maxValue = 0;
        int minValue = 0;
        int maxIndex = 0;
        int minIndex=0;
        minValue = findMin(numberTable);
        maxValue = findMax(numberTable);

        for (int i = 0; i < numberTable.length; i++) {
            if (maxValue == numberTable[i]) {
                maxIndex = i;
            }

        }

        for (int i = 0; i < numberTable.length; i++) {
            if (minValue == numberTable[i]) {
                minIndex = i;
            }
        }
        numberTable[minIndex]=maxValue;
        numberTable[maxIndex]=minValue;
        return numberTable;
    }
    private static int[] doubleTable(int[] numberTable) {
        int counter=0;
        int[] nowaTablica = new int[numberTable.length];
        //IntStream.of(numberTable).forEach(x-> System.out.println(x*2));

        for (int x=0;x<numberTable.length;x++) {
            nowaTablica[x]=numberTable[x]*2;

        }
    return  nowaTablica;
    }

    private static void showReverseTable(int[] ints) {
        for (int x: ints
             ) {
            System.out.println("elementy tablicy odwrotnej: " +x);

        }
    }

    private static int[] reverseTable(int[] numberTable) {
    int zmiennaPomocnicza=numberTable.length-1;
    int[] tablicaPomocnicza=new int[numberTable.length];

    for(int counter=0;counter<numberTable.length;counter++){

        tablicaPomocnicza[counter]=numberTable[zmiennaPomocnicza] ;
        zmiennaPomocnicza--;
    }


    return tablicaPomocnicza;
    }

    private static Integer findMin(int[] lista) {
        int zmiennaPomocnicza = lista[0];
        boolean zmiennaLogiczna = false;


        for (int counter = 1; counter < lista.length; counter++) {



            if (zmiennaPomocnicza > lista[counter]) {
                zmiennaPomocnicza = lista[counter];
                zmiennaPomocnicza=lista[counter];

            }

        }
        return zmiennaPomocnicza;
    }

    private static Integer findMax(int[] lista) {
        int zmiennaPomocnicza = lista[0];
        boolean zmiennaLogiczna = false;

        for (int counter = 1; counter < lista.length; counter++) {



                if (zmiennaPomocnicza < lista[counter]) {

                    zmiennaPomocnicza=lista[counter];

            }

        }
        return zmiennaPomocnicza;
    }
    public static void showArray(int[] tablica){
        System.out.println();
        for (int x:tablica
             ) {
                        System.out.print(x + " ");

        }
    }
}


