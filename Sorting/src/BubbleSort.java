public class BubbleSort {
    static int[] bubbleSort(int arr[]){
        int n = arr.length;

//        time complexity = o(n2)
//        first loop
        for(int i =0; i<n-1; i++) {

            boolean sorted = false;
            for (int j = 0; j < n - i - 1; j++) { // rounds ko batara
                if (arr[j] > arr[j + 1]) {
//                swap the element
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    sorted = true;
                }
            }
            if (!sorted) {
                return arr;
            }



        }
        return arr;
    }

    public static void main(String[] args) {
        int arr[] = {6,3,1,5};
        int result [] = bubbleSort(arr);
        for(int i=0; i<result.length; i++){
            System.out.print(result[i] + " ");
        }
    }
}
