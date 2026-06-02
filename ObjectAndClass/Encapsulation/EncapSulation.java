class Encaopsulation {

    // private data members
    private String name;
    private int age;

    // setter methods
    public void setName(String n) {
        name = n;
    }

    public void setAge(int a) {
        age = a;
    }

    // getter methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

// class Main {
//    public static void main(String[] args) {
//
//        // object creation
//        Encaopsulation s1 = new Encaopsulation();
//
//        s1.setName("Rahul");
//        s1.setAge(20);
//
//        System.out.println("Name: " + s1.getName());
//        System.out.println("Age: " + s1.getAge());
//    }
//}