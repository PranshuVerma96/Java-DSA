import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {

//        int n = 11;
//        if(n %2 == 0){
//            System.out.println("Even");
//        }
//        else {
//            System.out.println("odd");
//        }

//        using bitsize operator

        System.out.println("Enter the number : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if((num & 1) ==0){
            System.out.println("Even Number ");
        }
        if((num & 1) ==1){
            System.out.println("Odd number");
        }

    }
}
