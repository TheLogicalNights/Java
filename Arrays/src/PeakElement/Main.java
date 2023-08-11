package PeakElement;

import util.JUtil;

import javax.print.attribute.standard.JobHoldUntil;

public class Main {

    public static void main(String[] args) {
        int[] numberArray = JUtil.getIntegerArray();
        PeakElement peakElement = new PeakElement();
        int peakElementInArray = peakElement.peakElementInArray(numberArray, numberArray.length);
        System.out.println("Peak element in an array is: " + peakElementInArray);
    }
}
