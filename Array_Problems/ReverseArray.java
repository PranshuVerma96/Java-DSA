public class ReverseArray {
    public static void main(String[] args) {
        int arr [] = {1,2,3,4,5,6};
        int start = 0;
        int end = arr.length - 1;
        System.out.println("Orignal array : " );
        for(int i : arr){
            System.out.print( i + " ");
        }

        while (start < end){
            int tem = arr[start];
            arr[start] = arr[end];
            arr[end] = tem;

            start ++;
            end --;
        }
        System.out.println();
        System.out.println("After reverse array " );
        for(int i : arr){
            System.out.print(i + " ");
        }

    }
}
