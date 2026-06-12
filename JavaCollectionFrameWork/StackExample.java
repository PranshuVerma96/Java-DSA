import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {

//        creating the stack
//        stack always followed LIFO order
        Stack<Integer> marks = new Stack<>();

//        adding value
        marks.add(10);
        marks.add(20);
        marks.add(30);
        marks.add(40);
        marks.add(50);
        System.out.println(marks);

//        push()

        marks.push(60);
        System.out.println(marks);

//        pop
        marks.pop();
        System.out.println(marks);

//        size method

        System.out.println(marks.size());

//        peek mehtod
        System.out.println(marks.peek());

        System.out.println(marks);
//        search method
        System.out.println(marks.search(40));

//        Empty

        System.out.println(marks.empty());

    }
}
