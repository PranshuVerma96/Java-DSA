public class Fibonacci {

    static int fib(int n) {
        if (n == 0)
            return 0;

        if (n == 1)
            return 1;

        return fib(n - 1) + fib(n - 2);
    }

    static void printSeries(int n) {
        if (n == 0)
            return;

        printSeries(n - 1);
        System.out.print(fib(n - 1) + " ");
    }

    public static void main(String[] args) {
        int n = 10;
        printSeries(n);
    }
}