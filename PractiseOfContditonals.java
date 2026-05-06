import java.util.Scanner;

public class PractiseOfContditonals {
    static void main() {
//        Take age input and print if he is eligible to vote or not
//        System.out.println("Enter you age : ");
//
        Scanner sc = new Scanner(System.in);
//        int age = sc.nextInt();
//
//        if(age >= 18) {
//            System.out.println("You can vote");
//
//        }
//        else {
//            System.out.println("You can not vote ");
//        }

//        Take input 5 subject's marks and print the overall percentage of students

//        System.out.println("Enter the marks of English :");
//        int engMarks = sc.nextInt();
//
//        System.out.println("Enter the marks of Maths :");
//        int mathMarks = sc.nextInt();
//
//        System.out.println("Enter the marks of Hindi :");
//        int hindiMarks = sc.nextInt();
//
//        System.out.println("Enter the marks of Physics :");
//        int phyMarks = sc.nextInt();
//
//        System.out.println("Enter the marks of Chemistery :");
//        int cheMarks = sc.nextInt();
//
//        float result = engMarks + hindiMarks + phyMarks + mathMarks + cheMarks ;
//        System.out.println("The total of marks : " + result );
//
//        float percetage = ((result * 100)/500);
//        System.out.println("Percentage of total marks : " + percetage);
//

//        take input a lowercase character and print its upercase version

        System.out.println("Enter you name : ");
        String name = sc.nextLine();

        if(name.toLowerCase() == name){
            System.out.println(name.toUpperCase());
        }

//        take input a lowercase character and print its lowercase version
        System.out.println("Enter your name in Uppercase ");
        String upName = sc.nextLine();

        if(upName.toUpperCase() == upName){

            System.out.println(upName.toLowerCase());
        }

//        take input 5 subject 's marks drop the least one and calculate the overall
        // percentage considering only the top 4 makrs , print it

        System.out.println("Enter the marks of Hindi");
        int markHin = sc.nextInt();

        System.out.println("Enter the marks of English");
        int markEng = sc.nextInt();

        System.out.println("Enter the marks of Math");
        int markMath = sc.nextInt();

        System.out.println("Enter the marks of Physics");
        int markPhy = sc.nextInt();

        System.out.println("Enter the marks of Chemistery");
        int markChe = sc.nextInt();

        int reatTotalMarks = markHin + markEng + markMath + markChe + markPhy;
        int totalMarksDropWithOneSub = markHin  + markMath + markChe + markPhy;

        System.out.println(reatTotalMarks);

        float percentage = (((totalMarksDropWithOneSub) * 100)/400);
        System.out.println("Your percentage is " + percentage);
    }
}
