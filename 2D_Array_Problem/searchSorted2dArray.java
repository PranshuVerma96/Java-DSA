public class SearchIn2DMatrix {
    static int searchIn2D(int arr[][] , int target){
        int start =0;
        int totalRow = arr.length;
        int totalCol = arr[0].length;

        int n = totalRow * totalCol; // thal will give total item
        int end = n-1;
        int ans = -1;
        while (start <= end){
            int mid = start + (end - start)/2;
            int rowIndex = mid/totalCol;
            int colIndex = mid%totalCol;

            if(arr[rowIndex][colIndex] == target){
                ans = arr[rowIndex][colIndex];
                return ans;
            }
            else if (arr[rowIndex][colIndex]>target){
                // got to left
                end = mid-1;
            }
            else {
                start = mid +1;
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        int arr[][]={{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int target = 3;
        int result = searchIn2D(arr , target);
        System.out.println(result);
    }
}
