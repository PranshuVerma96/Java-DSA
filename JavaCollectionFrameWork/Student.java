import java.util.Objects;

public class Student {
    public  int rolNo;
    public String name;

    public Student(int rolNo , String name, int i){
        this.rolNo = rolNo;
        this.name= name;
    }

    public String toString(){
        return "Student{" +
                "rollNo=" + rolNo +
                " , name = '" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }
}
