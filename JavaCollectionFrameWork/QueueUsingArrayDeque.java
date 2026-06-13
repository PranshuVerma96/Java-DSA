import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public class QueueUsingArrayDeque {
    public static void main(String[] args) {

//        creation of the queue
//        Queue<Integer> q = new ArrayDeque<>();

//        for apply offerFirst and offerLast method we should use deque class
        Deque<Integer> q = new ArrayDeque<>();
//        add the element in the queue
        q.offer(20);
        q.offer(30);
        q.offer(40);
        q.offer(50);
        System.out.println(q);

//        there are all method available what ever availble in the quee
        q.add(34); // this is return exeception if queue is empty

       q.offerFirst(40); //  this will be add in the first of the queue
        System.out.println(q);

        q.offerLast(30);
        System.out.println(q);

//        ever we want to delete first and last element in the queue
        System.out.println("Orignal queue" + q);

        q.pollFirst();
        System.out.println(q);
        q.pollLast();
        System.out.println(q);

//        find the size
        System.out.println(q.size());

        System.out.println(q.peek());
        System.out.println(q);

        System.out.println(q.peekFirst());
        System.out.println(q.peekLast());


    }
}
