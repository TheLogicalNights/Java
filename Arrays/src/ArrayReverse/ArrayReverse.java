/*
    Given an array (or string), the task is to reverse the array/string.
    Examples :
        Input  : arr[] = {1, 2, 3}
            Output : arr[] = {3, 2, 1}

        Input :  arr[] = {4, 5, 1, 2}
            Output : arr[] = {2, 1, 5, 4}
*/
package ArrayReverse;

public class ArrayReverse {

    public int[] arrayReverse(int[] numberArray, int arraySize) {
        for (int i = 0, j = arraySize - 1; i < j; i++, j--) {
            int temp = numberArray[i];
            numberArray[i] = numberArray[j];
            numberArray[j] = temp;
        }

        return numberArray;
    }
}
