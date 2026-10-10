package StackUsingArray;

public class StackUsingArray {
    // data members

    private int [] arr;
    private int capacity;
    private int top;

    // constructor
    public StackUsingArray(int capacity){
        this.capacity = capacity;
        this.arr = new int[capacity];
        this.top = -1;
    }
    // number fuctions
    public void push(int value){
        if(top == capacity-1){
            System.out.println("Can not inserted Element  STack Overflow");
            return;
        }else {
            top++;
            arr[top] =  value;
        }

    }

    // pop
    public void pop(){
        if(top == -1){
            System.out.println("Can not Delete Stack Underflow");
            return;
        }
        else {
            arr[top] = -1;
            top --;
        }


    }
    // getSize

    public int getSize(){
        // current nomber of element
        return top+1;
    }

    // peek method
    public int peek(){
        if(top ==-1){
            System.out.println("No Element is exist");
            return -1;
        }
        else {
            return arr[top];
        }


    }

    // getcapacity
    public int getCapacity(){
        return  this.capacity;
    }

    // check Empty metho
    public boolean checkEmpty(){
        if(top ==-1 ){
            return true;
        }
        else {
            return false;
        }
    }
    public void printStack(StackUsingArray st){
        while (!st.checkEmpty()){
            System.out.println(st.peek());
            st.pop();

        }
    }

    public static void main(String[] args) {
        StackUsingArray st = new StackUsingArray(5);
        st.push(10);
        System.out.println("Stack ka Size : "+ st.getSize());

        st.push(20);
        System.out.println("Stack ka Size : "+ st.getSize());

        st.push(30);
        System.out.println("Stack ka Size : "+ st.getSize());

        st.push(40);
        System.out.println("Stack ka Size : "+ st.getSize());

        st.push(50);

        // first Method
        System.out.println("Stack ka Size : "+ st.getSize());

        st.printStack(st);

        // it will be give cannot inserted element stack Overflow
//        st.push(60);
//        System.out.println("Stack ka Size : "+ st.getSize());

//            st.pop();
//        System.out.println("Stack ka Size : "+ st.getSize());
//
//        st.pop();
//        System.out.println("Stack ka Size : "+ st.getSize());
//
//        st.pop();
//        System.out.println("Stack ka Size : "+ st.getSize());
//
//        st.pop();
//        System.out.println("Stack ka Size : "+ st.getSize());
//
//        st.pop();
//        System.out.println("Stack ka Size : "+ st.getSize());

        // it give the outof range give me Stack Underflow
//        st.pop();
//
//        System.out.println("Stack ka Size : "+ st.getSize());

//        System.out.println(st.checkEmpty());
//        System.out.println(st.getCapacity());


        System.out.println("Stack ka top "  + st.peek());
    }

}
