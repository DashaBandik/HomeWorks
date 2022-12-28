package by.belhard;

import java.util.Arrays;

public class ForArray {
    public static void main(String[] args) {
    IntArray one = new IntArray(12);

    int [] newArr = new int []{3,9,0,17};
    IntArray two = new IntArray(newArr);

    IntArray three = new IntArray();

    two.sort(7);
    two.sort(0);

    int [] x = two.getArrayNum();
        System.out.println(Arrays.toString(x));
        two.setArrayNum(new int[] {1,2,3});
        int [] y = two.getArrayNum();
        System.out.println(Arrays.toString(y));

    }
}
