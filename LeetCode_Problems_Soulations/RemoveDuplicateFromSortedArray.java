public class RemoveDuplicateFromSortedArray {
    static int removeDuplicateFromSortedArray(int arr[]){
        int i =0;
        int j =1;
        int n = arr.length;
        while (j<n){
            if(arr[i] == arr[j]){
                j++;
            } else {
                i++;
                arr[i] = arr[j];
                j++;
            }
        }
        return i+1;
    }

    public static void main(String[] args) {
        int arr[] = {1,1,1,2,2,2,3,3,3,4,4,5};
        int result = removeDuplicateFromSortedArray(arr);
        System.out.println("After sorted the lenght of array is  " + result);
    }
}
