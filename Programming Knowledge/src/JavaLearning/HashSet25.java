package JavaLearning;

import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;

public class HashSet25 {
    public static void main(String[] args) {
        HashSetClass hashSetClass = new HashSetClass();
        hashSetClass.hasSetMethod();
    }
}

class HashSetClass {
    public void hasSetMethod() {
        HashSet<String> set = new HashSet<String>();
        set.add("Ramesh");
        set.add("Mukesh");
        set.add("Mahesh");
        set.add("Suresh");
        set.add("Ravish");
        set.add("Rajesh");
        set.add("Ramesh");

        // HashSet won't have duplicate values

        // For each loop
        for (String listName : set) {
            System.out.println(listName);
        }
        System.out.println("===================");

        Iterator<String> arrIterator = set.iterator();
        while (arrIterator.hasNext()) {
            System.out.println(arrIterator.next());
        }
        System.out.println("===================");
    }
}
