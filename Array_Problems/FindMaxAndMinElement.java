

public class FindMaxAndMinElement {
  static int findMaxElement(int arr[]){
      int maximum = arr[0];
      for(int i =0; i<arr.length; i++){
          if(arr[i] > maximum){
             maximum = arr[i];
          }
      }
      return  maximum;
  }

  static int finMinElement(int arr[]){
      int min = arr[0];
      for(int i =0; i<arr.length; i++){
          if(arr[i]<min){
              min = arr[i];
          }
      }
      return min;
  }

    public static void main(String[] args) {

        int arr[] = {199,200,333,44,220,880};
        for(int i : arr){
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("the maximum number is  ");
        System.out.println(  findMaxElement(arr));

        System.out.println();
        System.out.println("the minimum number is ");
        System.out.println(finMinElement(arr));
    }
}
