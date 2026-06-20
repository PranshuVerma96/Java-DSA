public class RightShiftElement {
    static void rightShiftElement(int arr[]){
        // step1 =  sotre last value
        // step 2 = shift all values of array
        // step 3 = temp ki value ko 0 index per copy
//        time complexity - o(n)

//        print orignal array
        System.out.println("the orignal array");
        for(int i : arr){
            System.out.print(i + " ");
        }
        int n = arr.length;
        int temp = arr[n-1];

        for(int i= n-1; i>0 ; i--){
            arr[i] = arr[i-1];

        }
        arr[0] = temp;

//       print shifed array
        System.out.println();
        System.out.println("shifed array");
        for(int i : arr){
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8};
        rightShiftElement(arr);
    }
}
