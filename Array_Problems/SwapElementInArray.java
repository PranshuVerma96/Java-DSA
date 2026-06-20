public class SwapElementInArray {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};

        System.out.println("the original array");

        for(int i : arr){
            System.out.print(i + " ");
        }

        for(int i = 0; i<arr.length-1; i+=2) {


            int temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;

        }
        System.out.println();
        System.out.println("After Swap array is ");
        for(int i :arr){
            System.out.print(i + " ");
        }

    }
}
