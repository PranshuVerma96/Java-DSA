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

    //========================================================
    //Insertion
    //=======================================================

    //Insertion At Head
    public void insertAtHead(int data) {
        Node newNode = new Node(data);

        // case 1 linked list is empty
        if (head == null) {
            head = newNode;
            tail = newNode;

            // circular correction
            tail.next = head;
        } else {
            newNode.next = head;
            head = newNode;

            // Maintain circular connection
            tail.next = head;
        }

        // size increase
        size++;
    }
     // Insertion At Tail
    public void insertAtTail(int data) {
        Node newNode = new Node(data);

        // Case 1 Empty linked list
        if (head == null) {
            head = newNode;
            tail = newNode;
            tail.next = head;
        }
        // case 2 Non empty linked list
        else {
            tail.next = newNode;
            tail = newNode;
            tail.next = head;
        }
        size++;
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


