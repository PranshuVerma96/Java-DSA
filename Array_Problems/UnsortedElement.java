public class UnsortedElement {
//    time Complexity = o(n)
    static  int getUnsortedElement(int arr[]){
        for(int i =0; i<arr.length; i++){
            if(arr[i+1] <= arr[i]){
                return  arr[i + 1];
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {1,3,4,0,6,5,9};
        System.out.println(getUnsortedElement(arr));
    }
}
