public class PrintOneTON {
    static void printOneToN(int n, int count){
        // base case
        if(count > n){
            return;
        }
        // processing
        System.out.println(count);
        count++;

        // recursive relation
        printOneToN(n,count);
    }

    public static void main(String[] args) {
        int n = 5;
        int count = 1;
        printOneToN(n,count);
    }
}
