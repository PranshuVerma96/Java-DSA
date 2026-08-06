public class CoinChange {
    static int solve(int coins[], int amount, int index){
        // base case
        if(amount == 0){
            return 1;
        }
        if(amount < 0 ){
            return 0;
        }
        if(index >= coins.length){
            return 0;
        }

        //first case hum solve karege baki recurison sambal lega
        // include
        int includeAns = solve(coins,amount-coins[index],index);

        // manlo amount 40 hai or maine current coin use nahi kiya
        // iska mathlab amount me koi change nahi hoga
        // but kyoki main current coin ko eclude krra hu to meghe next coin per move karna hoga
        int excludeAns = solve(coins, amount,index+1);

        // final ans
        int finalAns = includeAns + excludeAns;
        return finalAns;
    }
    static int coinChain(int coins[],int amount){
        int index =0;
        int ans = solve(coins,amount,index);
        return ans;

    }

    public static void main(String[] args) {
        int coins[] = {1,2,3,4,5};
        int amount = 7;
        int ans = coinChain(coins,amount);
        System.out.println("the total mehtod is " + ans);
    }
}
