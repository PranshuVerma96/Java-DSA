public class methodOverloading {

    static  int printSum(int a , int b){
        return  a + b;
    }
    static int printSum(int a, int b, int c){
        return  a+ b+ c;
    }
    static  void printMutiple(){
        int value = 20;
        for(int i =1; i<=10; i++){
            System.out.println(20*i);
        }
    }

//    static  void solve(int num){
////        System.out.println("inside value "  + num);
////        num *=10;
////        System.out.println("inside value "  + num);
//        System.out.println();
//
//    }
    static void main() {

        printMutiple();
        int num = 5;
//        System.out.println("inside main " + num);
//        solve(num);
//        System.out.println("inside main " + num);
//      int result =   printSum(4,3);
//        System.out.println("the result is :" + result);
//        int result2  = printSum(2,3,4);
//        System.out.println("the result is : " + result2);

    }
}
