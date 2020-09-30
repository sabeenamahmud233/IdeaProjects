package JavaIntermediateLearning;

import java.util.*;

public class HashSet10 {
    public static void main(String[] args) {
        HashSetClass setClass = new HashSetClass();
        setClass.hashTestMethod();

        TreeSetClass tsc = new TreeSetClass();
        tsc.treeSetMethod();

        MapClass mapc = new MapClass();
        mapc.mapMethod();

        HashMapClass hmapc = new HashMapClass();
        hmapc.mapMethod();

    }
}

class HashSetClass {
    public void hashTestMethod() {
        String[] grocery = {"eggs", "cheese", "apple", "orange", "pepper", "pie", "eggs", "banana"};
        List<String> list = Arrays.asList(grocery);

        HashSet<String> set = new HashSet<String>(list);
        System.out.println("HashSet:" + set);    // set only have unique items

    }
}

class TreeSetClass {
    public void treeSetMethod() {
        String[] grocery = {"eggs", "cheese", "apple", "orange", "pepper", "pie", "eggs", "banana"};
        List<String> list = Arrays.asList(grocery);

        TreeSet<String> set = new TreeSet<String>(list);
        System.out.println("TreeSet: " +set);    // set only have unique items

    }
}

class MapClass {
    public void mapMethod() {
        String[] grocery = {"eggs", "cheese", "apple", "orange", "pepper", "pie", "eggs", "banana"};
        Integer[] keys = {1, 2, 3, 4, 5, 6, 7, 8};

        Map<String, Integer> set = new HashMap<String, Integer>();      // Map is an Interface so we have to implement it in class
        set.put("eggs", 1);                                             // So HashMap is the class
        set.put("cheese", 2);
        set.put("apple", 3);
        set.put("orange", 4);
        set.put("pepper", 5);

        System.out.println("Map: " + set);    // set only have unique items

    }
}

class HashMapClass {
    public void mapMethod() {
        String[] grocery = {"eggs", "cheese", "apple", "orange", "pepper", "pie", "eggs", "banana"};
        Integer[] keys = {1, 2, 3, 4, 5, 6, 7, 8};

        HashMap<String, Integer> set = new HashMap<String, Integer>();
        set.put("eggs", 1);
        set.put("cheese", 2);
        set.put("apple", 3);
        set.put("orange", 4);
        set.put("pepper", 5);

        System.out.println("HashMap: " + set);    // set only have unique items

        System.out.println(set.get("orange"));
        System.out.println(set.keySet());
        System.out.println(set.values());

    }
}

