package Cwiczenie1;

import java.util.Arrays;
import java.util.function.Predicate;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class zadaniaDlaChetnych {
    public static void main(String[] args) {
        int[] newTable= {5,8,19,2,4,22,31,9};
        String [] newStringTable={"Michal","Adam","tablicaString","tablicaInt","Integer"};

        //wypiszCoDrugiElement(newTable);
        wypiszParzysteLubNieParzysteElementy(newTable,false);
        wypiszDwaNajdluzszeElementy(newStringTable);

    }

    private static void wypiszDwaNajdluzszeElementy(String[] newStringTable) {
        for (int i = 0; i < newStringTable.length; i++) {
            if(i==3){
                break;
            }
            for(int x=i;x<newStringTable.length;x++){

            }
        }

    }


    private static void wypiszParzysteLubNieParzysteElementy(int[] newTable, boolean czyParzystaLiczba) {
        for (int i = 0; i < newTable.length; i++) {
            if(czyParzystaLiczba==true){
            if(i%2==0){
                System.out.println(newTable[i]);
            }}else{
                if(i%2!=0){
                System.out.println(newTable[i]);}
            }
            
       
        }
    }

    private static void wypiszCoDrugiElement(int[] newTable) {
        for (int i = 0; i < newTable.length; i++) {
            if(i%2==0){
                System.out.println(newTable[i]);
            }
        }

    }



}
