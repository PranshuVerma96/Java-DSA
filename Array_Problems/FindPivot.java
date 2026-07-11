public class FindPivot {
    static  int findPivot(int arr[]){
        int start = 0;
        int n = arr.length;
        int end = n-1;
        int ans = -1;


        // check first case
        if(arr[start] < arr[end]){
            return  -1;
        }
        while (start <= end){
            int mid = start + (end - start)/2;

            if(arr[mid] <= arr[n-1]){
                // last se cota he iska matlab
                // element left side me
                // left side me jane per
                end = mid -1;
            }else{
                // arr[mid] > arr[n-1]
                // to element left side me ya
                // ye potential solution bi ho sakta he

                start = mid + 1;
                ans = mid;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
//        int arr[] = {40,50,60,10,20,30};
        int arr[] = {60,80,90,100,10, 20, 30, 50};
        int ans = findPivot(arr);
        System.out.println("the result is " + ans);

    }
}
