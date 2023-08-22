package WavedAray;

import util.JUtil;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        WavedArray wavedArray = new WavedArray();
        int[] numberArray = JUtil.getInteger1DArray();
        numberArray = wavedArray.wavedArray(numberArray);

        System.out.println(Arrays.toString(numberArray));
    }

}
