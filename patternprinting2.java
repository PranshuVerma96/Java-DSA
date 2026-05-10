public class patternprinting2 {
    /// /    diamand printing
    static void main() {
//       // or piramid trangile
//        int n = 4;
//        for(int row = 1; row<=n; row++){
////            for space
//            for(int space = 1; space<=n-row;space++){
//                System.out.print("  ");
//            }
////            for star
//            for(int col = 1; col<=2*row-1; col++){
//                System.out.print("* ");
//            }
////            move to next row
//            System.out.println();
//        }
//
////        inverted piramid
//        int n1 = 4;
//        for(int row = 1; row<=n1; row++){
//            if(row==1) continue;
////            for space
//            for(int space = 1; space<=row-1; space++){
//                System.out.print("  ");
//            }
////            for star
//            for(int col = 1; col<=2*(n1-row)+1; col++){
//                System.out.print("* ");
//            }
//////            move to next line
//            System.out.println();
//        }
//    }

//        for holy diamid
//        int n = 14;
//        for (int row = 1; row <= n; row++) {
//            for (int col = 1; col <= n - row; col++) {
//                System.out.print("  ");
//            }
////            part -2
//            if (row == 1 ) {
//                for (int col = 1; col <= 2 * row - 1; col++) {
//                    System.out.print("* ");
//                }
//
//            } else {
////                middle row
//                System.out.print("* ");
//                for (int col = 1; col <= 2 * row - 3; col++) {
//                    System.out.print("  ");
//                }
//                System.out.print("* ");
//            }
////            move to next line
//            System.out.println();
//        }
//
////        part 2
//        for(int row=1; row<=(n-1);row++){
//            for(int col=1; col<=row; col++){
//                System.out.print("  ");
//            }
//            if(row==(n-1)){
//                System.out.print("* ");
//            }
//            else {
//                System.out.print("* ");
//                for(int col=1; col<=2*(n-row)-3;col++){
//                    System.out.print("  ");
//                }
//                System.out.print("* ");
//            }
//            System.out.println();
//        }


//        int n = 14;
//        for(int row=1; row<=n; row++){
////            part1
//            for(int col=1; col<=row;col++){
//                System.out.print("* ");
//            }
////            part2
//            for(int col=1; col<=2*(n-row);col++){
//                System.out.print("  ");
//            }
////            part 3
//            for(int col=1; col<=row;col++){
//                System.out.print("* ");
//            }
////
//            System.out.println();
//        }
////        part 4 inveted
//        for(int row=1; row<=n; row++){
//
//            for(int col =1; col<=n-row+1;col++){
//                System.out.print("* ");
//            }
//
////            part 5
//
//            for(int col=1; col<=2*(row-1);col++){
//                System.out.print("  ");
//            }
////            part 6
//
//            for(int col =1; col<=(n-row)+1;col++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

//        numeric pattern
//        int n= 5;
//        for(int row = 1; row<=n; row++){
//            for(int col=1; col<=row; col++){
//                System.out.print(col + " ");
//            }
//            System.out.println();
//        }

////        numeric count
//        int n = 5;
//        int count= 1;
//        for(int row=1 ; row<=n; row++){
//            for(int col = 1; col<=row;col++){
//
//                System.out.print(count + " ");
//                count++;
//            }
//            System.out.println();
//        }

//        right angle ABCD
//        int n = 5;
//        for(int row=1; row<=n; row++){
//            for(int col=1;col<=row;col++){
//                int a=col;
//                int b = ('A' -1);
//                int ans = a+b;
//                char finalAns = (char) ans;
//                System.out.print(finalAns + " ");
//
//
//            }
//            System.out.println();
//        }

//        next tringle
//        int n = 5;
//        for(int row=1; row<=n; row++){
//            for(int col=1; col<=row;col++){
//                int a = n-col;
//                int b = 'A';
//                int ans = a+b;
//                char finalAns = (char) ans;
//                System.out.print(finalAns + " ");
//            }
//            System.out.println();
//        }



////        part 1 damru piramid
//        int n = 4;
//        for(int row = 1; row<=n; row++){
////            if(row==1) continue;
//            if(row==n)continue;
////            for space
//            for(int space = 1; space<=row-1; space++){
//                System.out.print("  ");
//            }
////            for star
//            for(int col = 1; col<=2*(n-row)+1; col++){
//                System.out.print("* ");
//            }
//////            move to next line
//            System.out.println();
//        }
//
////        part 2
//        for(int row = 1; row<=n; row++){
////            for space
//            for(int space = 1; space<=n-row;space++){
//                System.out.print("  ");
//            }
////            for star
//            for(int col = 1; col<=2*row-1; col++){
//                System.out.print("* ");
//            }
////            move to next row
//            System.out.println();
//        }
// piramid of numbers
//        int n= 4;
//        for(int row= 1; row<=n; row++){
////            part 1
//            for(int col = 1; col<=n-row;col++){
//                System.out.print("  ");
//            }
////            part 2
//            for(int col=1; col<=row;col++){
//                System.out.print(col + " ");
//            }
////            part 3
//            int rowValue = row;
//
//            int decRowValue = rowValue - 1;
//            for(int col = 1; col<=row-1; col++){
//                System.out.print(decRowValue +  " ");
//                decRowValue--;
//            }
//            System.out.println();
//        }

//        piramid of even number
//        int n = 4;
//        for(int row=1 ; row<=n; row++){
////            part 1
//            for(int col = 1; col<=n-row;col++){
//                System.out.print("  ");
//            }
////            part 2
//            for(int col=1; col<=2*row-1;col++){
//                System.out.print(row + " ");
//            }
//            System.out.println();
//        }


        int n = 4;
        for(int row=1 ; row<=n; row++){
//            part 1
            for(int col = 1; col<=n-row;col++){
                System.out.print("  ");
            }
//            part 2

            for(int col=1; col<=row;col++){
                int a = col;
                int b = 'A' - 1;
                int ans = a+b;
                char finalAns = (char)ans;

                System.out.print(finalAns + " ");
            }
//            part 3
            char toPrint = (char)(row + 'A'-2);
            for(int col=1; col<=row-1; col++){

                System.out.print(toPrint + " ");
                toPrint--;
            }

            System.out.println();
        }

    }
}