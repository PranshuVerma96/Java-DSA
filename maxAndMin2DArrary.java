public class maxAndMin2DArrary {
    static void main() {
        int arr [][] = {{1,2,3}, {145,56,34},{-1,34,99}};

        int max = arr[0][0];
        int min = arr[0][0];

        for(int i = 0 ; i<arr.length; i++){
            for(int j=0; j<arr[i].length;j++){
                if(max<arr[i][j]){
                    max = arr[i][j];
                }
                if(min > arr[i][j]){
                    min = arr[i][j];
                }
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("the max num in array is : " + max);
        System.out.println("the min num in array is : " + min);
    }
}
