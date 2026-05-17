public class convertUppercaseWithoutFunction {
    static String toUppercase(String str){
        String  result = "";
        for(int i = 0; i< str.length(); i++) {
            char ch = str.charAt(i);

//            check lowercase
            if(ch>='a' && ch<='z'){
                ch = (char)(ch-32);
            }
            result = result+ch;
        }
        return  result;
    }
    static void main() {

        String str = "pranshu verma";
        System.out.println(toUppercase(str));
    }
}
