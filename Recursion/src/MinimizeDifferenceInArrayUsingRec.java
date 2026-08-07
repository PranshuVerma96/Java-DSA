public class MinimizeDifferenceInArrayUsingRec {

    // slove function defination
    static int solve(int sum, int target, int arr[][], int row){
        // base case
        if(row >= arr.length){
            // invalid row index
            // sum is ready
            // calcuate the differ between target and sum
            // and return minimum difference
            return Math.abs(target - sum);
        }
        // 1 case solve itself and other recursion
        int min = Integer.MAX_VALUE;
        // main row index per hu isme multiple coum per value he
        // me her colum per one ny one calucate karga

        for(int num : arr[row]){
           int ans =  solve(sum +num, target, arr , row +1);
           min =  Math.min(min,ans);
        }
        return min;
    }
    static  int minimizeDifference(int[][] arr, int target){
        int row = 0;
        int sum = 0;
       int ans =  solve(sum, target,arr,row);
       return ans;
    }

    public static void main(String[] args) {
        int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};
        int target = 13;
        int ans = minimizeDifference(arr,target);
        System.out.println("The answer is :" + ans);
    }
}
