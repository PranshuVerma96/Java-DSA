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

    // print backword
    public void printBackword(){
        Node temp = tail;
        while (temp != null){
            System.out.print( " <-"+ temp.data);
            temp = temp.prev;
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
    public void insertAtTail(int data){
        Node newNode = new Node(data);
        if(head == null && tail == null){
            head = newNode;
            tail = newNode;
        }
        else {
            newNode.prev = tail;
            tail.next = newNode;
            // update tail
            tail = newNode;

        }
        // 1 node add hu he
        size++;
    }


    // insert at anyPosition
    
    public void insertAtPosition(int position , int data){
        if(position <1 && position > size+1){
            System.out.println("Invalid position to Insert node");
            return;
        }
        if(position==1){
            inserAtHead(data);
            return;
        }
        if(position == size+1){
            insertAtTail(data);
            return;
        }

        // in between kain per insert kar na he
        Node temp = head;

        for (int i=1; i<=position-2; i++){
            temp = temp.next;

            //
        }
        // ab hum previous node per he
        Node preNode = temp;
        Node nextNode = preNode.next;

        Node currNode = new Node(data);

        currNode.prev = preNode;
        preNode.next = currNode;

        currNode.next = nextNode;
        nextNode.prev = currNode;

        // size increase ho gai he
        size++;
    }

       //=========================
    // Searching
    //=========================

    public boolean searchInLL(int target){
        if (head == null){
            System.out.println("No node inside linked list");
        }
        Node temp = head;
        while (temp != null){
            if (temp.data == target){
                return true;
            }else {
                temp = temp.next;
            }
        }
        return false;
    }


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
