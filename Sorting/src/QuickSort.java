public class QuickSort {
    private static  int partition(int arr[],int low, int high){
        // choose pivot element jo bi app chato
        int s= low;
        int e = high;
        int pivotElement = arr[s];
        // is pivot ko iski sahi position per rak do

        // count based approach
        int count = 0;
        for(int i=s+1; i<=e; i++){
            if(arr[i] <= pivotElement){
                count++;
            }
        }
        //place the pivot element on at corrent postion
        int correctPostion = s + count;

        // swap pivot element with element that is present at ist corrent pistion
        int temp = arr[correctPostion];
        arr[correctPostion] =  arr[s];// arr[pivotElemnt] also
        arr[s] = temp;

        // ab bas left and right me make sure chtote bade elemen
        int i = s;
        int j  = e;
        while (i<correctPostion && j>correctPostion){
            // left part me jitne bi shai element he
            // un element ko ignore kao jo pivot se cote he
            while (arr[i] <= pivotElement){
                i++;
            }
            // right bae part me jitne bi element bade he kush mat karo
            while (arr[j] > pivotElement){
                j--;
            }
            // app ek isi place per he jaham mughe arr[i] arr[j] wqap karna chiye
            if(i <correctPostion && j > correctPostion){
                int temp2 = arr[i];
                arr[i] = arr[j];
                arr[j] = temp2;
                i++;
                j--;

            }
        }
        return correctPostion;
    }
    static void quickSort(int arr[] ,  int low, int high){
        int s = low;
        int e = high;

        // base case
        if(s>e){
            return;
        }
        if(s==e){
            return;
        }

        // paritioning
        int pivotIndex = partition(arr,s, e);

        // left part recurison se sort karobao
        quickSort(arr,s,pivotIndex-1);

        // right part recursion se sort karobao
        quickSort(arr,pivotIndex+1,e);
    }

    public static void main(String[] args) {
        int arr[] = {3,2,4,6,9,7,8};
        int s = 0;
        int e = arr.length-1;
        quickSort(arr,s,e);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");

        }

    }
}
