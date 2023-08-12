/*
    Given an array and a number K where K is smaller than the size of the array. Find the K’th
    the smallest element in the given array. Given that all array elements are distinct.
    Examples:
        Input: arr[] = {7, 10, 4, 3, 20, 15}, K = 3
            Output: 7
        Input: arr[] = {7, 10, 4, 3, 20, 15}, K = 4
        Output: 10
*/

package KthSmallestLargestNumber;

public class KthSmallestLargestElement {
    public int kThSmallestLargestNumber(int[] numberArray, int k) {
        if (k>numberArray.length) {
            return 0;
        }
        int[] sortedArray = arraySort(numberArray, numberArray.length);
        return sortedArray[k - 1];
    }

    public int[] arraySort(int[] numberArray, int arraySize) {
        for (int i = 0; i < arraySize; i++) {
            int min_index = i;
            for (int j = i + 1; j < arraySize; j++) {
                if (numberArray[j] < numberArray[min_index]) {
                    min_index = j;
                }
            }

            int temp = numberArray[min_index];
            numberArray[min_index] = numberArray[i];
            numberArray[i] = temp;
        }

        return numberArray;
    }
}
