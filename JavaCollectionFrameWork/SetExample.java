import java.util.HashSet;
import java.util.Set;

public class SetExample {
    public static void main(String[] args) {

        HashSet<Student> set = new HashSet<>();
        Student s1 = new Student(1,"PRanshu", 90);
        Student s2 = new Student(1,"PRanshu", 90);
        Student s3 = new Student(1,"PRanshu", 90);

        set.add(s1);
        set.add(s2);
        set.add(s3);

        System.out.println(set);


//        creation set using hashSet

//        set is the type of data sctructure in the java which can contains only unique value
//      no ordering mettar
        Set<Integer> st = new HashSet<>();
//        add element
        st.add(10);
//        st.add(10); always inser once
        st.add(20);
        st.add(30);
        st.add(40);

        System.out.println(st);

//        some method of set
//        addAll ads all the elemets of the specified collection to the set
        Set<Integer> st2 = new HashSet<>();
        st2.add(50);
        st2.add(60);
        System.out.println(st2);

        System.out.println("Original set" + st);
        System.out.println(st.addAll(st2));
        System.out.println("After add other set " + st);

//        retainAll() retains all the elements in the set that are also present in another specified

        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        set1.add(10);
        set1.add(20);
        set1.add(30);
        set1.add(40);

        set2.add(10);
        set2.add(20);
        set2.add(70);
        set2.add(80);

//        issimple that using of intersection
        System.out.println(set1);
        set1.retainAll(set2);
//        System.out.println(set1);

// containAll that is using set2 is subset of set1

        System.out.println(set1);
        System.out.println(set2);

        System.out.println(set1.containsAll(set2));
        System.out.println(set2.containsAll(set1));


    }
}
