import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorInterface {
    public static void main(String[] args) {

        List<StudentExample> students = new ArrayList<>();

        students.add(new StudentExample(21, "Vipul", 90));
        students.add(new StudentExample(21, "Love", 70));
        students.add(new StudentExample(3, "Bimal", 12));

        System.out.println("Before Sorting:");
        System.out.println(students);

//        Collections.sort(students, new Comparator<StudentExample>() {
//            @Override
//            public int compare(StudentExample o1, StudentExample o2) {
//                return o1.wight - o2.weight;
//            }
//        });

//        Collections.sort(students);
//        System.out.println(students);



        Collections.sort(students , new WeightComparator());
        System.out.println(students);

    }
}
