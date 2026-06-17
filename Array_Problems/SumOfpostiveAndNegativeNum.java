public class SumOfpostiveAndNegativeNum {
//    time complexity = o(n)
    static int findSumOfPositive(int arr[]){
        int sum = 0;
        for(int i =0; i<arr.length; i++){
            if(arr[i] >= 0){
                sum +=arr[i];
            }
        }
        return sum;
    }

//    sum of negative numbers
    static int sumOfNegativeNumbers(int arr[]){
        int sum = 0;
        for(int i =0; i< arr.length; i++){
            if(arr[i] < 0){
                sum +=arr[i];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,-3,-4,-3,6,9};
        System.out.println("the sum of positive numbers is ");
        System.out.println(findSumOfPositive(arr));

        System.out.println();
        System.out.println("the sum of negative numbers is ");
        System.out.println(sumOfNegativeNumbers(arr));
    }
}
