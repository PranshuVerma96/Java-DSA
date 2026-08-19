
public class MergeSort {
    static  void merge(
            int arr[],
            int s,
            int e,
            int mid
    ){
        int leftArrayLen = mid - s+1;
        int rightArrayLen = e -mid;

        // array inslize
        int leftArr[] = new int[leftArrayLen];
        int rightArr[] = new int[rightArrayLen];

        // copy the left half content of arra into leftarr
        int k =s;
        for (int i=0; i<leftArrayLen;i++){
            leftArr[i] = arr[k];
            k++;
        }
        //copy the right half content of arr into rightArr
        k = mid +1;
        for(int i=0; i<rightArrayLen; i++){
            rightArr[i] = arr[k];
            k++;
        }
        // merge logic
        int i=0;
        int j = 0;
        k = s;

        while(i<leftArrayLen && j<rightArrayLen){
            if(leftArr[i] < rightArr[j]){
                arr[k] = leftArr[i];
                i++;
                k++;
            }
            else{
                // right array ko paste karo
                arr[k] = rightArr[j];
                j++;
                k++;
            }
        }
        // left array is fully consumed and right is not
//        then copy rem elements of right array

        while (j< rightArrayLen){
            arr[k] = rightArr[j];
            j++;
            k++;
        }
        // right array is fully consumed and left array is not
        // then compy all remaining elemes of right array is orignal array
        while (i<leftArrayLen){
            arr[k] = leftArr[i];
            i++;
            k++;
        }

    }
    static void mergeSort(int arr[],int l, int r){
        // base case
        int s = l;
        int e = r;
        if(s>=e){
            //invalid array
            return;
        }
        // break into 2 halves
        int mid = s+(e-s)/2;
        // lets sort the left array
        mergeSort(arr,s,mid);
        // lets sort the right array
        mergeSort(arr,mid+1,e);

        // merge both the hafes
        merge(arr,s,e,mid);

    }

    public static void main(String[] args) {
        int arr[] = {9,2,3,1,4,5};
        int start = 0;
        int end = arr.length-1;
        mergeSort(arr,start,end);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
