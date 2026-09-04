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

    // Print List
    public  void printForward(){
        if (head == null){
            System.out.println("Doubly circular linked list is empty");
            return;
        }
        Node current = head;

        do {
            System.out.print(current.data);
            current = current.next;

            if(current !=head){
                System.out.print(" <-> ");
            }

        } while (current!= head);
        System.out.println(" <-> (Back to Head) ");
    }

    public  void printBackward(){
        if (tail == null){
            System.out.println("Doubly circular linked list is empty");
            return;
        }
        Node current = tail;

        do {
            System.out.print(current.data);
            current = current.prev;

            if(current !=tail){
                System.out.print(" <-> ");
            }

        } while (current!= tail);
        System.out.println(" <-> (Back to Head) ");

    }

     // Search
    public boolean search(int target){
        if(head == null){
            return false;
        }
        Node current = head;
        do{
            if(current.data == target){
                return true;
            }
            current = current.next;
        }while (current != head);
        return false;
    }
    // getSize
    public int getSize(){
        return size;
    }

      //===============================
    // Deletion
    //===============================

    // Deletion At head
    public void deleteHead(){
        // Case 1 Empty linked list
        if(head == null){
            System.out.println("Can not deleted empty linked list");
            return;
        }
        // case 2 only one node
        if (head == tail){
            head = null;
            tail = null;
            size = 0;
            return;
        }

        // Step 3 more than one node
        Node temp = head;
        // Move to forword
        head = head.next;

        temp.next = null;
        temp.prev = null;

        head.prev = tail;
        tail.next = head;


        size--;
    }

     // Deletion At Tail

    public void deleteTail(){
        // Step 1 Empty Linked List
        if(head == null){
            System.out.println("Can not deleted empty linked list");
            return;
        }
        // Step 2 only one node
        if(head == tail){
            head = null;
            tail = null;
            size = 0;
            return;
        }
        // Step 3 one more than node
        Node preNode = tail.prev;
        // Disconnect
        tail.prev = null;
        tail.next = null;

        // circular connection
        tail = preNode;
      tail.next = head;
        head.prev = tail;

        size--;

    }

        // Delete At position
    public void deleteAtPosition(int position){
        // Step 1 Empty linked list
        if(position <1 || position >size+1){
            return;
        }
        if(head == null){
            System.out.println("can not delete ");
            return;
        }

        if(position ==1){
            deleteHead();
            return;
        }

        Node preNode = head;
        for(int i=1; i <= position-2; i++){
            preNode = preNode.next;
        }
        Node currNode = preNode.next;
        Node nextNode = currNode.next;

        currNode.prev = null;
        size--;
        // dekete tauk
        if (position == size){
            deleteHead();
        }
        // one node is exist
        if(head == tail){
            head = null;
            tail = null;

            size--;
            return;
        }

        // Step 3 more than
    }

    public static void main(String[] args) {
        DoublyCircularLinkedList list = new DoublyCircularLinkedList();
        list.insertAtHead(20);
        list.insertAtHead(30);
        list.insertAtTail(40);
        list.insertAtPosition(2,45);
        list.printBackward();
        list.printForward();
    }
}
