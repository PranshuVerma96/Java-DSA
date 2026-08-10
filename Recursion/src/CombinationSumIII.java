import java.util.ArrayList;
import java.util.List;

public class CombinationSumIII {
    static void solve(
            int arr[],
            int target,
            int count,
            int index,
            int k,
            List<List<Integer>> ans,
            List<Integer> output

    ){
        // base case

        if(count == k && target==0){
            // store cako all combo
            ans.add(new ArrayList(output));
            return;
        }
        if(index >= arr.length){
            return;
        }

        if(target < 0){
            return;
        }

        // hum use kare ge
        // recuresion include and exclude patter
        // sab se pilce add
        int currentElement = arr[index];

        output.add(currentElement);
        // include kall
        solve(arr,target-currentElement,count+1,index+1,k, ans, output);

//        // exclude ki kall check akne se phle
//        while(index+1 < arr.length && arr[index] == arr[index+1]){
//            index++;
//        }

        // back track bal step
        output.remove(output.size()-1);
        // exclue bali call
        solve(arr,target,count,index+1,k, ans, output);
    }

    static List<List<Integer>> combinationSum3(int k , int n){
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> output= new ArrayList<>();

        int arr []= {1,2,3,4,5,6,7,8,9};
        int target = n;
        int count = 0;
        int index = 0;
        solve(arr,target, count,index,k, ans, output);
        return ans;

    }

    public static void main(String[] args) {
        int k =3;
        int n = 7;
        List<List<Integer>>  ans = combinationSum3(k,n);
        System.out.println(ans);
    }
}
