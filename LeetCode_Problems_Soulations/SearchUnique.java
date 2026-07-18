public class SingleNonDuplicateElementUsingBinarySearch {
    static int singleNonDuplicate(int arr[]){
        int n = arr.length;
        int start = 0;
        int end = n-1;

        while(start<=end){
            int mid = start + (end - start)/2;
            // single element
            if(start == end){
                return arr[start];
            }

            // non single element array
            // check wether mid element is answer or not

            int currentValue = arr[mid];
            int preValue = -1;

            if(mid -1 >=0 ){
                preValue = arr[mid -1];
            }
            int nextValue = -1;
            if(mid+1 < n){
                nextValue = arr[mid + 1];
            }
            if(currentValue != preValue && currentValue != nextValue){
                // iska mathlab nahi answer he
                return currentValue;
            }
            if(currentValue != preValue && currentValue==nextValue){
                int startinIndexOfPair = mid;
                if((startinIndexOfPair & 1) ==1){
                    // starting index odd wala case
                    // answer left me hoga
                    // move to left
                    end = mid -1;
                }
                else{
                    // starting index even wala case
                    // anser right me ho ga
                    start = mid + 1;
                }
            } else if (currentValue ==preValue && currentValue != nextValue) {
                int endingIndexOfParir = mid;

                if((endingIndexOfParir & 1)==1){
                    // ending index is odd he
                    // / ans right me hoga
                    start = mid +1;
                }else {
                    // ending index even he
                    // move to left
                    end = mid -1;
                }


            }
        }
        return -1;

    }

    public static void main(String[] args) {
        int arr[] = {1,1,2,3,3,4,4,6,6};
        int result = singleNonDuplicate(arr);
        System.out.println("the answer is: " + result);
    }
}
