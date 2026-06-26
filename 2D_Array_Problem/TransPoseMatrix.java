public class TransPoseMatrix {

    static int[][] transpose(int[][]arr){
        if(arr == null || arr.length==0){
            return new int[0][0];
        }
        int n = arr.length;
        int m = arr[0].length;

        int ans [][] = new int[n][m];

        for(int i =0; i<n; i++){
            for(int j = 0; j<m; j++){
                ans[j][i] = arr[i][j];
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[][]= {
                {1,2,3}
                ,{3,4,5}
                ,{6,8,7}};



        int result [][] = transpose(arr);

//        for print matrix
        int n = result.length;
        int m = result[0].length;

        for(int i =0; i<n; i++){
            for(int j =0; j < m; j++){
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }

    }

}
