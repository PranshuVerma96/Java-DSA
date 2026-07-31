public class MultiplyOfArrayElement {
    static int multiplyArray(int arr[],int index){
        // base case
        if(index == arr.length){
            return 1;
        }
        int ans = arr[index] * multiplyArray(arr, index+1);
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = {10, 20, 30};
        int result = multiplyArray(arr,0);
        System.out.println(result);

    }
}
