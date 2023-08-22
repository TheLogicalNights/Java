package ArraySortSelectionSort;

import util.JUtil;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        SelectionSort selectionSort = new SelectionSort();
        int[] numberArray = JUtil.getInteger1DArray();

        int[] sortedArray = selectionSort.arraySort(numberArray, numberArray.length);

        System.out.println(Arrays.toString(sortedArray));
    }
}
