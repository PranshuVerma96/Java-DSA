import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSumII {
    static void solve(
            int arr[],
            int target,
            int index,
            List<List<Integer>> ans,
            List<Integer> output
    ){
      // base case
      if(target ==0){
          // iska matlab sub sequences ready he
          ans.add(new ArrayList(output));
          return;
      }
      if(index >= arr.length){
          return;
      }
      if(target < 0){
          return;
      }
      // ab ek case hame solve karna he
        int currentElement = arr[index];
      // we include and exclude pattern
        output.add(currentElement);

        // include call and es bar duplcate element nahi lene he
        solve(arr, target-currentElement,index+1, ans, output);

        // backtack bala step
        output.remove(output.size()-1);

        // exclude bale pattern se phle
        // chek koi duplicte comp to nahi he
        while (index +1 < arr.length && arr[index] == arr[index+1]){
            index++;
        }

        // ab exclude bali call karo
        solve(arr, target,index+1, ans, output);


    }
    static List<List<Integer>> combinations(int arr[], int target){
        Arrays.sort(arr);
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> output = new ArrayList<>();

        int index = 0;
        solve(arr,target , index,ans, output);
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = {10,1,2,7,6,1,5};
        int target = 8;
        List<List<Integer>> result = combinations(arr,target);
        System.out.println(result);
    }
}
