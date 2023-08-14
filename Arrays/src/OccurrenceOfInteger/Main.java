package OccurrenceOfInteger;

import util.JUtil;

public class Main {

    public static void main(String[] args) {
        OccurrenceOfInteger occurrence = new OccurrenceOfInteger();
        int[] numberArray = JUtil.getIntegerArray();
        System.out.println("Enter a number");
        int k = JUtil.getIntegerInput();

        int numberOfOccurrence = occurrence.occurrenceOfInteger(numberArray, k);
        System.out.println("Number of occurrences of " + k + " in an array are: " + numberOfOccurrence);
    }
}
