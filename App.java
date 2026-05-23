public class App {
    public static void main(String[] args) {
        Student s1 = new Student(1,32,"RAm",5,"Sanaya");

        System.out.println(s1.name);
        System.out.println(s1.age);
        System.out.println(s1.id);
        System.out.println(s1.nos);
//        System.out.println(s1.gf);


        s1.sleep();
        s1.bunk();
        s1.study();

    }
}
