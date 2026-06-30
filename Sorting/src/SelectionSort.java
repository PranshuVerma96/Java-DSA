public class SelectionSort {
//    time Complexity = o(n2)
    static void selectionSort(int arr[]){
        int n = arr.length;
//        outer loop
        for(int i =0; i<n-1; i++){
            int min_Index = i;
            for(int j = i+1; j<n; j++){
                if(arr[j] < arr[min_Index]){
                    min_Index = j;
                }
            }
//            swap the element
            if(min_Index != i){
                int temp = arr[i];
                arr[i] = arr[min_Index];
                arr[min_Index] = temp;
            }

        }
    }

    public static void main(String[] args) {
        int arr[] = {5,3,2,1,6,0,4};
        selectionSort(arr);
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
