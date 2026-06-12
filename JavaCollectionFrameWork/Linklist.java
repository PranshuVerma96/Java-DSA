import java.util.LinkedList;
import java.util.List;

public class Linklist {
    public static void main(String[] args) {
//        creation of linklist

     LinkedList<Integer> marks = new LinkedList<>();

        marks.add(10);
        marks.add(20);
        marks.add(30);
        marks.add(40);
        marks.add(50);

//        indexOf
        System.out.println("Print orignal list " + marks);
        System.out.println(marks.indexOf(40));

//        in the linklist not possible to clone the another

        System.out.println(marks);

//        lastindexOF()
        System.out.println(marks.lastIndexOf(50));

//        addFirst() mehtod and addLast

        marks.remove(4);
        marks.remove(3);
        marks.remove(2);

        System.out.println( marks);

//        addFist()
        marks.addFirst(30);

//        addLast
        marks.addLast(40);
        System.out.println(marks);

        System.out.println("the orignal array is " + marks);
//        removeFirst
        marks.removeFirst();
        System.out.println(marks);

        marks.removeLast();
        System.out.println(marks);

//        get first and getLast

        System.out.println(marks.getFirst());
        System.out.println(marks.getLast());

//        peek() return the first element head of the linked list

        System.out.println(marks.peek());

//        poll() return and removes the firest element from the linked list
        System.out.println(marks.poll());
        System.out.println(marks);

//        offer() add the specified eleemt at the end of the linked list

        marks.add(30);
        marks.add(300);

        System.out.println("the oringanal list is " + marks);
        System.out.println(marks.offer(400));
        System.out.println(marks);
    }
}
