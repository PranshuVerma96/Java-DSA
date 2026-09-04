
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
