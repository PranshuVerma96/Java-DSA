public class CoinChangeII {
    static int solve(int [] coins,int amount){
        // base case
        if(amount==0){
            return 0;
        }
        if(amount <0){
            //invalid case
            return Integer.MAX_VALUE;
        }
        //ab mare passe amount he sare coin to try karuga
        // ad find the min coin count

        int min = Integer.MAX_VALUE;
        for(int coin : coins){
            int recursionAns = solve(coins,amount - coin);

            if(recursionAns != Integer.MAX_VALUE){
                // valid case
                int totalCoinsUsed = recursionAns +1;
                min = Math.min(min, totalCoinsUsed);
            }
        }
        return min;
    }
    static int coinChange(int coins[], int amount){
        int ans = solve(coins,amount);
        if(ans == Integer.MAX_VALUE){
            return -1;
        }else{
            return ans;
        }

    }

    public static void main(String[] args) {
        int coins[] = {1,2,3};
        int amount = 5;
        int result = coinChange(coins,amount);
        System.out.println(result);
    }
}
