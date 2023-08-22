package MaximumOfAllSubArrays;

import util.JUtil;

public class Main {
    public static void main(String[] args) {
        MaximumOfAllSubArrays maximumOfAllSubArrays = new MaximumOfAllSubArrays();
        int[] numberArray = JUtil.getInteger1DArray();
        System.out.println("Enter the value of k");
        int k = JUtil.getIntegerInput();

        maximumOfAllSubArrays.maximumOfAllSubArrays(numberArray, k);
    }
}
