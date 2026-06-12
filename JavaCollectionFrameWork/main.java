import java.util.*;

public class main {
    public static void main(String[] args) {
//        list or collection are interface
//        Array list concreate class

      ArrayList<Integer> arr =  new ArrayList<>();

//      add
        arr.add(10);
        arr.add(20);
        arr.add(40);
        System.out.println(arr);
        arr.add(50);
        System.out.println(arr);

//        remove method
        arr.remove(0);
        System.out.println(arr);

//        addAll
        List<Integer> list = new ArrayList<>();
        list.add(200);
        list.add(300);
        list.add(20);

        arr.addAll(list);
        System.out.println(arr);

//        remove all this  method is used to remove the another list element form the list

        arr.removeAll(list);
        System.out.println(arr);

//        check the size
        System.out.println(arr.size());

//        clear all data
        System.out.println("printing list " + list);
       // list.clear();
        System.out.println(list);
        System.out.println(list.size());

//        traver all list using iterator
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println("Element "  + iterator.next());
        }

        List<Integer> list2 = new ArrayList<>();

        List<Integer> list3 = new ArrayList<>();
        list3.add(33);
        list3.add(23);
        list3.add(12);
//        get method

      System.out.println(list3.get(0));

//      set method
      list3.set(0,100);
      System.out.println(list3.get(0));

//      to Array
      Object[] brr =  list3.toArray();
      for(Object obj : brr){
        System.out.println(obj);
      }


//contains mehtod

      System.out.println(  list3.contains(100));
//        List<Integer> list = new ArrayList<>();
//        Collection<Integer> collection = new ArrayList<>();


//      new collection

     list3.add((60));
      System.out.println("Printing all element ");
      System.out.println(list3);

//      sorted the arrayList
//      ascending order

      Collections.sort(list3);
      System.out.println(list3);

//      ArrayList<Integer> newList = (ArrayList<Integer>) list3.clone();
//      ArrayList<Integer> newList = (ArrayList<Integer>) list.clone();

//      clone method
      ArrayList<Integer> list4 = new ArrayList<>();
      list4.add(10);
      list4.add(20);
      list4.add(30);

      ArrayList<Integer> newList = (ArrayList<Integer>) list4.clone();

      System.out.println("Original List: " + list4);
      System.out.println("Cloned List: " + newList);

//      ensureCapacity() method

      ArrayList<Integer> marks = new ArrayList<>();
      marks.ensureCapacity(100);

//      isEmpty method

      System.out.println(marks.isEmpty());

//      indexOf()
      System.out.println(list4.indexOf(10));
    }
}
