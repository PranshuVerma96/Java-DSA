public class BinarySearchUsingRec {
    static int solve (int arr[],int target, int s, int e){
        // base case
        if(s>e){
            return -1;
        }
        // processing or Binary serach logic
        int mid = s+ (e-s)/2;
        if(arr[mid] == target){
            return  mid;
        }
        if(arr[mid] > target){
            // move to left
            e = mid -1;
        }
        else if(arr[mid] < target){
            // move to right
            s = mid + 1;
        }

        // recursive call
        int ans = solve(arr, target,s,e);
        return ans;
    }
    static int binarySearch(int arr[], int target){
        int s = 0;
        int e = arr.length -1;
       int ans =  solve(arr,target,s,e);
       return ans;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};
        int target = 6;

        int ans = binarySearch(arr, target);
        System.out.println("the target is value on " + ans);
    }
}
