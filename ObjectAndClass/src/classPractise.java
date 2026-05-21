

// studnet class
class Student {

    String name;
    int rollNo;

    public static void main(String[] args) {

        Student s1 = new Student();

        s1.name = "Rahul";
        s1.rollNo = 101;

        System.out.println("Name: " + s1.name);
        System.out.println("Roll No: " + s1.rollNo);
    }
}

// reactangle area with area
//
//class Rectangle {
//
//    int length = 10;
//    int width = 5;
//
//    void calculateArea() {
//        int area = length * width;
//        System.out.println("Area: " + area);
//    }
//
//    public static void main(String[] args) {
//
//        Rectangle r1 = new Rectangle();
//
//        r1.calculateArea();
//    }
//}
//
//// Mobile class
//
//class Mobile {
//
//    String brand = "Samsung";
//    int price = 20000;
//
//    void showDetails() {
//
//        System.out.println("Brand: " + brand);
//        System.out.println("Price: " + price);
//    }
//
//    public static void main(String[] args) {
//
//        Mobile m1 = new Mobile();
//
//        m1.showDetails();
//    }
//}
//
////bank account
//
//class BankAccount {
//
//    String accountHolder = "Aman";
//    int balance = 5000;
//
//    void deposit(int amount) {
//        balance = balance + amount;
//        System.out.println("Deposited: " + amount);
//    }
//
//    void withdraw(int amount) {
//        balance = balance - amount;
//        System.out.println("Withdrawn: " + amount);
//    }
//
//    void showBalance() {
//        System.out.println("Current Balance: " + balance);
//    }
//
//    public static void main(String[] args) {
//
//        BankAccount b1 = new BankAccount();
//
//        b1.showBalance();
//
//        b1.deposit(2000);
//
//        b1.withdraw(1000);
//
//        b1.showBalance();
//    }
//}
