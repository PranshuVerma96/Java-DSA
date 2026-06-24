public class FindPivotIndex {
    static int findPivotIndex(int arr[]){
        int n = arr.length;
        int leftSum [] = new int[n];
        int rightSum [] = new int[n];

//        find left sum wala array
        leftSum[0] = arr[0];

        for(int i=1; i<n; i++){
            leftSum[i] = leftSum[i-1] + arr[i];
        }

//        find right sum wala array

        rightSum[n-1] = arr[n-1];
        for(int i = n-2; i>=0; i--){
            rightSum[i] = rightSum[i+1] + arr[i];
        }

//        check for equality

        for(int i=0; i<n; i++){
            if(leftSum[i] == rightSum[i]) {
                return i;
            }
        }
//        if isa index ana ho
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,5,3,2,1};
        System.out.println("the original array is ");
        for(int i : arr){
            System.out.print(i + " ");
        }
        int result = findPivotIndex(arr);
        System.out.println();
        System.out.println("the pivot index is " + result);
    }
}
