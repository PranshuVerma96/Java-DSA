public class MultiplyBy10 {
//    time complexity = o(n)
//    space complexity = o(n)
    static int[] multiplyby10(int arr []){
        int size = arr.length;
        int newArray []=  new int[size];
        for(int i = 0; i<size; i++){
            int element = arr[i];
            int newElement = element * 10;
            newArray[i] = newElement;

        }
        return  newArray;
    }
    public static void main(String[] args) {
//        System.out.println("hello world");
        int arr[] = {1, 2 ,3, 4, 5,};
        System.out.println("the orignal array ");
        for(int i:arr){
            System.out.print(i + " ");
        }

        System.out.println("");
        System.out.println("Updated array");
       int ans[] = multiplyby10(arr);
       for(int i :ans){
           System.out.print(i + " ");
       }
    }
}
