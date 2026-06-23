public class TwoSum {
    static int[] twoSum(int arr[], int target) {

//        time complexity = o(n2)
//        space complexity = o(1)
        int n = arr.length;
//        outer loop

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == target) {
//                    int ans[] = {arr[i], arr[j]};
                    int index [] = {i , j};
                    return   index;
                }
            }
        }
// return some kabi jaha tak nahi ayega
        int ans[] = {};
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = {2, 7, 11, 15};
        int target = 9;

        int result[] = twoSum(arr, target);
        for (int i : result) {
            System.out.print(i + " ");

        }
    }
}
