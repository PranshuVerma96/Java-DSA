import java.util.List;
import java.util.Vector;

public class VectorExanple {
    public static void main(String[] args) {

//        creation of vector
        List<Integer> marks = new Vector<>();

//        adding the element
        marks.add(10);
        marks.add((20));
        marks.add(40);

        System.out.println(marks);

//        System.out.println(marks.type);

/*
    Difference between ArrayList and Vector

    the main differece between vector and array list is vector always
    perform operation in the synchronous order
    while array list not follwed this .

*/
        System.out.println(marks.size());


//        Vector<Integer> marks1 = new Vector<>();
    }
}
