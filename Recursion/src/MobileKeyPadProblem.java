import java.util.ArrayList;
import java.util.List;

public class PhoneKeypadProblem {
    static void solve(
            String digits,
            int index,
            String[]mapping,
            List<String> result,
            StringBuilder output
    ){
        // base case
        // jise he index input ke bhar nikal jaiyga
        // out pust ready he
        if (index >= digits.length()){
            result.add(output.toString());
            return;
        }
        // ek case bughe solve karna he
        // baki resusion sobmal lega
        int value = digits.charAt(index) - '0';
        String mappedString = mapping[value];
        // current value and uski mapped string mare pass ready he
        // current block per rah the
        // example value = 5 and mapped string = jkl he
        for (int i=0; i<mappedString.length(); i++){
            output.append(mappedString.charAt(i));
            solve(digits,index+1, mapping,result,output);
         // backtrackin bala step
         output.deleteCharAt(output.length()-1);
        }
    }
    static List<String> letterCombinations(String digits){
        String[] mapping = {"","","abc","def","ghi","jkl" ,"mno" ,"pqrs" ,"tuv" ,"wxyz"};
        int index = 0;
        List<String> result = new ArrayList<>();
        StringBuilder output = new StringBuilder();

        solve(digits,index,mapping,result,output);
        return result;
    }

    public static void main(String[] args) {
        String digits = "345";
        List<String> ans = letterCombinations(digits);
        System.out.println(ans);
    }
}
