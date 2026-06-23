public class FindTheMissingNum {
    static  int findMissingNum(int arr[]){
        int xorSum = 0;

//        xor with all the array elements
        for(int num : arr){
            xorSum = xorSum ^ num;
        }

//        xor with all the element in the range
        int n = arr.length;
        for(int i =0; i<=n; i++){
            xorSum = xorSum ^ i;
        }

        return  xorSum;
    }

    public static void main(String[] args) {
        int arr[] = {0,1,2,3,4,6};
        System.out.println("the orignal array ");
        for(int i : arr){
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("the missing element ");
        int result = findMissingNum(arr);
        System.out.println(result);
    }
}
