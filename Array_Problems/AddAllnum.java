public class AddAllnum {
    public static void main(String[] args) {
        int sum = 0;
        int arr [] = {1,2,3,4,5,6,7};
        for(int i =0; i<=arr.length; i++){
            sum += i;
        }

//        print all element
        System.out.println();
        for (int i : arr){
            System.out.print(i + " ");
        }

        System.out.println("the total sum is " + sum);
    }
}
