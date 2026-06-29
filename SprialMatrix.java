import java.util.ArrayList;
import java.util.List;

public class SprialMatrix {
    static List<Integer> sprialOrder (int [][] arr){
        List<Integer> ans = new ArrayList<>();
        int n = arr.length;
        int m  = arr[0].length;

//        initilize variable

        int startingRow = 0;
        int endingRow = n-1;
        int startingCol = 0;
        int endingCol = m -1;

        while (startingRow <= endingRow && startingCol <=endingCol){
//            row wise left to right -> startingrow print karna he , form startingCol to endCol

            for(int col = startingCol; col<=endingCol; col++){
                ans.add(arr[startingRow][col]);
            }
            startingRow++;
//            col top to bottom => endingCol print karna he , form staringRol to endRow

            for(int row = startingRow; row<=endingRow; row++){
                ans.add(arr[row][endingCol]);
            }
            endingCol--;
//            row wise right to left => endingRow print karna he, form endingCol to staringCol

//            valid row
            if(startingRow <= endingRow){
                for(int col = endingCol; col>=startingCol; col--){
                    ans.add(arr[endingRow][col]);
                }
                endingRow--;

            }


//            valid Startingcol present h ya nahi
            if(startingCol <= endingCol){
                for(int row = endingRow; row>= startingRow; row--){
                    ans.add(arr[row][startingCol]);
                }
                startingCol++;
            }

//            col wise bottom to top => staringCol print karna he , form ending Row to starinRow



        }
        return  ans;
    }

    public static void main(String[] args) {
        int arr[][] = {{1,2,3,4},{5,6,7,8},{6,7,8,9}};


        List<Integer> result = sprialOrder(arr);
        System.out.println(result);
    }
}
