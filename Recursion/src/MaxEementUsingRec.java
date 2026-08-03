public class MaxEementUsingRec {
    static void findMax(int arr[],int i, int max){
        // base case
        if(i>= arr.length){
            System.out.println(max);
            return;
        }
        // processing

        if(arr[i] > max){
            max = arr[i];
        }
        // recursive call

        findMax(arr,i+1,max);
    }
    static void findMin(int arr[],int i, int min){
        // base case
        if(i>= arr.length){
            System.out.println(min);
            return;
        }
        // processing

        if(arr[i]< min){
            min = arr[i];
        }
        // recursive call

        findMin(arr,i+1,min);
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        int i =0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        findMin(arr,i,min);
        findMax(arr,i,max);


    }
}
