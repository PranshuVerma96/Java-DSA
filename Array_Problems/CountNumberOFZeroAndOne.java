public class CountNumberOFZeroAndOne {
    static int[] findNumberZeroandOne(int[] arr){
// time complexity = o(n)
        int zeronum = 0;
        int oneNum = 0;
        for(int i =0; i<arr.length; i++ ){
            if(arr[i] == 0){
                zeronum++;
            } else if (arr[i]==1) {
                oneNum++;
            }
        }
        int ans[] = {zeronum , oneNum};
        return ans;
    }

    public static void main(String[] args) {
        int arr [] = {1,0,2,3,4,0,1,2,1,2,1,1,1,1,0,0,0};

        int ans[] = findNumberZeroandOne(arr);
        System.out.println("total zero " + ans[0]);
        System.out.println("total one "  + ans[1]);
    }
}
