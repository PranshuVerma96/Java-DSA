public class SubsequenceSum {
    static boolean solve(int arr[], int k, int sum, int index){
        // base case
        if(index >= arr.length){
            // subsequence ready he

            if(sum ==k){
                return true;
            }
            else {
                return false;
            }
        }
        // 1 case hum solve karege
        // include patteren
        // includePattern
        int currentValue = arr[index];
        boolean includeAns = solve(arr, k , sum + currentValue,index +1);

        // exclude pattern
        boolean excludeAns = solve(arr, k, sum,index+1);

        // ager done se true a gya to true return karo
        boolean finalAns = excludeAns || includeAns;
        return finalAns;
    }
    static boolean checkSubsequenceSum(int arr[], int k){
        int index = 0;
        int sum = 0;
       boolean ans =  solve(arr,k , sum, index);
       return ans;
    }

    public static void main(String[] args) {
        int arr[] = {5,1,2,7,6,1,5};
        int k = 88;
        boolean ans = checkSubsequenceSum(arr,k);
        System.out.println(ans);
    }
}
