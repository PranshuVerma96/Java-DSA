import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class StackBasics {
    public static void main(String[] args) {

//        creation the deque using stack
        Deque<Integer> stack = new ArrayDeque<>();

//        some operation
        stack.push(20);
        stack.push(30);
        stack.push(40);

        System.out.println(stack);

//        pop()
         stack.pop();
        System.out.println(stack);

        System.out.println(stack.peek()); // return top element

    }
}
