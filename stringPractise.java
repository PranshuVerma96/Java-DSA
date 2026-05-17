public class stringPractise {
    static void printString(String str){
        int n = str.length();
        for(int i=0; i<n; i++){
            char ch = str.charAt(i);
            System.out.println(ch);
        }
    }

    static  int stringLenghtCount(String str){
      char[] arr = str.toCharArray();
      int lenght = arr.length;
       return  lenght;
    }

    static int countVowelFromString(String str){
        int vowel = 0;
        for(int i =0; i<str.length(); i++){
            char ch = str.charAt(i);

            if(ch == 'a' || ch=='e' ||ch=='i' || ch=='o' || ch=='u' ||
                    ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U'){
                vowel++;
            }
        }
        return vowel;

    }

//    static  void reverseString(String str){
//
//        char [] arr = str.toCharArray();
//
//
//     int start = 0;
//     int end = arr.length-1;
//
//      while (start < end){
//          char temp = arr[start];
//          arr[start] = arr[end];
//          arr[end] = temp;
//
//          start++;
//          end--;
//      }
//        System.out.println(new String(arr));
//    }

    static  String reverseString(String str){
        String  reverse = "";
        int n = str.length();
        for(int i = n-1; i>=0; i--){
            char ch = str.charAt(i);
            reverse = reverse + ch;
        }
        return  reverse;
    }

    static  boolean checkPalindrome(String  str){
        String oringnal = str;
        String reverse = reverseString(oringnal);
        for(int i = 0; i<oringnal.length(); i++){
            char ch1 = oringnal.charAt(i);
            char ch2 = reverse.charAt(i);
            if(ch1!=ch2){
                return  false;
            }
        }
        return  true;
    }

    static void main() {
//        Pring each character of the string

        String name = "Pranshu Verma ABCDE";
      //  printString(name);

//        count lenght of String without length()
      //  System.out.println(stringLenghtCount(name));

//        count vowel of the string

        System.out.println(countVowelFromString(name));

//

//        reverse a string
        System.out.println(reverseString(name));

//        string palindrome or not


        String str ="moom";
        System.out.println(checkPalindrome(str));

    }
}
