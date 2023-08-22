package MinMaxElement;

import util.JUtil;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        MinMaxElement minMaxElement = new MinMaxElement();
        int[] numberArray = JUtil.getInteger1DArray();
        HashMap<String, Integer> minMaxNumbersInArray = minMaxElement.minMaxElement(numberArray, numberArray.length);
        System.out.println("Min Number: " + minMaxNumbersInArray.get("min")
                + " Max Number: " + minMaxNumbersInArray.get("max")
        );
    }
}
