import java.util.LinkedList;
import java.util.Queue;

public class queueExample {
    public static void main(String[] args) {

//        creation of queue
        Queue<Integer> Q = new LinkedList<>();

//        adding element in the queue
//        add() add method is used to inserts the specified element in the queue.
//        if the task is successful, add() return ture, if not it throws an exception


        Q.add(1);
        Q.add(2);
        Q.add(3);
        Q.add(4);
        Q.add(5);

        System.out.println(Q);

//        offer() inserts the specified element into the queue. If the task is
//        successfuly offer return true. otherwise false

        Q.offer(6);
        Q.offer(7);
        System.out.println(Q);

//        Element() this is method is used to return the head of the queue
//        Throws an exception if the queue is empty

        System.out.println(Q.element());

//        peek() return and the head of the queue return null if the queue
//         is empty

//        creation a new queue
        Queue<Integer> queue = new LinkedList<>();
//        System.out.println(queue.element()); this will be occure the
//        noSuchelement exception

//        System.out.println(queue.peek()); this is return null not error

        queue.offer(20);
        queue.offer(30);
        queue.offer(40);
        queue.offer(50);

        System.out.println(queue);

        System.out.println(queue.peek()); // return 20

//        remove method this will be returns and removes the head of the queue
//        throws an ecxception if the queue is empty
        System.out.println("Orignal queue " +  queue);
        System.out.println(queue.remove());
        System.out.println("updated queue " + queue);

//        poll () return and removes the head of the queue and return null if
//        the queue is empty
        Queue<Integer> new_queue = new LinkedList<>();

//        System.out.println(new_queue.remove()); return noSuchElementException

//        System.out.println(new_queue.poll()); return null

        new_queue.offer(50);
        new_queue.offer(60);
        new_queue.offer(70);
        new_queue.offer(90);

        System.out.println(new_queue);

//        poll() return and removes the head of the queue returns null if the queue is empty
        System.out.println("Oringal queue " + new_queue);
        System.out.println(new_queue.poll());
        System.out.println("Updated queue " + new_queue);
    }
}
