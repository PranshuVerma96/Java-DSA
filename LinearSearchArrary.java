import java.util.Scanner;

public class LinearSearchArrary {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number which was you find : ");

        int num = sc.nextInt();

        int arr[] = {1,2,3,4,5,6,7,8,9};
        int search = num;


   boolean found = false;
        for(int i =0; i< arr.length; i++){
            System.out.print(arr[i] + " ");

        }
        System.out.println();
        for(int i = 0; i<arr.length; i++){
            if(arr[i] == search){
                System.out.println("the number is avaible on index  " + i + " and the number is " + arr[i] );

                found = true;
                break;
            }
        }
        if(found == false){
            System.out.println("The is not available in the particular array");
        }
    }
}
