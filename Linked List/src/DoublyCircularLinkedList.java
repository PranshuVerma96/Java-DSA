
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
  // Insertion At tail
    public void insertAtTail(int data){
        Node newNode = new Node(data);

        // case 1 Empty list
        if(head == null){
            head = newNode;
            tail = newNode;

            head.prev = tail;
            tail.next = head;
        }

        // case 2 Non empty linked list
        else {
            newNode.prev = tail;
            newNode.next = head;

            tail.next = newNode;
            head.prev = newNode;

            tail = newNode;


        }
        size++;
    }

    // Insertion At Position
    public  void insertAtPosition(int position , int data){
        // Valid position
        if(position < 1 || position >size+ 1){
            System.out.println("Invalid postion ");
            return;
        }
        if(position == 1){
            insertAtHead(data);
            return;
        }
        if(position ==size+1){
            insertAtTail(data);
            return;
        }
        Node preNode = head;
        for(int i =1; i<=position-2; i++){
            preNode = preNode.next;
        }
        Node curNode = new Node(data);
        Node nextNode = preNode.next;

        preNode.next = curNode;
        curNode.prev = preNode;

        nextNode.prev = curNode;
        curNode.next = nextNode;

        size++;

    }

