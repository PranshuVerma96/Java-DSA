public class Rotate90DegOf2dArray {
static  void rote90ClockWise(int[][] arr , int n){

//    step 1 transpose array
//    swap arr [i][j]
    for(int row = 0; row<n; row++){
        for(int col = row + 1; col<n; col++){
//            swap arr [i][j] = arr[j][i]

            int temp = arr[row][col];
            arr[row][col] =  arr[col][row];
            arr[col][row] = temp;
        }

    }
//    step 2 reverse the element
    for(int row = 0; row<n; row++){
//        find new row
        int starCol = 0;
        int indCol =n-1;

        while (starCol < indCol){
//            swap matrix
            int temp = arr[row][starCol];
            arr[row][starCol] = arr[row][indCol];
            arr[row][indCol] =  temp;

            starCol++;
            indCol--;
        }
    }
//    print the rotateed array
    for (int i = 0; i<n; i++){
        for(int j=0; j<n; j++){
            System.out.print(arr[i][j] + " ");
        }
        System.out.println();
    }

}

    public static void main(String[] args) {
        int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};
        int n = arr.length;
        System.out.println("the original array is ");
        for (int i = 0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("the rotated array is ");
        rote90ClockWise(arr,n);
    }


}
