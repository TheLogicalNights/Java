package PeakElement;

import util.JUtil;

public class Main {

    public static void main(String[] args) {
        int[] numberArray = JUtil.getInteger1DArray();
        PeakElement peakElement = new PeakElement();
        int peakElementInArray = peakElement.peakElementInArray(numberArray, numberArray.length);
        System.out.println("Peak element in an array is: " + peakElementInArray);
    }
}
