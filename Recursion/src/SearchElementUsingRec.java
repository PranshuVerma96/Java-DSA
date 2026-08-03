public class SearchElementUsingRec {
    static int findTarget(int arr[] ,int index, int target){
        // base case
        if(index>=arr.length){
            return -1;
        }

        //processing part
        if(arr[index] == target){
            return index;
        }
        // recurisve call
        int ans = findTarget(arr, index+1,target);
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = {10,20,30, 40, 50};
        int index = 0;
        int target = 40;

        int ans = findTarget(arr,index,target);
        System.out.println("the founded index is " + ans);
    }
}
