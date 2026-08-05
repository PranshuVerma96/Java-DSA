public class HouseRobberProblem {

    static int solve(int arr[] , int index){
        // base case

        if(index >= arr.length){
            return 0;
        }
        // first case solve karo
        // main index per hu
        // i have two choice include and exclude

        int includeAns = arr[index] + solve(arr,index + 2);
        int excludeAns = 0 + solve(arr,index + 1);

        int finalAns = Math.max(includeAns,excludeAns);
        return finalAns;
    }
    static int robHouse(int arr[]){
        int index =0;
       int ans =  solve(arr,index);
       return ans;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,1};
        int result = robHouse(arr);
        System.out.println("the maxMoney is " + result);
    }
}
