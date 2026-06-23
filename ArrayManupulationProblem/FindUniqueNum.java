public class FindUniqueNum {
    static int findUniqueNum(int arr[]){
        int xorSum = 0;
        for(int i : arr){
            xorSum =xorSum ^ i;
        }
        return xorSum;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,1,2,3};
        System.out.println("the oringnal array" );
        for (int i: arr){
            System.out.print(i + " ");

        }

        int result = findUniqueNum(arr);
        System.out.println();
        System.out.println("the uqnique element is ");
        System.out.println(result);

    }
}
