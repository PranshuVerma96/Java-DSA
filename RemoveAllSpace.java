public class RemoveAllSpace {
//    static void removeSpacees(String str){
//        String result =str.trim();
//        System.out.println(result);
//    }

    static void removeAllSpace(String str){
        String result = "";
        for(int i = 0; i< str.length(); i++){
            char ch = str.charAt(i);
            if(ch!=' '){
                result+= ch;
            }
        }
        System.out.println(result);
    }
    static void main() {
        String str = "   pran  shu  ";
       // removeSpacees(str);
        removeAllSpace(str);
    }
}
