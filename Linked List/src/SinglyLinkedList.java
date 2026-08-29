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
        // middle me karhin per insert karna he

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
    public boolean search(int target){
        Node temp = head;
       while (temp != null){
           if(temp.data == target){
               return true;
           }
           else {
               temp = temp.next;
           }
       }
       // ager he yaha puch gya liked list puri travel ho cuki he
        // but target nahi mil
       return false;

    }

    //Returs 1 based postion
    public int findPosition(int target){
        Node temp = head;
        int position = 1;

        while (temp != null){
            if(temp.data == target){
                return position;
            }
            else {
                temp = temp.next;
                position++;
            }

        }
        // gara yah pucha isak matlab
        // target nahi mila
        return -1;
    }


    //==============================
    // Updation
    //==============================

    // update using position
    public void updateAtPosition(int position, int newData){
        Node temp = head;

        if(position <1 || position>size+1){
            System.out.println("Invalid position you given");
            return;
        }
        for(int i=1; i<=position-1; i++){
            temp = temp.next;

        }
        // ab mera temp exct postion bali node per he
        temp.data = newData;
    }

    // update first occurence of value

    public boolean updateValue(int oldValue, int newValue){
        Node temp = head;
        while (temp != null){
            if(temp.data == oldValue){
                temp.data = newValue;
                return true;
            }
            else {
                // move to next
                temp = temp.next;
            }
        }
        // ager me yah a gya
        // iska matlab liked list me old value mili he nahi
        return false;
    }

    //============================
    // Deletion
    //===========================

    // Delete first node
    public void deleteHead(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        // main logic
        head = head.next;
        size--;
        // be cautious check whether after deletion lL has become empty or no
        if(head == null){
            tail =null;
        }
    }

    // Delete tail or last node
    public void deleteTail(){
        if(head == null){
            System.out.println("list is empty");
            return;
        }
        // check for single node
        if(head ==tail){
            head = null;
            tail= null;
            size =0;
            return;
        }
        // logic for list
        Node temp = head;
        for(int i=1; i<=size-2; i++){
            temp = temp.next;
        }
        // now temp is pointing at 2nd last node of LL
        temp.next = null;
        tail = temp;

        // update
        size--;
    }

// Delete at Postion

    public void deleteAtPostion(int postion){
        if(postion <1 || postion > size+1){
            System.out.println("Invalid postion can not delete");
            return;
        }
        if (postion == 1) {
            deleteHead();
            return;
        }
        if(postion == size){
            deleteTail();
            return;
        }
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        Node prev = head;
        // prev ki postion -2 step move karuga to delete ke ek picjebale
        // ja sakta hu
        for(int i=1; i<=postion-2; i++){
            prev = prev.next;
        }
        Node curre = prev.next;
        Node forward = curre.next;

        // main logic
        prev.next = forward;
        curre.next = null;

        size--;
    }

 // Delete first occurrence of value

   public boolean deleteValue(int target){
        if(head == null){
            System.out.println("Deleteion not posiple ");
            return false;
        }
        if(head.data == target){
            deleteHead();
            return true;
        }
        Node pre = head;
        Node curr = head.next;

        while (curr != null){
            if(curr.data == target){
                // deletion ka logic
                Node forward = curr.next;
                pre.next = forward;
                curr.next = null;

                if(tail == curr){
                    // update
                    tail = pre;
                }
                size--;
                return true;
            }
            else {
                pre = pre.next;
                curr = curr.next;
            }
        }
        return false;
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

//        System.out.println("position of 200 is "
//                + mylist.findPosition(300));
//
//        System.out.println("Fount list: " + mylist.search(200));
//        System.out.println("head ka data = " + mylist.getHead());
//        System.out.println("Tail ka data = " + mylist.getTail());

//        mylist.updateAtPosition(50,400);
//        mylist.printList();
//        System.out.println(mylist.updateValue(20,40));
        mylist.deleteHead();
        mylist.printList();
        mylist.deleteTail();
        System.out.println(mylist.getSize());
        mylist.printList();

        mylist.deleteAtPostion(4);
        mylist.printList();

        mylist.deleteAtPostion(1);
        mylist.printList();

        mylist.deleteAtPostion(5);
        mylist.printList();

      mylist.deleteValue(100);
        mylist.printList();
    }
}
