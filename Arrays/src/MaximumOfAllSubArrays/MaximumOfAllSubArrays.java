/*
    Given an array arr[] of size N and an integer K. Find the maximum for each and every contiguous subarray of size K.

    Example:

    Input:
        N = 9, K = 3
        arr[] = 1 2 3 1 4 5 2 3 6
    Output:
        3 3 4 5 5 5 6
    Explanation:
        1st contiguous subarray = {1 2 3} Max = 3
        2nd contiguous subarray = {2 3 1} Max = 3
        3rd contiguous subarray = {3 1 4} Max = 4
        4th contiguous subarray = {1 4 5} Max = 5
        5th contiguous subarray = {4 5 2} Max = 5
        6th contiguous subarray = {5 2 3} Max = 5
        7th contiguous subarray = {2 3 6} Max = 6
*/

package MaximumOfAllSubArrays;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class MaximumOfAllSubArrays {
    public void maximumOfAllSubArrays(int[] numberArray, int k) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < numberArray.length; i++) {
            if (numberArray.length - i >= k){
                int max = 0;
                for (int j = i; j < i+k; j++) {
                    if (numberArray[j] > max) {
                        max = numberArray[j];
                    }
                }
                result.add(max);
            } else {
                break;
            }
        }

        System.out.println(result);
    }
}
