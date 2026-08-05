import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StringSequences {
    static void getAllSequences(String s , int index,StringBuilder output , List<String >ans){

        // base case
        if(index >= s.length()){
            // subsequences ready he
            String subSequences = output.toString();
            ans.add(subSequences);
            return;
        }
        // i case solve kare
        // include
        char ch = s.charAt(index);
        output.append(ch);
        getAllSequences(s,index +1,output,ans);

        // exclude
        output.deleteCharAt(output.length()-1);
        getAllSequences(s,index+1,output,ans);

    }
    static List<String> powerSet(String s){
        List<String> ans = new ArrayList<>();
        StringBuilder output = new StringBuilder();

        int index =0;
        getAllSequences(s,index,output,ans);
        Collections.sort(ans);
    return ans;
    }

    public static void main(String[] args) {
        String input ="abc";
        List<String > result = powerSet(input);
        System.out.println(result);


    }
}
