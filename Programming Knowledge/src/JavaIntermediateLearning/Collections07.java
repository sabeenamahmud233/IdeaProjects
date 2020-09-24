package JavaIntermediateLearning;

import java.util.*;

public class Collections07 {
    public static void main(String[] args) {
        CollectionClass cc = new CollectionClass();
//        cc.collectionsMethod();
//        cc.collectionsCopy();
//        cc.collectionsFill();
//        cc.collectionsAddAll();
//        cc.collectionsFrequency();
        cc.collectionsDisjoint();

    }
}

class CollectionClass {
    public void collectionsMethod() {
        String[] fruits = {"Apple", "Orange", "Banana", "Papaya", "Grapes"};
        List<String> list = Arrays.asList(fruits);

        Collections.sort(list);
        System.out.printf("%s", list);

        System.out.println();

//        list.sort(Collections.reverseOrder());
        Collections.sort(list, Collections.reverseOrder());
        System.out.printf("%s", list);

        System.out.println();

        Collections.reverse(list);
        System.out.printf("%s ", list);

        System.out.println();
    }

    public void collectionsCopy() {
        String[] fruits = {"Apple", "Orange", "Banana", "Papaya", "Grapes"};
        String[] veggies = {"Carrot", "Potato", "Lemon", "Chilli", "Tomato", "Brinjal"};
        List<String> list1 = Arrays.asList(fruits);     // Converting Array to List
        List<String> list2 = Arrays.asList(veggies);    // Converting Array to List

        // Reverse the list
        Collections.reverse(list1);
        System.out.printf("%s ", list1);

        System.out.println();

        // Empty Array List
        String[] emptyArray = new String[6];
        List<String> listCopy = Arrays.asList(emptyArray);

        // copy contents of veggies to listCopy
        Collections.copy(listCopy,list2);

        // Print the output
        printOutput(listCopy);

        System.out.println();
        // Print data using collection after sorting the data
        printUsingCollections(listCopy);
    }

    public void printOutput(List<String> list) {
        for (String data : list) {
            System.out.printf("%s, ", data);
        }
    }

    public void printUsingCollections(List<String> list) {
        Collections.sort(list);
        for (String data : list) {
            System.out.printf("%s, ", data);

        }
    }

    public void collectionsFill() {
        String[] emptyArray = new String[6];
        List<String> listCopy = Arrays.asList(emptyArray);

        // copy contents of veggies to listCopy
        Collections.fill(listCopy,"Hello");
        System.out.println(listCopy);

        System.out.println();
        listCopy.set(1, "How");
        listCopy.set(2, "Are");
        listCopy.set(3, "You");
        listCopy.set(4, "Today");
        listCopy.set(5, "Tom");
        System.out.println(listCopy);
    }

    public void collectionsAddAll() {
        String[] fruits = {"Apple", "Orange", "Banana", "Papaya", "Grapes"};
        List<String> list = Arrays.asList(fruits);

        String[] emptyArray = new String[5];
        Arrays.fill(emptyArray, "Hey");
        for(String s : emptyArray)
            System.out.printf("%s, ", s);

        System.out.println();

        ArrayList<String> emptyArrayList = new ArrayList<String>();
        LinkedList<String> emptyLinkedList = new LinkedList<String>();
        HashSet<String> emptyHashSet = new HashSet<String>();


        // copy contents of veggies to listCopy
        Collections.addAll(emptyArrayList, fruits);
        System.out.println(emptyArrayList);

        Collections.addAll(emptyLinkedList, fruits);
        System.out.println(emptyLinkedList);

        Collections.addAll(emptyHashSet, fruits);
        System.out.println(emptyHashSet);
    }

    public void collectionsFrequency() {
        String[] fruits = {"Apple", "Orange", "Banana", "Papaya", "Grapes", "Apple"};
        List<String> list = Arrays.asList(fruits);

        System.out.println(Collections.frequency(list, "Apple"));
    }

    public void collectionsDisjoint() {
        String[] grocery = {"eggs", "cheese", "apple", "orange", "pepper", "pie", "banana"};
        String[] fruits = {"apple", "orange", "banana"};
        String[] veggies = {"Carrot", "Potato", "Lemon", "Chilli", "Tomato", "Brinjal"};

        List<String> list1 = Arrays.asList(grocery);
        List<String> list2 = Arrays.asList(fruits);
        List<String> list3 = Arrays.asList(veggies);

        // if both list have any element in common than it will print false else print true
        System.out.println(Collections.disjoint(list1, list2));
        System.out.println(Collections.disjoint(list1, list3));

    }
}
