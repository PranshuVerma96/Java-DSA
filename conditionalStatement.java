import java.util.Scanner;

public class conditionalStatement {
    static void main() {
//        int dailyPractice = 12;
//        if(dailyPractice >= 10){
//            System.out.println("good consistency");
//        }

//        int age = 10;
//        if(age >=18) {
//            System.out.println("You are eligible for vote");
//        }


        int age = 30;
        if (age >= 18) {
            System.out.println("Can vote");
        } else {
            System.out.println("Can not vote");
        }

//        if else if statement

        int statement = 70;

        if (statement >= 90) {
            System.out.println("Excellent");
        } else if (statement >= 80) {
            System.out.println("Tik he ");
        } else if (statement >= 70) {
            System.out.println("tik tak ");
        } else {
            System.out.println("mahnat karo bahi ");
        }

        int day = 3;

        if (day == 1) {
            System.out.println("Sunday");
        } else if (day == 2) {
            System.out.println("Monday");

        } else if (day == 3) {
            System.out.println("Tuesday");
        } else if (day == 4) {
            System.out.println("Wednesday");
        } else if (day == 5) {
            System.out.println("Thursday");
        } else if (day == 6) {
            System.out.println("Friday");
        } else if (day == 7) {
            System.out.println("Satursday");
        } else {
            System.out.println("Din karab he ");
        }

//        nested if else

        int ageNum = 24;
        if (ageNum >= 18) {
            if (ageNum >= 25) {
                System.out.println("You can marrige and can vote also ");
            } else {
                System.out.println("Abhi padhi karo ");
            }
        } else {
            System.out.println("kush mat karo ");
        }

        //    tarnary operator

        int isMale = 1;
        String dataValue = (isMale == 1) ? "You are male " : "chose another";
        System.out.println(dataValue);

        int ageData = 12;
        String resultData = (ageData >= 10) ? "You are a kids right now " : "You are a Teenager";
        System.out.println(resultData);


//        Switch Satement

        System.out.println("Enter a value for day :");
        Scanner sc = new Scanner(System.in);

        int dayName = sc.nextInt();

        switch (dayName) {
            case 1:
                System.out.println("Today is monday");
                break;

            case 2:
                System.out.println("Today is tuesday");
                break;

            case 3:
                System.out.println("Today is wednesday");
                break;

            case 4:
                System.out.println("Today is thursday");
                break;

            case 5:
                System.out.println("Today is friday");
                break;

            case 6:
                System.out.println("Today is staursday");
                break;

            case 7:
                System.out.println("today is sunday");
                break;

            default:
                System.out.println("Please enter valid day number ");
        }

//        A problem for practise

        System.out.println("Please enter how many problem which you solved :");
        int problemSolved = sc.nextInt();

        if(problemSolved >= 300) {
            System.out.println("Advance level");
        }
        else if (problemSolved >= 150) {
            System.out.println("Intermediate level");
        }
        else {
            System.out.println("Beginner");
        }

    }
}
