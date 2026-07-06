import java.util.ArrayList;
import java.util.List;
//this is array list code 
public class SumOfEachColumnIn2dArray {
    static List<Integer> columnSums(int arr[] []){
        List<Integer> result = new ArrayList<>();

        int n = arr.length;
        int m = arr[0].length;

        for(int col =0; col<m; col++){
            int sum = 0;
            for (int row= 0; row<n; row++){
                int value = arr[col][row];

                sum = sum +value;
            }
            result.add(sum);
        }
        return result;
    }

    public static void main(String[] args) {
        int arr[][] = { {1,2,3},{3,4,6},{5,6,7}};

        List<Integer> result = columnSums(arr);

        System.out.println(result);


    }
}
