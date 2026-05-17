public class StringContainOnlyDigit {
    static boolean stringContainDigit(String  str){
        for(int i = 0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(ch< '0' || ch>'9'){
                return false;
            }
        }
        return true;
    }
    static void main() {

        String  str = "4231";
        System.out.println(stringContainDigit(str));
    }
}
