package KthSmallestLargestNumber;

import util.JUtil;

public class Main {
    public static void main(String[] args) {
        KthSmallestLargestElement kthSmallestLargestElement = new KthSmallestLargestElement();
        int[] numberArray = JUtil.getIntegerArray();
        System.out.println("Enter the value of k:");
        int k = JUtil.getIntegerInput();

        int retVal = kthSmallestLargestElement.kThSmallestLargestNumber(numberArray, k);

        System.out.println("Kth smallest/largest element is: " + retVal);
    }
}
