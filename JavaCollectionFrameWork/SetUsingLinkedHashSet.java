import java.util.LinkedHashSet;
import java.util.Set;
public class SetUsingLinkedHashSet {
    public static void main(String[] args) {
//        creation

        Set<Integer> set = new LinkedHashSet<>();
//        adding element in the set
//        when we are using hashSet than no order matter but if we are using
        /* LinkedHashSet than order of element is matter  */
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);
        System.out.println(set);

    }
}
