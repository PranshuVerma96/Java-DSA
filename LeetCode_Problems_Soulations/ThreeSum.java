import java.util.ArrayList;
import java.util.List;

public class ThreeSum {
    static List<List<Integer>> theeSum(int arr[] , int target){
  List<List<Integer>> output = new ArrayList<>();
        int n = arr.length -1;
//        outer loop
        for(int i =0; i<=n-2; i++){
            for(int j = i+1; j<n-1; j++){
                for(int k= j+1; k<n; k++){
                    if(arr[i] + arr[j] + arr[k] == target){
//                        for return value
//                      int values [] = {arr[i], arr[j] , arr[k]};
                       List<Integer> temp = new ArrayList<>();
                       temp.add(arr[i]);
                       temp.add(arr[j]);
                       temp.add(arr[k]);

                       output.add(temp);
                    }
                }
            }
        }

        return output;
    }

    public static void main(String[] args) {
        int arr[] =  {-1,0,1,2,-1,-4};

      List<List<Integer>> result = theeSum(arr,0);
        System.out.println(result);

    }
}
