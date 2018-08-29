package Cwiczenie1;

public class sortowanieBabelkowe {
    public static void main(String[] args) {
        int [] numberTable= {5,8,2,19,6,30,22,1,4,8,12};
        showTable(sortowanie(numberTable,false));


    }

    private static void showTable(int[] numberTable) {
        for (int x:numberTable
             ) {
            System.out.println(x);

        }
    }





    private static int[] sortowanie(int[] numberTable,boolean Ascending) {
        int wartosc;
        int index=0;

        for (int i = 0; i < numberTable.length; i++) {

            if (Ascending==true){
                for (int j = i+1; j < numberTable.length; j++) {
                if (numberTable[i] >= numberTable[j]) {
                    swap(numberTable, i, j);
                }
            }}

            if (Ascending==false){
                for (int j = i+1; j < numberTable.length; j++) {
                    if (numberTable[i] <= numberTable[j]) {
                        swap(numberTable, i, j);
                    }
                }

            }


        }
 return numberTable;
        }

    public static void swap(int[] numberTable, int indexA,int indexB){
          int wartoscA;

      wartoscA= numberTable[indexA];
       numberTable[indexA]=numberTable[indexB];
        numberTable[indexB]=wartoscA;



    }


    }



