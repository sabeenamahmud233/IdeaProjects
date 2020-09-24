package JavaLearning;

import java.util.LinkedList;

public class LinkedList23 {
    public static void main(String[] args) {
        LinkedListClass linkedListClass = new LinkedListClass();
        linkedListClass.linkedListMethod();
    }
}

class LinkedListClass {
    public void linkedListMethod() {
        LinkedList<String> linkedList = new LinkedList<String>();

        linkedList.add("Ramesh");
        linkedList.add("Mukesh");
        linkedList.add("Mahesh");
        linkedList.add("Suresh");
        linkedList.add("Ravish");
        linkedList.add("Rajesh");

        // For each loop or enhanced for loop
        for(String s1 : linkedList) {
            System.out.println(s1);
        }

        System.out.println("+++++++++++++++++++");
        linkedList.add(0,"Bhavesh");
        linkedList.set(5, "Raghuvansh");
        System.out.println(linkedList.size());

        System.out.println("+++++++++++++++++++");
        for(String s1 : linkedList) {
            System.out.println(s1);
        }
    }
}
