public class JumpGame {
    static boolean solve(int nums[], int index){

        // base case
        // recahed destination
        if(index == nums.length){
            return true;
        }
        // destination se age
        if(index >= nums.length){
            return false;
        }
        // stack hone bali cae
        if(nums[index] == 0){
            return false;
        }
        // ab me ek case solve kruga baki recursion smabhal lega
        int jumbValue = nums[index];
        boolean overAllAns = false;
        // jumpvale max map
        for(int jump = 1; jump <= jumbValue; jump++ ){
           boolean recAns = solve(nums, index + jump);
           overAllAns = overAllAns || recAns;
        }
        return overAllAns;
    }
    static boolean canJump(int nums []){
        int index = 0;
      boolean ans =  solve(nums,index);
       return ans;
    }

    public static void main(String[] args) {
//        int nums [] =  {2,3,1,1,4};
        int nums [] = {3,2,1,0,4};
        boolean  ans = canJump(nums);
        System.out.println(ans);
    }
}
