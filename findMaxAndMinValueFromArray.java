public class findMaxAndMinValueFromArray {
    static void main() {

//        task print all array element and multiply on them to each other
        int arr [] = {1,2,3,4,5};
        int n = arr.length;
        int mul = 1;
        for(int i =0; i<n; i++){
            mul*=arr[i];
            //System.out.println("the element is : " + arr[i]);

        }
        // System.out.println("After multiplication ans is ==> " + mul);

//        task -3 find maximum and minimum  value of the array
        int crr[] = {1,3,5,36,7,20,-1};
        int max = crr[0];
        int min = crr[0];

        for(int i = 0; i<crr.length; i++){
            System.out.println(crr[i]);
            if(crr[i] > max){
                max = crr[i];
            }
            if(min > crr[i]){
                min = crr[i];
            }
        }
        System.out.println("the minimum element is: " + min);
        System.out.println("the max element is : " + max);

    }
}
