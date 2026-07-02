public class UpperBoundSearch {
    static int getUpperBound(int arr[] ,  int target){

        // time complexity = o(log n)
        int n = arr.length;
        int s = 0;
        int e = n-1;
        int ans = -1;

        while (s<=e){
            int mid = s + (e-s)/2;

            if(arr[mid] <= target){
                // move to target
                s = mid + 1;
            }
            else{
                // arr[mid] > target
                // ans store
                // move left

                ans = mid;
                e = mid-1;
             }
        }
        return ans;

    }

    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 30, 50, 60, 70};
        int target = 30;
        int result = getUpperBound(arr , target);
            System.out.println("the UpperBound is :=> " + result);

    }
}
