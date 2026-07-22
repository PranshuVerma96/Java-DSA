public class AddAllElementDivideBy10 {
    public static void main(String[] args) {
        int mul = 1;
        int arr [] = {1,2,3,4,5,6,7};
        for(int i =0; i<=arr.length; i++){
            mul*= i;
        }

//      print all element
        System.out.println();
        for (int i : arr){
            System.out.print(i + " ");
        }

    int division = mul /10;
        System.out.println(division);

    }
}
