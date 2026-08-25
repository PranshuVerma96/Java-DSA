public class SinglyLinkedList {
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    private Node head;
    private Node tail;
    private int size;

    // construstor
    public SinglyLinkedList(){
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    //=============================
    // Insertion
    //=============================

    // Insertion at beginning
    public void insertAtHead(int data){
        Node newNode = new Node(data);
        // if linked list is empty head and tail ki newNode per poin kardo
        if(head == null && tail == null){
            head = newNode;
            tail = newNode;
        }
        else {
            newNode.next = head;
            head = newNode;
        }
        // increase the size by 1
        size++;
    }

    // Insertion at ending
    public void insertAtTail(int data){
        Node newNode = new Node(data);
        // if linked list empy he head and tail ki newNode per point kardo
        if(head ==null && tail == null){
            head = newNode;
            tail = newNode;
        }
        else{
            tail.next = newNode;
            tail = newNode;
        }
        // increase the size by 1
        size++;
    }
    // Insert At position is 1 based indexing
    public void insertAtPosition(int position, int data){
        if(position <1 || position > size + 1){
            // insertion not possible
            System.out.println("Insertion is not possible at this position");
            return;
        }
        if(position ==1){
            insertAtHead(data);
            return;
        }
        if(position == size+1){
            insertAtTail(data);
            return;
        }
        //  middle me karhin per insert karna he

        Node prevNode = head;
        // move preNode by position -2 steps to rech to the preious node of the destion location
        for(int i =1; i<= position-2; i++){
            prevNode = prevNode.next;
        }
        Node newNode = new Node(data);

        // update links
        newNode.next = prevNode.next;
        prevNode.next = newNode;

        // increment size
        size++;

    }


    //================================
    // Traversal
    //================================

    public void printList(){

        Node temp = head;
        while (temp != null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println();
    }

    //===============================
    // Utility Functions
    //===============================
    public int getSize(){
        return size;
    }

    public boolean isEmpty(){
        return head == null;
    }

    public int getHead(){
        if(head == null){
            return -1;
        }
        else {
            return  head.data;
        }

    }

    public int getTail(){
        if(tail ==null){
            return -1;
        }
        else {
            return tail.data;
        }
    }

    public void clear(){
        head = null;
        tail = null;
        size = 0;
        System.out.println("List is cleared");
        return;
    }


//    ===========================
    // Searching
//    ===========================

    // Returns true if value exists
    public boolean search(int targer){
        // pending
    }
    public static void main(String[] args) {
        SinglyLinkedList mylist = new SinglyLinkedList();
        if(mylist.isEmpty()){
            System.out.println("List is empty");
        }

        System.out.println("Size of list = " + mylist.getSize());
        // insetAtHead
        mylist.insertAtHead(10);
        mylist.printList();

        mylist.insertAtHead(20);
        mylist.printList();

        mylist.insertAtHead(30);
        mylist.printList();

        // inset at tail
        mylist.insertAtTail(100);
        mylist.printList();

        mylist.insertAtTail(110);
        mylist.printList();

        mylist.insertAtTail(120);
        mylist.printList();


        // insert At Positon
        mylist.insertAtPosition(1,22);
        mylist.printList();

        mylist.insertAtPosition(8,300);
        mylist.printList();

        mylist.insertAtPosition(5,250);
        mylist.printList();

//        mylist.clear();
//        mylist.printList();

        System.out.println("head ka data = " + mylist.getHead());
        System.out.println("Tail ka data = " + mylist.getTail());
    }
}
