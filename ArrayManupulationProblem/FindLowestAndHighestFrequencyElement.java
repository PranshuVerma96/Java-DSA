import java.util.HashMap;

public class FindLowestAndHighestFrequencyElement {
    static  int[] getHighlestLowestFrequenceyElement(int arr[]){
        HashMap<Integer , Integer> freq = new HashMap<>();
//        insert data

        for(int num : arr){
            freq.put(num,freq.getOrDefault(num ,0) + 1);
        }
//        hashmap is ready
        int highFreq = Integer.MIN_VALUE;
        int highestNum = -1;

        for(int key : freq.keySet()){

            int currenyKey = key;
            int currenetfreq = freq.get(key);
            if(currenetfreq > highFreq);
            highFreq = currenetfreq;
            highestNum = currenyKey;
        }

        int lowestFreq = Integer.MAX_VALUE;
        int lowestNum = -1;
        for(int key : freq.keySet()){
            int currentKey = key;
            int currentFreq = freq.get(key);
            if(currentFreq < lowestFreq){
                lowestNum = currentKey;
                lowestFreq = currentFreq;
            }
        }
        int ans[] = {highestNum , lowestNum};
        return  ans;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,5,1,1,1,1,2,2,3,4,1};
        int ans[] = getHighlestLowestFrequenceyElement(arr);
        System.out.println("highestfreq " + ans[0] );
        System.out.println("lowestfreq " + ans[1] );

    }


}
