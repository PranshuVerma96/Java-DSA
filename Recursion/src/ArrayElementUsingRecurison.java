public class ArrayElementUsingRecurison {
    static  void printArrayElement(int arr[] , int index){
        //base case
        if(index == arr.length){
            return;
        }
        System.out.print(arr[index] + " ");
        // recursive call
        printArrayElement(arr, index+1);
    }

    // print array element in right to left

    static void printArrayRightToLeft(int arr[], int index){
        // base case
        if(index == -1){
            return;
        }
        System.out.print(arr[index] + " ");

        // recrence releation
       printArrayRightToLeft(arr,index-1);

    }
    public static void main(String[] args) {
        int arr[] = {10,20, 30, 40, 50, 60};
        printArrayElement(arr,0);
        System.out.println();
        printArrayRightToLeft(arr,arr.length-1);
    }

}
