package NextGreaterElement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NextGreaterElement {

    public void nextGreaterElement(int[] numberArray) {
        int j = 0;
        System.out.println("Entered Array: " + Arrays.toString(numberArray));
        for (int i = 0; i < numberArray.length; i++) {
            for (j = i + 1; j < numberArray.length; j++) {
                if (numberArray[i] < numberArray[j]) {
                    System.out.println("Next greater element of: " + numberArray[i] + " is --> " + numberArray[j]);
                    break;
                }
            }
            if (j == numberArray.length) {
                System.out.println("Next greater element of: " + numberArray[i] + " is --> -1");
            }
        }
    }
}
