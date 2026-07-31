public class Count1TonUsingRecurrsion {
    static int addOneToN(int n) {
        // base case
        if (n == 0) {
            return 0;
        }
        int count = 0;
        int ans = n + addOneToN(n - 1);
        return ans;
    }

    static void countingOneToN(int n){
        if(n==0){
            return;
        }
        countingOneToN(n-1);
        System.out.print(n + " ");
    }
    static void countingNtoOne(int n){
        if(n==0){
            return;
        }
        System.out.print(n + " ");
        countingNtoOne(n-1);

    }
    public static void main(String[] args) {
        int n = 10;
        countingOneToN(n);
        System.out.println();
        countingNtoOne(n);
        System.out.println();
        int result = addOneToN(n);
        System.out.println(result);
    }
}
