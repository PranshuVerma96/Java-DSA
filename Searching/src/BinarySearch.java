import java.util.Scanner;

public class BinarySearch {
    static  int binarySearch(int arr[], int target){
        // time complexity = o(n)
        int n = arr.length;
        int start = 0;
        int end = n-1;
        int mid = (start + end)/2;

        // another and optimal way to find mid
        // mid = start + (end - start) /2

        while (start <= end){
            // check target with mid
            if(arr[mid] == target){
                //target round
                return mid;
            }
            else if(target > arr[mid]){
                // go to right side if target bada he mid se
                start = mid + 1;
            }
            else{
                // target cota he mide se than go to left
                end = mid - 1;
            }
// update mid
             mid = (start + end) / 2;
        }

        // app bahar a gaue he target nahi mila
        return  -1;
    }

    public static void main(String[] args) {
        System.out.println("Enter the vale of target : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int arr[] = {1,2,3,4,5,6,7,8,9};
        System.out.println("the original array is ");
        for(int i : arr){
            System.out.print(i + " ");
        }

        System.out.println();
        System.out.println("the target value on index : ");
        int result = binarySearch(arr,n);
        System.out.println(result);


    }
}
