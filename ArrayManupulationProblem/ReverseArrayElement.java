public class ReverseArrayElement {
    static void reverseArray(int arr[]){
        int start = 0;
        int end = arr.length - 1;
//.   time complexity =.o (n)

        System.out.println("Orignal array ");
        for(int i : arr){
            System.out.print(i + " ");
        }
        while (start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start ++;
            end --;
        }
        System.out.println();
        System.out.println("the Reverse array");
        for(int i : arr){
            System.out.print(i  + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8};
        reverseArray(arr);
    }
}

//time complextiy = o(n)
