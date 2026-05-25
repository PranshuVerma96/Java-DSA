class Animal {
    void sound() {
        System.out.println("Animal makes sound");
    }
}

class Cat extends Animal {

    @Override
    void sound() {
        System.out.println("Cat says Meow");
    }
}

public class Main {
    public static void main(String[] args) {

        Cat c = new Cat();

        c.sound();
    }
}