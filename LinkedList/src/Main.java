import SinglyLinkedList.SinglyLinkedList;

public class Main {
    public static void main(String[] args) {
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();


        singlyLinkedList.addNewNodeToList(singlyLinkedList, 1);
        singlyLinkedList.addNewNodeToList(singlyLinkedList, 2);
        singlyLinkedList.addNewNodeToList(singlyLinkedList, 3);
        singlyLinkedList.addNewNodeToList(singlyLinkedList, 4);

        singlyLinkedList.displayList(singlyLinkedList);

    }
}