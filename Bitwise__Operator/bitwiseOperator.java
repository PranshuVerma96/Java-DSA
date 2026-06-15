public class bitwiseOperator {
    public static void main(String[] args) {

        int a = 5;
        int b = 6;
//bitwise and operations
        System.out.println(a & b);

//        bitwise or
        System.out.println(a | b);

//        xor or a , b
        System.out.println(a ^ b);

//        not a
        System.out.println(~a);

//        left sift
        int n = 1;
        for(int i = 1; i<=32; i++){
            n = n<< 1;
            System.out.println(n);
            System.out.println(n);
        }

        System.out.println("Right Shift");
//        right sift

        int m = 100;
        for(int i = 1; i<=10; i++){
            m =m>>1;
            System.out.println(m);
            System.out.println(m);
        }
    }
}
