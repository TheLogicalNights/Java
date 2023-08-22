package SinglyLinkedList;

import java.util.Stack;

public class SinglyLinkedList {
    private Node head;

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

    public void addNewNodeToList(SinglyLinkedList list, int data) {
        Node newNode = new Node(data);

        if (list.head == null) {
            list.head = newNode;
        } else {
            Node temp = list.head;
            while (temp.next != null) {
                temp = temp.next;
            }

            temp.next = newNode;
        }

    }

    public void reverseLinkedList(SinglyLinkedList list) {
        Node temp = list.head;
        Stack<Integer> stack = new Stack<>();

        while (temp != null) {
            stack.push(temp.getData());
            temp = temp.next;
        }

        temp = list.head;

        while (temp != null) {
            int data = stack.pop();
            temp.setData(data);
            temp = temp.next;
        }

    }

    public int nodeAtGivenIndex(int index) {
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }

        return temp.getData();
    }

    public void deleteFirstNode(SinglyLinkedList list) {
        Node temp = list.head;

        list.head = list.head.next;

        temp.next = null;
    }

    public void deleteLastNode(SinglyLinkedList list) {
        Node temp = list.head;

        while (temp.next.next != null) {
            temp = temp.next;
        }

        temp.next = null;
    }

    public void deleteNthNode(int index) {
        Node temp = head;
        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }
        Node delete = temp.next;

        temp.next = delete.next;

        delete.next = null;
    }

    public void addNodeInSortedManner(SinglyLinkedList list, int data) {
        Node newNode = new Node(data);

        if (list.head == null) {
            list.head = newNode;
        } else if (list.head.data >= newNode.getData()) {
            newNode.next = list.head;
            list.head = newNode;
        } else {
            Node temp = list.head;
            while (temp.next != null && temp.next.data < newNode.getData()) {
                temp = temp.next;
            }

            if (temp.next != null) {
                newNode.next = temp.next;
            }

            temp.next = newNode;
        }
    }

    /**
     * Finds fractional (n/k)th element of a linkedList, where n is the length of an array, and k is parameter value.
     *
     * @param list
     * @param k
     * @return
     */
    public int findFractionalNode(SinglyLinkedList list, int k) {
        Node temp = list.head;
        int listSize = 0;

        while (temp != null) {
            temp = temp.next;
            listSize++;
        }

        int index = (int) Math.ceil((double) listSize / k);

        temp = head;
        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }

        return temp.getData();
    }

    public int nThNodeFromEnd(SinglyLinkedList list, int n) {
        Node temp = list.head;
        int listSize = 0;

        while (temp != null) {
            temp = temp.next;
            listSize++;
        }

        if (n < 0 || n > listSize) {
            return 0;
        }

        int index = listSize - n;
        temp = list.head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }

        return temp.data;
    }

    public void displayList(SinglyLinkedList list) {
        Node temp = list.head;

        while (temp != null) {
            System.out.println(temp.getData());
            temp = temp.next;
        }
    }
}
