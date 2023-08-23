package SpecialStack;

import java.util.Stack;

public class SpecialStack extends Stack<Integer> {
    Stack<Integer> minValuedStack = new Stack<>();

    public void push(int data) {
        if (isEmpty()) {
            super.push(data);
            minValuedStack.push(data);
        } else {
            super.push(data);
            int minStackValue = minValuedStack.peek();

            if (minStackValue > data) {
                minValuedStack.push(data);
            } else {
                minValuedStack.push(minStackValue);
            }
        }
    }

    public Integer pop() {
        minValuedStack.pop();
        return super.pop();
    }
    public int getMin() {
        return minValuedStack.peek();
    }
}
