package NextGreaterElement;

import util.JUtil;

public class Main {
    public static void main(String[] args) {
        NextGreaterElement nextGreaterElement = new NextGreaterElement();
        int[] numberArray = JUtil.getInteger1DArray();

        nextGreaterElement.nextGreaterElement(numberArray);
    }
}
