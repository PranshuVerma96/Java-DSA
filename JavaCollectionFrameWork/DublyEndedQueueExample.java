import java.util.Deque;
import java.util.LinkedList;

public class DublyEndedQueueExample {
    public static void main(String[] args) {

//        creation of dubly Ended queue
        Deque<Integer> deque = new LinkedList<>();

//        adding element of the queue
        deque.offer(30);
        deque.offer(50);
        deque.offer(80);
        deque.offer(90);

//        printing the deque
        System.out.println(deque);

//        ever you wanted to add element on the first than we use addFirst() method

        System.out.println("Orignal queue" + deque);
        deque.addFirst(400);
        System.out.println("udated queue " + deque);

//        ever we wanted to add in the last
//        we can used addLast() method
        deque.addLast(500);
        System.out.println(deque);

//        in the dsa we are not use to addFirst and addLast method becaues
//        these return exception if queue is empty inplace of the we should use
//        offerFirst and offerLast method

        System.out.println("Orinal queue " +  deque);
        deque.offerFirst(210);
        System.out.println(deque);

        deque.offerLast(201);
        System.out.println(deque);



    }
}
