import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {

//        creation of map
        Map<String , String> mapping = new HashMap<>();
        // insertion

        mapping.put("US" , "United State");
//        mapping.put("US" , "United State"); do not create duplicate valude

        mapping.put("In" , "India");
        mapping.put("En" , "England");
        System.out.println(mapping);



        Map<String , String> table = new HashMap<>();
        table.put("Br" , "Brazil");
        table.put("Af" , "Africa");
        table.put("Nz" , "Nugiland");

        System.out.println("Before " + table);

//        using PutAll method
        table.putAll(mapping);
        System.out.println(table);

//        deleteion
        table.remove("En");
        System.out.println(table);

//        find the size
        System.out.println(table.size());

//        Clear
//      table.clear();
        System.out.println(table.size());

//putifAbsend() insert the association if the k is not alreay
//        associated with the value

        table.putIfAbsent("In" ,"India");
        System.out.println(table);

//        getOrDefault(k defaultValue) returns the value associatd with the associated with the specified key k if the key is not found
//        it returns the defaulValue

        System.out.println(table.getOrDefault("us" , "none"));
        System.out.println(table.containsKey("IN"));
        System.out.println(table.containsKey("In"));

        System.out.println(table.containsValue("Indias"));

//        replace method
        System.out.println("Table " + table);
        table.replace("In" , "Indonatioa");
        System.out.println(table);

//        keySet()

        System.out.println(table.keySet());

        System.out.println(table.values());

        Collection<String> valueSet = table.values();
        System.out.println(valueSet);

        // get all the entries from the map

        System.out.println(table.entrySet());

        // iterationg over a map

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "one");
        map.put(2, "Two");
        map.put(3, "three");

        for (Map.Entry<Integer, String> entry:map.entrySet()){
            System.out.println("Key " + entry.getKey() + " , Value "  + entry.getValue());
        }


    }
}
