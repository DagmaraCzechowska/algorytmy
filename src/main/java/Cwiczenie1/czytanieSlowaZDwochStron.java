package Cwiczenie1;

public class czytanieSlowaZDwochStron {
    public static void main(String[] args) {
        String slowo = "kajak";

        //czySlowoCzytaSieTakSamoZDwochStron(slowo);
        boolean rekurencja = isPalindrome(slowo);
        System.out.println(rekurencja);

    }

    private static boolean isPalindrome(String slowo) {
        if (slowo.length() == 1 || slowo.length() == 0) {
            return true;
        }

        if (slowo.charAt(0) == slowo.charAt(slowo.length() - 1)) {
            return isPalindrome(slowo.substring(1, slowo.length() - 1));
        } else {
            return false;
        }
    }

    private static void czySlowoCzytaSieTakSamoZDwochStron(String slowo) {
        int counter = 0;
        for (int i = 0; i < slowo.length(); i++) {


            if (slowo.charAt(i) == slowo.charAt(slowo.length() - 1 - i)) {
                System.out.println(slowo.charAt(i));
                System.out.println(slowo.charAt(slowo.length() - 1 - i));
                counter++;
                System.out.println(slowo.charAt(i));
            }

        }
        if (counter == slowo.length()) {
            System.out.println(slowo + "  czyta sie tak samo z dwóch stron");
        } else {
            System.out.println(slowo + " nie czyta sie tak samo z dwóch stron");
        }
    }


}
