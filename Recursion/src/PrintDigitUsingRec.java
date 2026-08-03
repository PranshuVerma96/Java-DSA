public class PrintDigitUsingRec {
    static void printDigit(int num){
        // base case
        if(num ==0){
            return;
        }

        // processing
        int digit = num %10;

        num = num / 10;

        // recurisve call
        printDigit(num);
        System.out.println(digit + " ");
    }

    public static void main(String[] args) {
        int num = 190;
        printDigit(num);
    }
}
