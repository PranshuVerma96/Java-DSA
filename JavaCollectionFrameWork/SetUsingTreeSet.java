import java.util.Set;
import java.util.TreeSet;

public class SetUsingTreeSet {
    public static void main(String[] args) {

        Set<Integer> set = new TreeSet<>();
//        add element

//        HashSet => O(1)
//        linkedHashSet => O(n)
//        TreeSet => O(logn)
// when we are using treeSet than all element return in the shorted format

        set.add(50);
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);

        System.out.println(set);
    }
}
