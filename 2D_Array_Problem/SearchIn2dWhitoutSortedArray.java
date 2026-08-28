public class SearchIn2dWithoutSortedElement {
    static boolean searchIn2DWithoutSortElemnt(int arr[][],int target){
        int totalRow = arr.length;
        int totalCol = arr[0].length;

        int row =0;
        int col = totalCol - 1;

        while(row < totalRow && col>=0){
            if(arr[row][col]==target){
                return true;

            } else if (arr[row][col] > target) {
                col--; // move to left

            }else{
                // arr[row][col] <target // move to bottom
                row++;
            }
        }
        
        return false;
    }

    public static void main(String[] args) {
        int arr[][] = {{1,4,7,11,15},{2,5,8,12,19},{10,13,14,17,24}};
        int target = 5;
        System.out.println( searchIn2DWithoutSortElemnt(arr,target));
    }
}
