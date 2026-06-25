// given an integer array arr find the subarray with the larges sum and return its sum


public class MaximumSubArray {
    static  int findMaxSubArray(int arr[]){

        int sum = 0;
        int maxi = Integer.MIN_VALUE;

        for(int i =0; i<arr.length; i++){
//            step 1 sum create karte he
            sum = sum + arr[i];
//            step 2 maxi update karte he
            maxi= Math.max(maxi ,sum);

//            step 3
            if(sum < 0){
                sum = 0;
            }
        }
//        return max value
        return maxi;

    }

    public static void main(String[] args) {
        int arr[] = {-2,1,-3,4,-1,2,1,-5,4};
        int result = findMaxSubArray(arr);
        System.out.println(result);
    }
}

//time complexity = o(n)
//space complexity = o(1)
