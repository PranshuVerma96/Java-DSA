import java.util.PriorityQueue;
import java.util.Queue;

public class ProrityQueue {
    public static void main(String[] args) {
//        there are element insert depeneding on the proity

//        creation of the queue
        Queue<Integer> pq = new PriorityQueue<>();

//        default behaviour in Integer less value -> High priorty ->min heap behaveiour

//        pq.add(10);
//        pq.add(20);
//        pq.add(40);
//        pq.add(50);
        pq.offer(10);
        pq.offer(20);
        pq.offer(30);
        pq.offer(40);

//        so print 10
        System.out.println(pq);
        System.out.println(pq.poll());
        System.out.println(pq);
        System.out.println(pq.poll());
        System.out.println(pq);

//        ever we want change
//        convert maxheap -> high value -> high priority
//        creation new priority queue
        Queue<Integer> pq2 = new PriorityQueue<>((a,b)->b-a);
        pq2.offer(10);
        pq2.offer(20);
        pq2.offer(30);
        pq2.offer(40);

        System.out.println(pq2);

        System.out.println(pq2.poll());
        System.out.println(pq2);
        System.out.println(pq2.poll());
        System.out.println(pq2);

//        if priorty queue using string
//        so we should write comparator





    }
}
