package ArraySortSelectionSort;

public class SelectionSort {

    public int[] arraySort(int[] numberArray, int arraySize) {
        // loop for sorted sub-array
        for (int i = 0; i < arraySize; i++) {
            // Setting min index.
            int min_index = i;

            // loop for unsorted elements
            for (int j = i + 1; j < arraySize; j++) {
                // checking for index with min element
                if (numberArray[j] < numberArray[min_index]) {
                    min_index = j;
                }
            }

            // swapping the value at min index with the value at index i
            int temp = numberArray[min_index];
            numberArray[min_index] = numberArray[i];
            numberArray[i] = temp;
        }

        return numberArray;
    }
}
