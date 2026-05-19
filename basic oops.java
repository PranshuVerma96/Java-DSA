class Car {
    String color;
    int speed;

    void drive() {
        System.out.println("Car is driving");
    }
}
public class Main {
    public static void main(String[] args) {
        Car c1 = new Car();  // object creation
        c1.color = "Red";
        c1.speed = 100;

        c1.drive();
    }
}