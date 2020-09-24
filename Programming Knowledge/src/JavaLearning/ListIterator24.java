package JavaLearning;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ListIterator24 {
    public static void main(String[] args) {
        ListIteratorClass listIteratorClass = new ListIteratorClass();
        listIteratorClass.arrayIteratorMethod();
    }
}

class ListIteratorClass {
    public void arrayIteratorMethod() {
        ArrayList<String> listNames = new ArrayList<String>();
        listNames.add("Ramesh");
        listNames.add("Mukesh");
        listNames.add("Mahesh");
        listNames.add("Suresh");
        listNames.add("Ravish");
        listNames.add("Rajesh");

        // For each loop
        for (String listName : listNames) {
            System.out.println(listName);
        }
        System.out.println("===================");

        // Forward Printing
        ListIterator<String> arrayIterator = listNames.listIterator();
        while (arrayIterator.hasNext()) {
            System.out.println(arrayIterator.next());
        }
        System.out.println("===================");

        // Backward Printing
        while (arrayIterator.hasPrevious()) {
            System.out.println(arrayIterator.previous());
        }
        System.out.println("===================");

        // Forward Printing using Iterator
        Iterator<String> arrIterator = listNames.iterator();
        while (arrIterator.hasNext()) {
            System.out.println(arrIterator.next());
        }
        System.out.println("===================");

        // Backward Printing using Iterator
        // There is no hasPrevious and previous method in Iterator class

    }
}
