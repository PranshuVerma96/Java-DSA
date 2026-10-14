import java.util.ArrayDeque;
import java.util.Deque;

public class printMiddleElement{
    public static void printMiddleElement(Deque<Integer> st, int count, int size){
        // base case
        if(count == size/2) {
            int middleElement = st.peek();
            System.out.println("Middle element form stack :" + middleElement);
            return;
        }
        // 1 case main solve karuga
        st.pop();
        count++;

        // baki recursion
        printMiddleElement(st,count,size);
    }
    public static void main(String[] args) {
        Deque<Integer> st = new ArrayDeque<>();

        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);

        int count = 0;
        int size = st.size();

        // function call
        printMiddleElement(st,count,size);

    }
}
