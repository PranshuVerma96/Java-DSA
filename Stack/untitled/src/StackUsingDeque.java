import java.util.ArrayDeque;
import java.util.Deque;

public class StackUsingDeque {
    public static void main(String[] args) {
//        inslize the stack using deque

        Deque<Integer> st = new ArrayDeque<>();

        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);

        System.out.println("Stack size: " + st.size());
        System.out.println("Stack is " + st);

        st.pop();

        System.out.println("Stack is " + st);
        System.out.println(st.isEmpty());

    }
}
