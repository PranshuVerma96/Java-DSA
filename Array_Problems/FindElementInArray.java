import java.util.Scanner;
//time complexity = o(n)
public class FindElementInArray {
    static boolean findElement(int arr[],int target){
        for(int i : arr){
            System.out.print(i + " ");
        }
        System.out.println(" ");
 for(int i=0; i<arr.length; i++){

            if(arr[i] == target){
                System.out.println("Element is present on index " + i + " and element is  "  + target);
                return true;
            }
        }
//        ager full array travel but target nahi mila
        System.out.println("Element is not present ");
        return false;
    }

    public static void main(String[] args) {
        System.out.println("Enter the target value " );
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        int arr[] = {1, 2, 3,4,5,6,7,8,9};
        findElement(arr , target);
    }
}
