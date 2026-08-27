import java.util.ArrayList;
import java.util.List;

public class SumOfEachRowIn2DArray {
    static List<Integer> rowSum(int arr[][]){
        List<Integer> result = new ArrayList<>();

        int m = arr.length;
        int n = arr[0].length;
//       traversal
        for(int row =0;  row<m; row++){
            int sum = 0;
            for(int col = 0; col<n; col++){
                int value = arr[row][col];
                sum = sum + value;
            }
//            jabb main sarre colum ki value travel add kr cuka huga

            result.add(sum);
        }
        return result;
    }

    public static void main(String[] args) {
        int arr[][] = {{1,2,3,4},{5,6,7,8},{9,0,6,9}};

        List<Integer> result = new ArrayList<>();
        result = rowSum(arr);

        System.out.println(result);

//        List<Integer> result = rowSum(arr);

    }
}

// time Complexity = o(m*n)