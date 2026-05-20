//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

//        default

//        Student A = new Student();
//        A.id = 1;
//        A.age = 34;
//        A.name = "Pranshu";
//        A.nos = 5;
//
//        System.out.println(A.age);
//        System.out.println(A.name);
//        System.out.println(A.id);
//        System.out.println(A.nos);
//
////        methods
//        A.bunk();
//        A.study();;
//        A.sleep();

//        parameterized constrouctor

        Student A = new Student(1, 12, "PRanshu" ,5);
//        System.out.println(A.age);
//        System.out.println(A.name);
//        System.out.println(A.id);
//        System.out.println(A.nos);
//
//       // methods
//        A.bunk();
//        A.study();;
//        A.sleep();

//        copy constructor
        int a = 6;
        int b = a;

        Student B = new Student(A);
        System.out.println(B.age);
        System.out.println(B.name);
        System.out.println(B.id);
        System.out.println(B.nos);

        B.sleep();

//        new instance of studnet

        Student C = new Student(1,45,"Sandesh",9);
            C.sleep();
            C.study();
            C.bunk();
    }
}