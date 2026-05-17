import java.util.Scanner;

public class stringBasic {
    static void main() {
        String firstName = "Pranshu";
        String lastName = "Verma";
        //System.out.println(firstName +" " + lastName );
//        System.out.println(firstName[0]); that is not working

       // System.out.println(firstName.length());
       // System.out.println(firstName.charAt(0));


//        sting is immutable

        String name = "Rana";
//        name[0] = 'p';
        name = "Papa";
     //   System.out.println(name);

//        compare string
//        == that is compare both strings are refers same memory location in place of comparing actual content.
        String name1 = "love";
        String name2 = "love";
        if(name1 == name2){
            //System.out.println("both are equal ");
        }
        else{
            //System.out.println("both are not equal ");
        }

//        compare using .equal() method that is compare actual content.
//        that method is case sensitive .
        String name3 = "love1";
        String name4 = "love1";

        if(name3.equals(name4)){
          //  System.out.println("Both sting are equal");
        }
        else{
            //System.out.println("Both are not equals");
        }

//        using equalIgnoreCase menthod that compare actual content but
//        that is not case sensitive

        String name5 = "love";
        String name6 = "LOVE";

        if(name5.equalsIgnoreCase(name6)){
           // System.out.println("both string are same");
        }
        else {
          //  System.out.println("Both are not same ");
        }

//        sting input

//        using next() method take input but ever you game space between that neglate
//        those perticuar string

//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter the data " );
//        String data = sc.next();
//        System.out.println(data);


       // sc.nextLine();
//        System.out.println("Enter the data2 ");
//        String data2 = sc.nextLine();
//        System.out.println(data2);

//        sting method

//        String str = "pranshu";
//        System.out.println(str.length());
//        System.out.println(str.charAt(0));
//
//        String str2 = "Pranshu";
//        System.out.println(str.equals(str2));
//        System.out.println(str.equalsIgnoreCase(str2));

//        empty length = 0
//        blank empty or only spaces

        String myName = "   ";
//        System.out.println(myName.isEmpty());
//        System.out.println(myName.isBlank());

//        String myData = "   Pranshu     ";
//        System.out.println(myData.length());
//       name =  myData.trim();
////        System.out.println(myData.trim());
      //  System.out.println(name.length());

        String dataValue = "Pranshu";
//        System.out.println(dataValue.toUpperCase());
//        System.out.println(dataValue.toLowerCase());

//        beginIndex = 4 inclusive
//        endIndex = 7 exclusive

        String str = "mY name is Pranshu";
//        System.out.println(str.substring(4,7));

//        contains mehtod

       // System.out.println(str.contains("Pranshu")); // true

        int value  = 12345;
//        String strValue = String.valueOf(value);
//        System.out.println(value + 1);
//        System.out.println(strValue + 1);

//        System.out.println(str.startsWith("my"));
//        System.out.println(str.endsWith("nshu"));

//        String nameValue = "PRanshu";
//        char [] crr = nameValue.toCharArray();
//        for (char strdata : crr){
//            System.out.print(strdata + " ");
//
//
//        }

//        split method
//     String myNameData = "pranshu , is, a , studnet";
//  String words [] =  myNameData.split(",");
//  for(String w: words){
//      System.out.print(w + " " );
//  }


//        replace
        String Data = "Pranshu verma";
        String Data2 = "Panday";
        System.out.println(Data.replace("verma" , Data2));

    }
}
