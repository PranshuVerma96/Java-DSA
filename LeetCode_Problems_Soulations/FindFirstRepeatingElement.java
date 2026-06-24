import java.util.HashMap;

public class FindFirstRepeatingElement {
    static int findFirstRepeatingElement(int arr[]){
        HashMap<Integer , Integer> freq = new HashMap<>();
        for(int i : arr){
            freq.put(i,freq.getOrDefault(i,0)+1);

        }
        for(int i : arr){
            if(freq.get(i) > 1){
                return  i;
            }
        }
//        ager koi bhi freq > 1 nahi he
        return  -1;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,2,1};
        System.out.println("the original array is ");
        for(int i : arr){
            System.out.print(i + " ");
        }
        System.out.println();
        int result = findFirstRepeatingElement(arr);
        System.out.println("repeating frequency element is :=> " + result);
    }
}
