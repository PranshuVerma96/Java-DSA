import java.math.BigInteger;
import java.util.Scanner;

public class TakingInput {
    static void main() {
//        int a = 5;
//        int b = 3;
//        System.out.println(a+b);
//

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of firstNum: ");
       int firstNum =  sc.nextInt();
        System.out.println("Enter the value of SecondNum :");
       int secondNum = sc.nextInt();

        int result = firstNum + secondNum;
        System.out.println("Your sum is : " + result);


//        input for bigintNumber
//      BigInteger bg =  sc.nextBigInteger();
//        System.out.println(bg);

        System.out.println("enter the float value : ");
       float fl =  sc.nextFloat();
        System.out.println("Value is " + fl);

//        input for boolean value
        System.out.println("Enter the bool value ");
        boolean bl = sc.nextBoolean();
        System.out.println("Value is :" + bl);

//        taking input for string
        System.out.println("Enter your name : ");
        String name = sc.next();
        System.out.println("Your name is :" + name);

        System.out.println("Enter your name : ");
        String nameAnother = sc.nextLine();
        System.out.println("Your name is :" + nameAnother);

        sc.close();

    }

}
