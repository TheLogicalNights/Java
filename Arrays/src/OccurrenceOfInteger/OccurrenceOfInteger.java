/*
    Given a sorted array arr[] and a number x, write a function that counts the occurrences of x in arr[].
    Expected time complexity is O(Logn)

        Examples:
        Input: arr[] = {1, 1, 2, 2, 2, 2, 3,},   x = 2
        Output: 4 // x (or 2) occurs 4 times in arr[]

        Input: arr[] = {1, 1, 2, 2, 2, 2, 3,},   x = 3
        Output: 1

        Input: arr[] = {1, 1, 2, 2, 2, 2, 3,},   x = 1
        Output: 2

        Input: arr[] = {1, 1, 2, 2, 2, 2, 3,},   x = 4
        Output: -1 // 4 doesn't occur in arr[]
*/
package OccurrenceOfInteger;

public class OccurrenceOfInteger {

    public int occurrenceOfInteger(int[] numberArray, int k) {
        int firstOccurrence = search(numberArray, k, true);
        int lastOccurrence = search(numberArray, k, false);

        return (firstOccurrence == -1 || lastOccurrence == -1) ? 0 : lastOccurrence - firstOccurrence + 1;
    }

    private int search(int[] numberArray, int k, boolean searchFirstOccurrence) {
        int occurrence = -1;
        int start = 0;
        int end = numberArray.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (k < numberArray[mid]) {
                end = mid - 1;
            } else if (k > numberArray[mid]) {
                start = mid + 1;
            } else {
                occurrence = mid;
                if (searchFirstOccurrence) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }

        return occurrence;
    }
}
