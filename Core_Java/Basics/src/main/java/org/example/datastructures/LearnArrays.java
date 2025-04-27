package org.example.datastructures;

import java.util.Arrays;

public class LearnArrays {

    private int[] userData;

    public LearnArrays() {
        this.userData = new int[]{};
    }

    public void insertIntoUserData(int valueToBeInserted) {
        /*
         * in this case like this -
         * int[] n = new int[]{};
         * System.out.println(n.length); - result - =0
         */
        int[] temp = new int[]{};
        if (userData.length == 0) {
            temp = new int[userData.length + 1];
            temp[0] = valueToBeInserted;
        } else if (userData.length >= 1) {
            temp = new int[userData.length + 1];
            System.arraycopy(userData, 0, temp, 0, temp.length - 1);
            temp[temp.length - 1] = valueToBeInserted;
        }
        this.userData = temp;
    }

    public void printArray() {
        for (int value : userData) {
            System.out.println(value);
        }
    }

    public static void printArray(int[] givenArray) {
        for (int value : givenArray) {
            System.out.println(value);
        }
    }

    public void deleteValueInArray(int valueToBeDeleted) {
        int[] result = new int[]{};
        if (userData.length > 1) {
            result = new int[userData.length - 1];
            int index = 0;
            for (int userDatum : userData) {
                if (userDatum != valueToBeDeleted) {
                    result[index] = userDatum;
                    index++;
                }
            }
            userData = result;
        } else if (userData.length == 1)
            userData = new int[]{};
        else
            System.out.println("Nothing to remove any value in Array, as array itself is empty");
    }

    public static int[] sortingOfArray(int[] givenArray) {
        Arrays.sort(givenArray); // this array is basically sort with O(n log n) time complexity
        return givenArray;
    }

    public static int[] bubbleSort(int[] givenArray) {
        for (int i = 0; i < givenArray.length; i++) {
            for (int j = i + 1; j < givenArray.length; j++) {
                if (givenArray[i] > givenArray[j]) {
                    int temp = givenArray[j];
                    givenArray[j] = givenArray[i];
                    givenArray[i] = temp;
                }
            }
        }
        return givenArray;
    }

    public static int[] selectionSort(int[] givenArray) {
        int minIndex = -1;
        for (int i = 0; i < givenArray.length; i++) {
            minIndex = i;
            for (int j = i + 1; j < givenArray.length; j++) {
                if (givenArray[minIndex] > givenArray[j]) {
                    minIndex = j;
                }
            }
            int temp = givenArray[minIndex];
            givenArray[minIndex] = givenArray[i];
            givenArray[i] = temp;
        }
        return givenArray;
    }
}
