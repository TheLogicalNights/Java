package ArrayReverse;


import util.JUtil;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayReverse arrayReverse = new ArrayReverse();
        int[] numberArray = JUtil.getIntegerArray();
        int[] reversedArray = arrayReverse.arrayReverse(numberArray, numberArray.length);

        System.out.println(Arrays.toString(reversedArray));
    }
}
