package SpecialStack;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        SpecialStack stack = new SpecialStack();

        stack.push(1);
        stack.push(2);
        stack.push(0);
        stack.pop();
        stack.push(4);

        System.out.println(stack.getMin());
    }
}
