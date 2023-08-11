package MinMaxElement;

import java.util.HashMap;

public class MinMaxElement {
    public HashMap<String, Integer> minMaxElement(int[] arr, int n) {
        HashMap<String, Integer> minMaxElementInArray = new HashMap<>();
        int min = arr[0];
        int max = arr[0];
        for (int i = 0; i < n; i++) {
            min = min(min, arr[i]);
            max = max(max, arr[i]);
        }
        minMaxElementInArray.put("min", min);
        minMaxElementInArray.put("max", max);
        return minMaxElementInArray;
    }


    private int min(int numberOne, int numberTwo) {
        return Math.min(numberOne, numberTwo);
    }

    private int max(int numberOne, int numberTwo) {
        return Math.max(numberOne, numberTwo);
    }
}
