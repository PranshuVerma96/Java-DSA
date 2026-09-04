
public class DoublyCircularLinkedList {
    static class Node{
        int data;
        Node prev;
        Node next;

        Node(int data){
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }

    private Node head;
    private Node tail;
    private int size = 0;

    public DoublyCircularLinkedList(){
        head = null;
        tail = null;
        size = 0;
    }

     //============================
    // Insertion
    //============================

    // Insertion At head
    public void insertAtHead(int data){

        Node newNode = new Node(data);

        // Case 1 Empty linked list
        if(head == null){
            head = newNode;
            tail = newNode;

            // circular connection
            head.prev = tail;
            tail.next = head;

        }

        // case 2 Non Empty linked list
        else {
            newNode.next = head;
            newNode.prev = tail;

            head.prev = tail;
            tail.next = newNode;

            head = newNode;

            size++;


        }

    }
