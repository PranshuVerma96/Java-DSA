import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ComparableDemo {

    public static void main(String[] args) {

       Integer[] arr = {5,1,4,2,9,3,6};


        Arrays.sort(arr , new ReverseCmp());
        for (int i = 0;  i<arr.length ; i++) {
            System.out.print(arr[i] + " ");
            
        }


//
//        List<StudentExample> students = new ArrayList<>();
//
//        students.add(new StudentExample(21, "Vipul", 90));
//        students.add(new StudentExample(21, "Love", 70));
//        students.add(new StudentExample(3, "Bimal", 12));
//
//        System.out.println("Before Sorting:");
//        System.out.println(students);
//
//        Collections.sort(students);
//
//        System.out.println("After Sorting:");
//        System.out.println(students);
    }
}