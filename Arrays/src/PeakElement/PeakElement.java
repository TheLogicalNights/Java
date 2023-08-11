/*
    Given an array arr[] of integers. Find a peak element i.e. an element that is not smaller than its neighbors.
    Note: For corner elements, we need to consider only one neighbor.
    Examples:
         Input: array[]= {5, 10, 20, 15}
            Output: 20
            Explanation: The element 20 has neighbors 10 and 15, both of them are less than 20.
*/

package PeakElement;

import java.util.Scanner;

public class PeakElement {
    public int peakElementInArray(int[] arr, int n) {
        int peakElement = 0;
        if (n == 1) {
            return 0;
        }
        if (arr[0] > arr[1]) {
            return arr[0];
        }
        if (arr[n - 1] > arr[n - 2]) {
            return arr[n - 1];
        }

        for (int i = 1; i <= n - 2; i++) {
            if ((arr[i] > arr[i - 1]) && (arr[i] > arr[i + 1])) {
                peakElement = arr[i];
                break;
            }
        }
        return peakElement;
    }
}