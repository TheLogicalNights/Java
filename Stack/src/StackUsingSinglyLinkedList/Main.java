package StackUsingSinglyLinkedList;

import StackUsingSinglyLinkedList.StackUsingLinkedList;

public class Main {
    public static void main(String[] args) {
        StackUsingLinkedList stack = new StackUsingLinkedList();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        int poppedValue = stack.pop();
        int peekedValue = stack.peek();

    }
}