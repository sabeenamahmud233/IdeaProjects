package JavaIntermediateLearning;

import java.util.*;

public class Collections04 {
    public static void main(String[] args) {
        CollectionExample collection = new CollectionExample();
        collection.method1();
    }
}

class CollectionExample {

    public void method1() {
        String[] grocery = {"eggs", "cheese", "apple", "orange", "pepper", "pie", "banana"};
        List<String> list = new ArrayList<String>();

        for(String s : grocery) {
            list.add(s);
        }


        /*Iterator<String> iter =list.iterator();   // this will do the same as above code
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }*/


        String[] fruits = {"apple", "orange", "banana"};
        List<String> fruitList = new ArrayList<String>();
        Collections.addAll(fruitList, fruits);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(String.format("%s ", list.get(i)));
        }

        System.out.println("+++++++++++++++++++++++");

        for (int i = 0; i < fruitList.size(); i++) {
            System.out.println(String.format("%s ", fruitList.get(i)));
        }
        System.out.println("+++++++++++++++++++++++");

        editList(list, fruitList);
        System.out.println();

        for (int i = 0; i < list.size(); i++) {
            System.out.println(String.format("%s ", list.get(i)));
        }

        System.out.println("+++++++++++++++++++++++");
    }

    private void editList(Collection<String> list, Collection<String> fruitList) {
        Iterator<String> iter =list.iterator();
        while (iter.hasNext()) {
            if(fruitList.contains(iter.next())) {
                iter.remove();
            }
        }
    }
}