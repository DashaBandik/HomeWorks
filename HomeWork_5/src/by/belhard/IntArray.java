package by.belhard;

import java.util.Arrays;

public class IntArray {
    private int[] arrayNum;


    IntArray(int arraySize) {
        arrayNum = new int[arraySize];
    }

    IntArray(int[] arrayNum) {
        this.arrayNum = arrayNum;
    }

    IntArray() {
        arrayNum = new int[10];
    }


    void sort(int number) {
        if (number > 0) {
            for (int i = 0; i < arrayNum.length; i++) {
                for (int j = 0; j < arrayNum.length - 1; j++) {
                    if (arrayNum[j] > arrayNum[j + 1]) {
                        int maxNum = arrayNum[j];
                        arrayNum[j] = arrayNum[j + 1];
                        arrayNum[j + 1] = maxNum;

                    }
                }
            }
            System.out.println("По возрастанию: " + Arrays.toString(arrayNum));
        } else {
            for (int i = 0; i < arrayNum.length; i++) {
                for (int j = 0; j < arrayNum.length - 1; j++) {
                    if (arrayNum[j] < arrayNum[j + 1]) {
                        int minNum = arrayNum[j];
                        arrayNum[j] = arrayNum[j + 1];
                        arrayNum[j + 1] = minNum;
                    }
                }
            }
            System.out.println("По убыванию: " + Arrays.toString(arrayNum));
        }
    }

    public int[] getArrayNum() {
        return arrayNum;
    }

    public void setArrayNum(int[] arrayNum) {
        this.arrayNum = arrayNum;
    }
}
