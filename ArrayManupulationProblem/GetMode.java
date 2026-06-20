import java.util.HashMap;
import java.util.HashSet;

public class GetMode {
    static int getMode(int arr[]){
        HashMap<Integer, Integer> frequencey = new HashMap<>();

        for(int num : arr){
            frequencey.put(num, frequencey.getOrDefault(num ,0) + 1);
        }
//        for(int i : frequencey.keySet()){
//            System.out.println(i + " ==> " + frequencey.get(i));
//        }
        int maxFreq = -1;
        int maxFrequkey = -1;

        for(int key : frequencey.keySet()){
            int currentKey = key;
            int currentKeyFrequency = frequencey.get(key);
            if(currentKeyFrequency > maxFrequkey){
//                finde nex max
                maxFreq = currentKeyFrequency;
                maxFrequkey = currentKey;
            }
        }
//jab loop se out
        return maxFrequkey;
    }

    public static void main(String[] args) {
        int arr [] = {1,2,3,4,5,1,2,2,2,3};
        int result = getMode(arr);
        System.out.println(result);
    }
}
