package main.java.methods;

public class ArrayPositiveOnes {

    public static int positiveOnes(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                sum = sum + arr[i];
            }
        }
        return sum;
    }

}


