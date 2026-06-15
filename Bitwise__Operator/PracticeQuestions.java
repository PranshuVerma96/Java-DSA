public class PracticeQuestions {
    public static void main(String[] args) {

//        System.out.println(5 & 6);
//        System.out.println(5 | 6);
//        System.out.println(5 ^ 6);
//        System.out.println(~5);
//        System.out.println(3 <<2);
//        System.out.println(16 >> 2);

//        swap two number using xor operator

        int a1 = 5;
        int b1 = 3;

        int a = a1^b1;
        int b = (a1^b1)^b1;
        int a2 = (a1^b1)^(a1^b1)^b1;

        System.out.println(a1);
        System.out.println(b1);
        System.out.println("After swaping");

        System.out.println(a2);
        System.out.println(b);



    }
}
