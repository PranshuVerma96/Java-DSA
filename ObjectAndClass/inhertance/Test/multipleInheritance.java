// First interface
interface Father {
    void showFather();
}

// Second interface
interface Mother {
    void showMother();
}

// Child class implementing both interfaces
class Child implements Father, Mother {

    public void showFather() {
        System.out.println("This is Father interface");
    }

    public void showMother() {
        System.out.println("This is Mother interface");
    }

    public void showChild() {
        System.out.println("This is Child class");
    }

    public static void main(String[] args) {
        Child obj = new Child();

        obj.showFather();
        obj.showMother();
        obj.showChild();
    }
}