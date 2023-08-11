package util;
import java.util.Scanner;
public class JUtil {
    private static final Scanner scanner = new Scanner(System.in);
    protected static int getIntegerInput() {
        return scanner.nextInt();
    }

    public static int[] getIntegerArray() {
        System.out.println("Enter how many elements you want:");
        int n = getIntegerInput();
        int[] numberArray = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            numberArray[i] = JUtil.getIntegerInput();
        }

        return numberArray;
    }
}
