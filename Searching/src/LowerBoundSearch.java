public class LowerBoundSearch {
    static  int getLowerBound(int arr[], int target){
        int n = arr.length;
        int s = 0;
        int e = n -1;

//        time complexity = o(log n)

        int ans = -1;
        while (s<=e){
            int mid = s+ (e-s)/2;

            if(arr[mid] >= target){
                // store ans
                ans = mid;
                e = mid - 1;
            }
            else {
                // right move
                s = mid + 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = {10, 20, 25, 30, 30,38, 40};
        int target = 35;
        int result = getLowerBound(arr , target);
        System.out.println("answer is:=> " + result);
     }
}
