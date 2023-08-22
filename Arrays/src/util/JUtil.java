package util;

import java.util.Scanner;

public class JUtil {
    private static final Scanner scanner = new Scanner(System.in);

    public static int getIntegerInput() {
        return scanner.nextInt();
    }

    public static int[] getInteger1DArray() {
        System.out.println("Enter how many elements you want:");
        int n = getIntegerInput();
        int[] numberArray = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            numberArray[i] = JUtil.getIntegerInput();
        }

        return numberArray;
    }

    public static int[][] getInteger2DArray() {
        System.out.println("Enter how many rows you want:");
        int rows = getIntegerInput();
        System.out.println("Enter how many columns you want:");
        int columns = getIntegerInput();
        int[][] numberArray = new int[rows][columns];
        System.out.println("Enter the elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                numberArray[i][j] = JUtil.getIntegerInput();
            }
        }

        return numberArray;
    }
}
