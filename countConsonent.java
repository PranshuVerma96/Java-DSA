public class countConsonent {

    static  int countConsonent(String str){
        int count = 0;
        for(int i = 0; i<str.length();i++){
            char ch = str.charAt(i);
            if(ch=='A' || ch=='E'|| ch=='I' || ch=='O' || ch== 'U' || ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){

            }else{
                count++;
            }
        }
        return count;
    }
    static void main() {

        String str = "Pranshu";

        System.out.println(countConsonent(str));

    }
}
