public class patternPrinting {
    static void main() {

//        solid squre pattern
//        int n = 5;
//        for(int row = 1; row <=n; row++){
//            for(int col = 1; col <=n; col++){
////                print start
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

//        solid rectangle pattern

//        int n = 4;
//        for(int row = 1; row<=n; row++){
//            for(int col = 1; col<=5; col++){
//                System.out.print("# ");
//            }
//            System.out.println();
//        }

////       Right tringle print
//        int n = 5;
//        for(int row = 1; row<=n;row ++){
////            formula col -> 1 to value of row
//            for(int col=1; col<=row; col++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

//        solid rombus pattern
//
//        int n = 5;
//        for(int row = 1; row<=n; row++){
////            for space
//            for(int col = 1 ; col<=n-row; col++){
//                System.out.print("  ");
//            }
////            for star
//            for(int col = 1; col<=n; col++){
//                System.out.print("* ");
//            }
////            move next row
//            System.out.println();
//
//        }

//        inverted right angle trangle
//        int n = 10;
//        for(int row = 1; row<=n; row++){
//            for(int col = 1; col<=n-row+1; col++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

//        new right left trangle
//
//        int n = 5;
//        for(int row = 1; row<=n; row++){
////            for space
//            for(int space = 1; space<=n-row; space++){
//                System.out.print(" ");
//            }
////            for star
//            for(int col = 1; col<=row; col++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

//        for piramid trangile
//        int n = 5;
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

//        inverted piramid
//        int n = 9;
//        for(int row = 1; row<=n; row++){
////            for space
//            for(int space = 1; space<=row-1; space++){
//                System.out.print("  ");
//            }
////            for star
//            for(int col = 1; col<=2*n-(2*row + 1); col++){
//                System.out.print("* ");
//            }
////            move to next line
//            System.out.println();
//        }

//        int n = 5;
//        for(int row = 1; row<=n; row++){
//            for(int col = 1; col<=6; col++){
//                if(row==1 || row==n){
//                    System.out.print("* ");
//                }
//                else{
////middle roww
//                    if(col == 1 || col==6){
//                        System.out.print("* ");
//                    }
//                    else{
//                        System.out.print("  ");
//                    }
//                }
//            }
//            System.out.println();
//        }

//        next ringle

//        int n = 5;
//        for(int row = 1; row<=n; row++){
//            if(row ==1 || row==2 ||row==n){
//                for(int col =1; col<=row; col++){
//                    System.out.print("* ");
//                }
//            }else{
//
//                System.out.print("* ");
//                for(int col = 1; col<=row-2; col++){
//                    System.out.print("  ");
//                }
//
//                System.out.print("* ");
//
//            }
////            move to next row
//            System.out.println();
//        }

//        holy piramid
        int n = 5;
        for(int row = 1; row<=n; row++){
            for(int col= 1; col <=n-row; col++){
                System.out.print("  ");
            }
//            part -2
            if(row==1 || row==n){
                for(int col= 1; col<=2*row-1; col++){
                    System.out.print("* ");
                }

            }
            else {
//                middle row
                System.out.print("* ");
                for(int col = 1; col<=2*row-3; col++){
                    System.out.print("  ");
                }
                System.out.print("* ");
            }
//            move to next line
            System.out.println();
        }
    }
}




































