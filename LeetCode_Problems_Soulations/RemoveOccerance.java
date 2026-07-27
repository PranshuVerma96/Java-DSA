package String_Problem;

public class RemoveAllOccurance {
    static String removeOccurance(String str, String part){
        // kab tak sare 2 steps karege
        // jab tk part exist karta he

        while (str.contains(part)){
            // search part inside s
            int index = str.indexOf(part);
            // create a new string after removeing the part and concatinate the left and right part
            str = str.substring(0,index)+ str.substring(index + part.length());

        }
        return str;
    }

    public static void main(String[] args) {
        String name = "abxabyabzab";
        String part = "ab";
        String result = removeOccurance(name,part);
        System.out.println(result);
    }
}
