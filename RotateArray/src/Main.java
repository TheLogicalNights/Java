/*      Rotate an array of n elements to the right by k steps.
        For example, with n = 7 and k = 3, the array [1,2,3,4,5,6,7] is rotated to [5,6,7,1,2,3,4].
 */


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        RotateArray rotateArray = new RotateArray();

        System.out.println("Enter number of elements");
        int n = cin.nextInt();

        int[] numbers = new int[n];

        System.out.println("Enter elements :");
        for (int i = 0; i < n; i++) {
            numbers[i] = cin.nextInt();
        }

        System.out.println("Enter number of steps:");
        int k = cin.nextInt();

        int[] result = rotateArray.rotateArray(numbers, k);

        for (int i : result) {
            System.out.print("[ " + i + " ]");
        }
    }
}