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

    }
}

class HashSetClass {
    public void hashTestMethod() {
        String[] grocery = {"eggs", "cheese", "apple", "orange", "pepper", "pie", "eggs", "banana"};
        List<String> list = Arrays.asList(grocery);

        HashSet<String> set = new HashSet<String>(list);
        System.out.println(set);    // set only have unique items

    }
}

class TreeSetClass {
    public void treeSetMethod() {
        String[] grocery = {"eggs", "cheese", "apple", "orange", "pepper", "pie", "eggs", "banana"};
        List<String> list = Arrays.asList(grocery);

        TreeSet<String> set = new TreeSet<String>(list);
        System.out.println(set);    // set only have unique items

    }
}

class MapClass {
    public void mapMethod() {
        String[] grocery = {"eggs", "cheese", "apple", "orange", "pepper", "pie", "eggs", "banana"};
        List<String> list = Arrays.asList(grocery);

        Map<String, String> set = new HashMap<String, String>();
        System.out.println(set.values().toString());    // set only have unique items

    }
}