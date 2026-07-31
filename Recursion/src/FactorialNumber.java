public class FactorialNumber {
    static long factorial(long num){
        // this is the base case that tell us where the function is terminated
        if(num == 0){
            return 1;
        }
        // this is the processing work and recursive call that is tell us how process the function
        long ans = num * factorial(num - 1);
        return ans;
    }

    public static void main(String[] args) {
        long num = 55;
        long result = factorial(num);
        System.out.println(result);
    }

}
