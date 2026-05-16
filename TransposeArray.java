public class TransposeArray {
    static void main() {
        int arr [][] = {{1,2,3} , {4,5,6} ,{7,8,9}};
//        print the orignal array
        System.out.println("Oringnal array");
        for(int row = 0; row<arr.length; row++){
            for(int col = 0; col<arr[row].length; col++){
                System.out.print(arr[row][col] + " ");

            }
            System.out.println();
        }
//        after transposing array
        System.out.println("the transpose array ");
        for(int row = 0; row<arr.length; row++){
            for(int col = 0; col<arr[row].length; col++){
                System.out.print(arr[col][row] + " ");

            }
            System.out.println();
        }
    }
}
