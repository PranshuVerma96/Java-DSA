public class SumOfArrayElement {
    static int printSum(int arr[],int index){
        if (index == arr.length){
            return 0;
        }
       int ans= arr[index] + printSum(arr,index+1);
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = {10,20, 30, 50,};
        int result = printSum(arr,0);
        System.out.println(result);
    }
}
