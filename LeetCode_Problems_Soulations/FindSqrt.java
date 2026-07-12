public class FindSqrt {
    static int findSqrt(int x){
        int start = 1;
        int end = x;
        double ans = -1;

        if(x == 0){
            return 0;
        }

        while(start <= end){
            int mid = start + (end -start)/2;

           // check first condition
           if(mid == x/mid){
               return mid;
           } else if (mid > x/mid) {
               // mid bada he
               end = mid -1;

           }
           else{
               // third condition if mid chota ho
               ans = mid;
               start = mid + 1;
           }
        }

        double factor = 1;
        int totalPrecison = 4;
        for(int round =1; round<=totalPrecison; round++){
            factor = factor/10;

            for(int i =1; i<=10; i++){
                double newAns = ans + factor;

                if(newAns * newAns == x){
                    return  newAns;
                } else if (newAns* newAns < x) {
                  ans = newAns;

                }
                else {
                    break;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int x = 90;
        int ans = findSqrt(x);
        System.out.println(ans);
    }
}
