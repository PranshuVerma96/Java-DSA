import java.util.Map;
import java.util.TreeMap;

public class MapUsingTreeMap {
    public static void main(String[] args) {

//        creation
        Map<Integer , String> map = new TreeMap<>();

//        when we are using TreeMap to implement the Map interface than
//        it relicate sorting according the Key
//        and other function work like hashMap and LinkedHashMap
//        adding value

//        before add Large value
        map.put(5 ,"All member");
        map.put(1 , "Papa");
        map.put(2 , "mom");
        map.put(3,"Brother");
        map.put(4 ,"Sister");

        System.out.println(map);

//        replace method
        map.replace(1 ,"GrandFather");
        System.out.println(map);
    }
}
