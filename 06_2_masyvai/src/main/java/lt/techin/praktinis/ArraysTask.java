package lt.techin.praktinis;

import java.util.Enumeration;

public class ArraysTask {


    public static void main(String[] args) {
        // Įgyvendikite visus metodus (turi pažaliuoti unit testai)
        // Pateiktas masyvas ir pavyzdys programos patikrinimui. Masyvo elementų reikšmes galite keisti.

        int[] arr = {3, 2, 1, 4, 6, 5};
        int minMark = getMin(arr);
        int n = 4;
        getFirstElement(arr);
        getLastElement(arr);
        getMin(arr);
        getMax(arr);
        getSum(arr);
        getAverage(arr);
        countElements(arr,n);
    }

    //Metodas turi grąžinti pirmą masyvo elementą
     public static int getFirstElement(int[] arr){
        //TODO

        return arr[0];
    }

    //Metodas turi grąžinti paskutinį masyvo elementą
    public static int getLastElement(int[] arr) {
        //TODO

        return arr[arr.length -1] ;
    }

    //Raskite mažiausią masyvo elementą
    public static int getMin(int[] arr) {
        //TODO
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        return min;
    }

    //Raskite didžiausią masyvo elementą
    public static int getMax(int[] arr) {
        //TODO
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >max) {
                max = arr[i];
            }
        }

        return max;
    }

    //Suskaičiuokite masyvo elementų sumą
    public static int getSum(int[] arr) {
        //TODO

        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            total = total + arr[i];
        }

        return total;
    }

    //Raskite masyvo elementų vidurkį
    public static int getAverage(int[] arr) {
        //TODO

        int total = 0;
        int count = arr.length;
        double avg = 0;
        for (int i = 0; i < arr.length; i++) {
            total = total + arr[i];
            avg = (double) total / count;
        }

        return 0;
    }

    //Suskaičiuokite kiek masyve yra skaičių, didesnių nei duotas skaičius n
    public static int countElements(int[] arr, int n) {
        //TODO
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>n) {
                count++;
            }
        }

        return count;
    }

    //Metodas turi grąžinti true, jei masyve yra elementas kurio reikšmė lygi n
    public static boolean contains(int[] arr, int n) {
        //TODO

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == n) {
                return true;
            }
        }
        return false;
    }

    //Raskite elemento kurio reikšmė lygi n paskutinį indeksą
    public static int lastIndexOf(int[] arr, int n) {
        //TODO

        int lastIndex = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == n) {
                lastIndex = i;
            }

        }
        return lastIndex;
    }






}
