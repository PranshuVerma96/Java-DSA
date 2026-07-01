class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length;
        int start = 0; 
        int end = n - 1;
        int mid = (start + end) / 2;


        // check kab tak target cehck hoga 
        while(start <= end){
            if(nums[mid] == target){
                return mid;
            }
            else if (target > nums[mid]){
                // check kar element chota he ki bada mid se if bada to go to right else got to right
                start = mid + 1;
            }
            else {
                // if cota he target se to go to left 
                end = mid -1;
            }
            // update mid after all calculation 
            mid = (start + end) / 2;


        }
        // if element nahi mial to return -1
        return -1;
    }
}
