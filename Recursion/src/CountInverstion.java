public class CountInversion {
    static int merge(int arr[],int s, int e, int mid){
        //.left Array and right Arry create kiye the
        // jisme hume original array se values copy ki thi
        int leftArrLen = mid -s+1;
        int rightArrLen = e-mid;

        int leftArr[] = new int[leftArrLen];
        int rightArr[] = new int[rightArrLen];

        int k = s;
        // left array copy element
        for(int i =0; i<leftArrLen; i++){
            leftArr[i] = arr[k];
            k++;
        }
//    right array copy element
        k = mid +1;
        for (int i = 0; i < rightArrLen; i++) {
            rightArr[i] =  arr[k];
            k++;
        }


        // merge ka logic
        int i =0;
        int j =0;
         k =s;
         int invCount = 0;

         while (i<leftArrLen && j <rightArrLen){
             if(leftArr[i] <= rightArr[j]){
                 arr[k] = leftArr[i];
                 k++;
                 i++;
             }else{
                 // leftArr[] > rightArr[j]
                 // merge balwa logic
                 arr[k] =   rightArr[j];
                 j++;
                 k++;

                 // inversion ka logic
                 invCount = invCount + (leftArrLen - i);
              }

         }
         while(i <leftArrLen){
             arr[k] = leftArr[i];
             i++;
             k++;
         }
         while (j<rightArrLen){
             arr[k] = rightArr[j];
             j++;
             k++;
         }
         // inversion Count return karo
        return invCount;
    }
    static int mergeSort(int arr[],int s, int e){
        // base case
        if(s>=e){
            return 0;
        }
        // 2 part me break
        int mid = s+(e-s)/2;
        // left array sort karwate h rec se
        int leftInversions = mergeSort(arr,s,mid);

        // right array sort karwate he rec se
        int rightInversions =  mergeSort(arr,mid+1,e);

        // merge both sorted arry
        int intermediateInversions = merge(arr,s,e,mid);

        int invCount = leftInversions + rightInversions + intermediateInversions;
    return invCount;
    }
    static int inversionCount(int arr[]){
        int s = 0;
        int e = arr.length-1;
        int ans = mergeSort(arr,s,e);
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = {2,4,1,3,5};
        int ans = inversionCount(arr);
        System.out.println(ans);
    }
}
