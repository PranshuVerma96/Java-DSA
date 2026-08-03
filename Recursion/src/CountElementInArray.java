public class CountElementInArray {
    static void countElemnt(int arr[], int index,int target,int count){
        // base case
        if(index >= arr.length){
            System.out.println("Count :" + count);
            return;
        }

        //processing
        if(arr[index] == target){
            count++;
        }
        countElemnt(arr,index+1,target,count);


    }

    public static void main(String[] args) {
        int arr[] = {10,10, 20, 30, 20, 10, 10};
        int i =0;
        int target = 10;
        int count = 0;

        countElemnt(arr,i,target,count);
    }
}
