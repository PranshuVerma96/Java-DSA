public class InterSectionInArrays {
    public static void main(String[] args) {
        int arr [] = {1,2,3,4,5,6};
        int brr [] = {1,5,7,8,3,};
        int comman = 0;
        
        for(int i =0; i<arr.length; i++){
            for(int j = 0; j<brr.length; j++){
                if(arr[i] == brr[j]){
                     comman = arr[i];
                    System.out.print( comman + " ");
                    break;
                }
            }

        }

        
     }
}
