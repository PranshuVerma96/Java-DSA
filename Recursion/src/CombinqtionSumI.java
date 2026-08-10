import java.util.ArrayList;
import java.util.List;

public class CombinqtionSumI {
    static void solve(int [] candidates,
                      int target, int index,
                      List<List<Integer>> ans ,
                      List<Integer> output ){

        // base case
        if(target ==0){
            // target 0 ka matlab oput me ans he
          ans.add(new ArrayList(output));
            return;
        }
        if(index >= candidates.length){
            return;
        }
        if(target <0){
            return;
        }
        // 1 case solve karo
        // include exclude patter
        output.add(candidates[index]);
        solve(candidates, target-candidates[index],index,ans , output);

        // backtrack
        output.remove(output.size()-1);

        // exclude cas
        solve(candidates,target,index+1, ans , output);
    }
    static List<List<Integer>> combnations (int[] candidates, int target){
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> output = new ArrayList<>();

        int index = 0;
        solve(candidates, target, index, ans, output);
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = {2,3,7,9} ;
        int target = 9;
        List<List<Integer>> ans = combnations(arr,target);
        System.out.println(ans);
    }
}
