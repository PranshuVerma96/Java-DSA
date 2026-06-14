import java.lang.Comparable;

public class StudentExample implements Comparable<StudentExample> {

    private int age;
    private String name;
    private int weight;

    // Constructor
    public StudentExample(int age, String name, int weight) {
        this.age = age;
        this.name = name;
        this.weight = weight;
    }

    // Getters
    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    // Setters
    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public int compareTo(StudentExample that) {
        // Sorting by age
        if(this.age == that.age){
            return  that.name.compareTo(that.name);
        }
        return this.age - that.age;
    }

    @Override
    public String toString() {
        return "StudentExample{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }
}