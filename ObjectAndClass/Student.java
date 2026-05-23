public class Student {
    //    Attributes
    public int id;
    public int age;
    public int nos;
    public String name;
    private String gf;

//    constructor
    // default constructor
//
//    public Student(){
//        System.out.println("studnet construcor called");
//    }

//    parameterized constructor

    public Student(int id, int age, String name, int nos,String gf){
        this.id = id;
        this.age = age;
        this.name = name;
        this.nos = nos;
        this.gf = gf;
    }

    //    copy constructor
    public Student(Student srobj){ // srconj -> A
        this.id = srobj.id;
        this.age = srobj.age;
        this.name = srobj.name;
        this.nos = srobj.nos;
    }


//    behaviours or mehtod

    public void study(){
        System.out.println(name + " studing");
    }

    public void sleep(){
        System.out.println(name + " Sleeping");
    }

    public void bunk(){
        System.out.println(name + " bunking");
    }

    private  void gfChating(){
        System.out.println(name + "GfChating");
    }
}