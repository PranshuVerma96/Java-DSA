public class AverageOfAlllNumbers {
    static double getAverage(int arr[] ){
       double sum = 0;
        for(int i : arr){
            System.out.print(i + " ");

            sum +=i;
//            timeComplexity = o(n)
//         space complexity = O(1)
        }
        int size = arr.length;
        double average = sum / size;
        return average;
    }
    public static void main(String[] args) {

       int arr [] = {1,3,4,5,6,7,8,9};
       double result = getAverage(arr);
        System.out.println(" ");
        System.out.println("the result is : " + result);

    }
}
