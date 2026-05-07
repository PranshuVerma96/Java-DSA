import java.util.Scanner;

public class Loop_Practise {
    static void main() {

//        Print counting from 1 to n
        //System.out.println("Enter the value of n :");
        Scanner sc = new Scanner(System.in);
//        int number = sc.nextInt();
//
//       // System.out.println("your output is :");
//        for(int i = 1; i<=number; i++){
//           // System.out.println(i);
//        }

//        Print counting from n to 1
       // System.out.println("Enter the value of n :");
        //int numValue = sc.nextInt();
       // System.out.println("Your output is :");

//        for (int i = numValue; i >=1; i--){
//            System.out.println(i);
//        }

//        Print the 10 muliples of n

//        System.out.println("Enter the value of n ");
//        int multiValue = sc.nextInt();
//
//        for(int i =1; i<=10 ; i++){
//            System.out.println(i*multiValue);
//        }

//Print all even numbers from 1 to 100
        for(int i = 2; i<=100; i+=2){
          //  System.out.println("Value is " + i);
        }

//        Print the sum fo the numbers from 1 to n
        int sum = 0;
        for(int i = 1; i<= 100; i++){
            sum = sum + i;

        }
     //   System.out.println("Total sum is " + sum);

//
//       Print all integers in range from 50 to 100, that are perfectly divisible by 7


        for(int i = 50; i<=100; i++){
            if(i%7 == 0){
                System.out.println(i);

            }

        }
//        Print all prime numbers from 1 to 100


                System.out.println("Prime numbers from 1 to 100:");

                for(int num = 2; num <= 100; num++) {

                    boolean isPrime = true;

                    for(int i = 2; i <= num / 2; i++) {

                        if(num % i == 0) {
                            isPrime = false;
                            break;
                        }
                    }

                    if(isPrime) {
                        System.out.print(num + " ");
                    }
                }
            }
        }

