import java.util.LinkedHashMap;
import java.util.Map;

public class MapUSingLinkedHashMap {
    public static void main(String[] args) {
//        creation

//        there are only difference between hashMap and LinkedHashMap hashmap dose not maintain order
//        while  linked lashmap maintain order

//        and all function are working like Hashmap
        Map<String, String> map = new LinkedHashMap<>();
        map.put("name", "Pranshu");
        map.put("Roll", "one");
        map.put("Class", "9a");

        System.out.println(map);

//        remove
        System.out.println(map.remove("name"));
        System.out.println(map);
    }

}
