//package Abstraction;
//
//abstract class Bird {
//    abstract  void  fly();
//    abstract  void eat();
//}
//
//class  sparrows extends Bird{
//    @Override
//    void fly(){
//        System.out.println("the sparrow is a Birds ");
//    }
//    @Override
//    void eat() {
//        System.out.println("Sparrow is sparrow");
//    }
//}
//
//class  crow extends Bird{
//    @Override
//    void fly(){
//        System.out.println("the crow is a Birds ");
//    }
//    @Override
//    void eat() {
//        System.out.println("crow is sparrow");
//    }
//}
//
//
//public class MainClass {
//    public static void main(String[] args) {
//        Bird b = new sparrows();
//
////        this is another class
//        Bird c = new crow();
//        c.fly();
//        c.eat();
//        b.eat();
//        b.fly();
//
//
//
//
//
//
//    }
//}

//interface

package Abstraction;

interface Bird {
    void  fly();
    void eat();
}

interface  Walk{
    int legs = 4; /// this is public static final
    void walking();
}
class  sparrows implements Bird,Walk{
   public void fly(){
       System.out.println("Sparrow flying");
   }
   public void eat(){
       System.out.println("Sparrow eating ");
   }
   public  void  walking(){
       System.out.println("Sparrowing is walking");
   }

}

class  crow implements  Bird{
    @Override
   public void fly(){
        System.out.println("the crow is a Birds ");
    }
    @Override
    public void eat() {
        System.out.println("crow is sparrow");
    }
}


public class MainClass {
    public static void main(String[] args) {
        Bird b = new sparrows();
        Walk v = new sparrows();
        v.walking();

//        this is another class
        Bird c = new crow();
        c.fly();
        c.eat();
        b.eat();
        b.fly();







    }
}
