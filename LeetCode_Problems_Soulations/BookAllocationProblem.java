public class BookAllocationProblem {

    static boolean isValidAnswer(int arr[], int k , int maxPares){
        // check wherter mixPages is avalid soultion or not
        int studentCount = 1;
        int pages = 0;
        for(int i =0; i<arr.length; i++){
            if(pages + arr[i] <= maxPares){
                // iska matlab current book can be assigned
                // not out of limet
                pages = pages + arr[i];
            }
            else {
                // current studnet ki current book
                // cannot assigned
                studentCount++;
                if(studentCount >k || arr[i] > maxPares){
                    return false;
                }
                else{
                    // can assign to new studnet
                    pages = 0;
                    pages = pages+arr[i];
                }
            }
        }
        return  true;

    }
    static int findPages(int arr[], int k){

        // to find a valid answer books count must be >= studnet present
        if(arr.length <k){
            return -1;
        }
        int n = arr.length;
        int s = 1;


        int sum = 0;

        // for end find the sum of the total array element
        for(int i =0; i<n; i++){
            sum += arr[i];
        }

        int e = sum;
        int ans = -1;
        while (s<=e){
            int mid = s + (e-s)/2;

            if(isValidAnswer(arr,k,mid)){
                // true bala case
                ans = mid;
                e = mid-1;
            }
            else{
                // false bala case
                s = mid + 1;
            }
        }
        return  ans;
    }

    public static void main(String[] args) {
        int arr[]= {10,20,30,40,50};
        int k = 4;

        int ans = findPages(arr,k);
        System.out.println(ans);
    }
}
