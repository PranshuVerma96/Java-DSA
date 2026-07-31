public class PowerOfTwo {
    static int powerOfTwo(int num){
        // first of all base
        if(num ==0){
            return 1;
        }
        int ans = 2 * powerOfTwo(num -1);

    return ans;
    }

    public static void main(String[] args) {
        int num = 8;
        int result = powerOfTwo(num);
        System.out.println(result);
    }
}
