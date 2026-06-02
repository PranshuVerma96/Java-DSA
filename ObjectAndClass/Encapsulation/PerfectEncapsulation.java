 class StudentData {
    //    Attributes
  private int id;
  private int age;
 private int nos;
  private String name;
    private String gf;

//    that is get method to get the private value
    public String  getName(){
        return  this.name;
    }
    public  int getAge(){
        return  this.age;
    }

    public String getGF(){
        return this.gf;
    }

    public int getId(){
        return  this.id;
    }

//    Set method this is the method to set the private value
     public void setAge(int a){
//        extra layer of authentication

         if (a <100) {
             this.age = a;
         }
         else {
             System.out.println("Sorry you can not do this if you want to change give me age less then 100");
         }
         return;
     }

//    constructor
    // default constructor
//
//    public Student(){
//        System.out.println("studnet construcor called");
//    }

//    parameterized constructor

    public StudentData(int id, int age, String name, int nos,String gf){
        this.id = id;
        this.age = age;
        this.name = name;
        this.nos = nos;
        this.gf = gf;
    }

    //    copy constructor
    public StudentData(Student srobj){ // srconj -> A
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

public class PerfectEncapsulation {
    public static void main(String[] args) {

        StudentData d1 = new StudentData(1,12,"Pranshu",5,"sanaya");
//        System.out.println(d1.name); not woring because value is private

        System.out.println(d1.getName());
        System.out.println(d1.getGF());
        System.out.println(d1.getAge());
        System.out.println(d1.getId());

//        calling setter method

//        d1.age = 45; this is not direct possible to change age
        d1.setAge(145);
        System.out.println(d1.getAge());
    }

}
