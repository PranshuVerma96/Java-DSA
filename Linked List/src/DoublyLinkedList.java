public class DoublyLinkedList {
    static class Node {
        int data;
        Node prev;
        Node next;

        //constructor
        Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
    // data member
    private Node head;
    private Node tail;
    private int size;

    DoublyLinkedList(){
        this.head = null;
        this.tail = null;
        this.size = 0;
    }


    // print list
    public void printList(){
        Node temp = head;

        while (temp != null){
            System.out.print(temp.data + "->");
            temp = temp.next;

        }
        System.out.println();
    }
    //================================
    // Insertion
    //================================

    // insert at head
     public void inserAtHead(int data){
        Node newNode = new Node(data);
        // if liked list is empty head and tail ko newNode pr point kardo
        if(head == null  && tail == null){
            head = newNode;
            tail = newNode;
        }
        else {
            newNode.next = head;
           head.prev = newNode;
           // head update
            head = newNode;
        }
        // increase the size by 1
        size++;
    }


    // insert at tail


    // insert at anyPosition



    public static void main(String[] args) {
        DoublyLinkedList myList = new DoublyLinkedList();
        myList.inserAtHead(40);
        myList.printList();

        myList.inserAtHead(20);
        myList.printList();


        myList.inserAtHead(10);
        myList.printList();

        myList.insertAtTail(50);
        myList.printList();


    }
}
