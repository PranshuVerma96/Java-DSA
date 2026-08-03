public class PrintNTo1 {
    static void anotherMethod(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        anotherMethod(n-1);
    }
    static void printNTo1(int n, int count){
        if(count > n){
            return;
        }
        printNTo1(n,count+1);
        System.out.println(count);
    }

    public static void main(String[] args) {
//        int n=5;
//        int count = 1;
//        printNTo1(n, count);

        anotherMethod(9);
    }
}
