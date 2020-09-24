package JavaIntermediateLearning;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedListExample05 {
    public static void main(String[] args) {
        LinkedListExplain linkedList = new LinkedListExplain();
        linkedList.method1();
    }
}

class LinkedListExplain {
    public void method1() {
        String[] grocery = {"eggs", "cheese", "pepper", "pie"};
        List<String> list = new LinkedList<String>();

        for (String s1 : grocery) {
            list.add(s1);
        }

        String[] fruits = {"Apple", "Orange", "Banana", "Papaya", "Grapes"};
        List<String> list2 = new LinkedList<String>();

        for (String s2 : fruits) {
            list2.add(s2);
        }

        list.addAll(list2);
        list2.clear();


        printMethod(list);
        System.out.println();
        reverseMethod(list);
        System.out.println();

    }

    // Print Method
    private static void printMethod(List<String> list) {
        for (String s : list) {
            System.out.printf("%s ", s);
        }
    }


    // Remove Stuff Method
    private static void removeStuff(List<String> list, int from, int to) {
        list.subList(from, to).clear();
    }

    // Reverse the list Method
    private static void reverseMethod(List<String> list) {
        ListIterator<String> it = list.listIterator(list.size());
        while (it.hasPrevious()) {
            System.out.printf("%s ", it.previous());
        }
    }
}
