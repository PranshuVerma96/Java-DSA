public class frquencyOfCharacter {
    static  int countFrequency(String str , char target){
        int count = 0;
        for(int i = 0; i<str.length();i++){
            if(str.charAt(i) == target){
                count++;
            }
        }
        return count;
    }
    static void main() {
        String str = "Papaya";
        System.out.println(countFrequency(str , 'a'));
    }
}
