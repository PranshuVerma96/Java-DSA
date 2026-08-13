class Solution {
    static int solve(int[][] keypad, int current, int n){
        // base case 
        if(n==1){
            return 1;
        }
        int ans = 0;
        
        // loop se iterate karege 
        for(int next : keypad[current]){
            ans += solve(keypad,next,n-1);
        }
        return ans;
    }
    public int getCount(int n) {
        // code here
        int[][] keypad = {
            
            {0, 8},          // 0
            {1, 2, 4},       // 1
            {2, 1, 3, 5},    // 2
            {3, 2, 6},       // 3
            {4, 1, 5, 7},    // 4
            {5, 2, 4, 6, 8}, // 5
            {6, 3, 5, 9},    // 6
            {7, 4, 8},       // 7
            {8, 5, 7, 9, 0}, // 8
            {9, 6, 8}        // 9
        };
      
      int ans = 0;
       for(int current = 0; current <= 9; current++){
            ans += solve(keypad, current, n);
        }
        
        return ans;
        
    }
}
