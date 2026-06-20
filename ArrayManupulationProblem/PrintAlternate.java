public class PrintAlternate {
    static void printAlternate (int arr[]){
//        time complexity = o(n)
        int n = arr.length;
        int start = 0;
        int end = n-1;
        while (start <= end) {

            if (start == end) {
                System.out.print(arr[start] + " ");
                return;

            } else {
                System.out.print(arr[start] + " ");
                start++;
                System.out.print(arr[end] + " ");
                end--;
            }
        }

    }

    public static void main(String[] args) {
        int arr []= {1,2,3,4,5,6};
        printAlternate(arr);

    }
}
