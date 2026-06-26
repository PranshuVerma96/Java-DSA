import java.util.ArrayList;
import java.util.List;

public class WavePrintAmatrix {

    static List<Integer> wavePrint(int[][] arr, int m , int n){
        List<Integer> result = new ArrayList<>();

        for(int col = 0; col<n; col++){
            //hr ek coll index check that is even or odd
            if((col & 1) ==1){
                //add
                //bottom to top

                for(int row = m-1; row>=0; row--){
                    result.add(arr[row][col]);
                }
            }

            else {
                // even
                // top to bottom
                for(int row = 0; row<m;  row++){
                    result.add(arr[row][col]);
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int arr[][] = {{1,2,3,4},{3,4,5,6},{7,8,9,0}};
        int m = arr.length;

        int n = arr[0].length;
        List<Integer> result = wavePrint(arr , m,n);
        System.out.print(result + " ");

    }
  }
