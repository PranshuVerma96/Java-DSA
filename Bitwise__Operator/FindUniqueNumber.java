public class FindUniqueNumber {
    public static void main(String[] args) {

        int arr[] = {10,20,30,13,10,20,30};

        int result = 0;

        for (int num : arr) {
            result ^= num;
        }

        System.out.println("Unique Number = " + result);
    }
}