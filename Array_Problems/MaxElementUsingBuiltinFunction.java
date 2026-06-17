public class MaxElementUsingBuiltinFunction {
//    time compleixty = o(n)
    static int findMaxElement(int arr[]){
        int max = arr[0];
        for(int i =0; i<arr.length; i++){
            max = Math.max(max,arr[i]);
        }
       return max;
    }

//    find minimum
    static  int findMinElement(int arr[]){
        int min = arr[0];
        for(int i =0; i< arr.length; i++){
            min = Math.min(min,arr[i]);

        }
        return min;
    }

    public static void main(String[] args) {
        int arr[] = {23,45,12,55,63};
        System.out.println();
        System.out.println("the maximum element is ");
        System.out.println(findMaxElement(arr));

        System.out.println();
        System.out.println("the minimum element is ");
        System.out.println(findMinElement(arr));
    }
}
