import java.util.Scanner;

public class Array2D {
    static void main() {
        //    declartion
        int[][] arr;
//        arr = new int[3][3];
//        int [][] brr = {
//                {1,2,3} ,
//                {3,4,5} ,
//                {5,6,7}
//        };
////        System.out.println(brr[0][0]);
////        System.out.println(brr[2][2]);
////        for printing array
//
//        int rowLenght = brr.length;
//        int colLenght= brr[0].length;
//        for(int row = 0; row < rowLenght; row++){
//            for(int col = 0; col< colLenght; col++){
//                System.out.print(brr[row][col] + " ");
//            }
//            System.out.println();
//        }


        int[][] brr = {
                {1, 2, 3},
                {3, 4, 5, 3, 4, 5},
                {5, 6, 7, 2, 3}
        };
//        System.out.println(brr[0][0]);
//        System.out.println(brr[2][2]);
//        for printing array

//        int rowLenght = brr.length;
//
//        for(int row = 0; row < rowLenght; row++){
//            /*
//            jaise he main kisi new row me aya
//            same point pr main uss row ka collenght find karlia
//            current row = brr[rowindex]
//            isme kite colums brr[rowindex].lenght
//             */
//            int colLenght = brr[row].length;
//            for(int col = 0; col< colLenght; col++){
//                System.out.print(brr[row][col] + " ");
//            }
//            System.out.println();
//        }

//        -input in 2D array
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the row of array : ");
        int row = sc.nextInt();
        System.out.println("Enter the coloum of array ");
        int col = sc.nextInt();

        int drr[][] = new int[row][col];
        System.out.println("Enter the element of array ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                drr[i][j] = sc.nextInt();
            }

        }
        System.out.println("the 2d array is ");
        int sum = 0;
        for (int i = 0; i<row; i++){
            for (int j = 0; j<col; j++){
                sum += drr[i][j];
                System.out.print( drr[i][j] + " ");
            }

            System.out.println();
        }
        System.out.println("The sum of element is : " + sum);
    }
}
