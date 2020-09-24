package JavaLearning;

import java.util.ArrayList;

public class ArrayList22 {
    public static void main(String[] args) {
        ArrayListClass arrayListClass = new ArrayListClass();
        arrayListClass.arrayMethode();
    }
}

class ArrayListClass {
    public void arrayMethode() {
        ArrayList<Integer> list = new ArrayList<Integer>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        // For each loop or enhanced for loop
        for(Integer i : list) {
            System.out.println(i);
        }

        System.out.println();
        // for loop
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        System.out.println();
        // while loop
        int j = 0;
        while(j < list.size()) {
            System.out.println(list.get(j));
            j++;
        }

        System.out.println("+++++++++++++++++++++++");
        list.add(2, 20);
        list.set(0, 0);
        System.out.println(list.contains(12));  // first
        System.out.println(list.size());    //second
        list.ensureCapacity(20);
        System.out.println(list.size());    //third
        list.trimToSize();
        System.out.println(list.size());    //fourth
        list.add(12);
        list.remove(2);
        System.out.println(list.isEmpty()); //fifth

        System.out.println("\n========================\n");
        for(Integer i : list) {
            System.out.println(i);
        }
    }
}
