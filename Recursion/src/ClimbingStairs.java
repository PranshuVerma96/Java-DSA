public class ClimbingStairs {

    static int climbStairs(int n){
        // base case
        if(n==1){
            return 1;
        }
        if(n==2){
            return 2;
        }
        int ans = climbStairs(n-1) + climbStairs(n-2);
        return ans;
    }

    public static void main(String[] args) {
        int stairs = 6;
        int result = climbStairs(stairs);
        System.out.println(result);
    }
}

// sc = o(n)
