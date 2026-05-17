public class countChar {
    static  int countChar(String  str){
        int count =0;
        for(int i =0; i<str.length();i++){
            count++;

        }
        return count;
    }
    static void main() {
        String  str = "pranshu";
        System.out.println(countChar(str));

    }
}
