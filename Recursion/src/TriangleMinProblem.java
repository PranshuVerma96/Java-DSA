import java.util.List;

public class TringleProblem {
    static int solve(List<List<Integer>> triangle , int rowIndex,int colIndex){
        // base case
        if(rowIndex == triangle.size()-1){
            // jis pr khade ho use path me include kar de wapas
        return triangle.get(rowIndex).get(colIndex);

        }
        int downAns = solve(triangle,rowIndex+1,colIndex);
        int diaonalAns = solve(triangle, rowIndex +1, colIndex+1);
        // 1 case hum sove karege
        int finalAns = triangle.get(rowIndex).get(colIndex) + Math.max(downAns, diaonalAns);
        return finalAns;

    }
    public int minimumTotal(List<List<Integer>> triangle){
        int rowIndex = 0;
        int colIndex = 0;
       int ans =  solve(triangle,rowIndex,colIndex);
       return ans;

    }
}
