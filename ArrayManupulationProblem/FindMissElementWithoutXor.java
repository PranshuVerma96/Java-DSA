public class FindMissElementWithoutXor {
    static int findMissElement(int arr[]){
        int n = arr.length + 1;

//        total sum including missing
        int expectedSum = n*(n+1)/2;
        int sum =0;
        for(int i:arr){
            sum+=i;
        }
        return expectedSum - sum;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,7};

        System.out.println("orignal array");
        for(int i : arr){
            System.out.print(i + " ");
        }
        int result = findMissElement(arr);
        System.out.println();
        System.out.println("missing element ");
        System.out.println(result);
    }

}


