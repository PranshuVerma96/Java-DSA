public class InsertionSort {
    static void insertionSort(int arr[]){
        int n = arr.length;
        for(int i =1; i<n; i++){

            int prev = i-1;
            int curValue = arr[i];

//            sifting ke liye loop
            while (prev >=0 && curValue < arr[prev]){
                arr[prev + 1] = arr[prev];
                prev--;
            }
//            ab humare pass kahali place he
//            place the currentValue
//            time complexity = o(n2)
            arr[prev + 1] = curValue;
        }
    }

    public static void main(String[] args) {
        int arr[] = {4,32,1,5,6,9};

        insertionSort(arr);
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
