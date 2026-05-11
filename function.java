import java.util.Scanner;

public class function {
//    method declaration / defenation
//    function declaration ke time jo data () ke ander ho ta he use paramenter bolte he


    static void printTableOfNum(int n){
       for(int i =1; i<=10; i++){
            int multiply = n*i;
            System.out.println(n + " x " + i + " = " + multiply);
        }
    }


//    method signature ==> void printSum(int x , int y) that is signature
//    signature batata he mehtod name parameter return type

    static void multiply(int a , int b){
        System.out.println("multiply is " + a*b);
    }


    static void printSum(int num1 , int num2){
        System.out.println("Sum is :" + num1 + num2);
    }

    static  void printDevision(int a, int b){
        System.out.println("Divion is :" + a/b);
        return;
//        return ke baad kush bi run nahi hota he so bahi se function execution ko band kar deta he
       // System.out.println("run ho gaya");
    }

//    non void function
    static int printAddtion(int a, int b){
        return  a + b;
    }

    static void main() {

//        System.out.println("Enter the value of n :");
//        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();
//
//        printTableOfNum(num);
//        printSum(3,4);
//        multiply(4,3);
//        printDevision(9,3);

//        function call ke ander jo data app send karte ho use argument bolte he

       int ans =  printAddtion(89,90);
        System.out.println("result is : " + ans);
    }
}
