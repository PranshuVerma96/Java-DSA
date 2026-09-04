public class SinglyCircularLinkedList {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }

    }

    private Node head;
    private Node tail;
    private int size;

     public SinglyCircularLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }


    public static void main(String[] args) {
        SinglyCircularLinkedList myList = new SinglyCircularLinkedList();

        myList.insertAtHead(10);
        myList.insertAtHead(20);

        myList.insertAtHead(30);
        myList.insertAtTail(40);

        myList.insertAtPosition(3,50);

        myList.deletionAtHead();
        myList.deleteTail();

        myList.deleteAtPosition(2);

        myList.printList();
//        System.out.println(myList.search(40));
    }

}


