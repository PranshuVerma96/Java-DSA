public class PrintArray {
    static void printArray(int arr[] , int i){
        // base case
        if(i >=arr.length){
            return;
        }

        //processing
        System.out.print (arr[i] + " ");

        //recursive call
        printArray(arr,i+1);
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        int i=0;
        printArray(arr,i);
    }
}
