class Solution {
    public int mySqrt(int x) {
        
        if(x==0){
            return 0;
        }
        else if(x==1){
            return 1;
        }
        else{
            int result = (int)Math.sqrt(x);
              return result;
        }
      
    }
}
