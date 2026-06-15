public class CheckPowerOFTwo {
    public static void main(String[] args) {
//        check bitwise operator
//
//        int n = 5;
//        int count = 0;
//        while (n!=0){
//            if((n&1)!= 0 ){
//                // i found a set bit
//                count ++;
//
//            }
//            // right shift
//            n = n>>1;
//        }
//        System.out.println("Set bit count " + count);

        int n = 32;
        if((n &(n-1)) == 0){
            System.out.println("Power of 2 hai ");
        }
        else {
            System.out.println("Power of two nahi he ");
        }
    }
}
