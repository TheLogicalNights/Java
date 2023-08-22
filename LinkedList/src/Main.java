import SinglyLinkedList.SinglyLinkedList;

public class Main {
    public static void main(String[] args) {
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();

//        singlyLinkedList.addNodeInSortedManner(singlyLinkedList, 6);
//        singlyLinkedList.addNodeInSortedManner(singlyLinkedList, 2);
//        singlyLinkedList.addNodeInSortedManner(singlyLinkedList, 1);
//        singlyLinkedList.addNodeInSortedManner(singlyLinkedList, 3);
//        singlyLinkedList.addNodeInSortedManner(singlyLinkedList, 5);
//        singlyLinkedList.addNodeInSortedManner(singlyLinkedList, 4);

        singlyLinkedList.addNewNodeToList(singlyLinkedList, 1);
        singlyLinkedList.addNewNodeToList(singlyLinkedList, 2);
        singlyLinkedList.addNewNodeToList(singlyLinkedList, 3);
        singlyLinkedList.addNewNodeToList(singlyLinkedList, 4);

        System.out.println(singlyLinkedList.nThNodeFromEnd(singlyLinkedList, 4));

    }
}