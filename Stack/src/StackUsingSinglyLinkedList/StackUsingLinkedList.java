package StackUsingSinglyLinkedList;

public class StackUsingLinkedList {
    private Node top;

    public StackUsingLinkedList() {
        this.top = null;
    }

    static class Node {
        private int data;
        private Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }

        public void setData(int data) {
            this.data = data;
        }

        public int getData() {
            return this.data;
        }
    }

    public void push(int data) {
        Node newNode = new Node(data);

        if (top == null) {
            top = newNode;
        } else {
            newNode.next = top;
            top = newNode;
        }

        System.out.println(data + " is pushed on the stack");
    }

    public int peek() {
        int peekedValue = Integer.MIN_VALUE;
        if (top == null) {
            System.out.println("Stack is empty");
        } else {
            peekedValue = top.data;
            System.out.println(peekedValue + " is the top of stack");
        }

        return peekedValue;
    }

    public int pop() {
        int poppedValue = Integer.MIN_VALUE;
        if (top == null) {
            System.out.println("Stack is empty");
        } else {
            poppedValue = top.data;
            top = top.next;
            System.out.println(poppedValue + " is popped from stack");
        }

        return poppedValue;
    }
}
