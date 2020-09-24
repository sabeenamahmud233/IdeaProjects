package com.company;

public class StringBuilderDepth {
    public void methodImplemented() {
        StringBuilderImplemented stringBuilderImplemented = new StringBuilderImplemented();
        stringBuilderImplemented.stringBuilderCapacity();
        stringBuilderImplemented.stringBuilderMethods();
    }

    class StringBuilderImplemented {

        public void stringBuilderCapacity() {
            StringBuffer sb1 = new StringBuffer();
            System.out.println(sb1.capacity());
            System.out.println(sb1.length());

            StringBuilder sbuild1 = new StringBuilder("Vishnu");
            System.out.println(sbuild1.capacity());
            System.out.println(sbuild1.length());

        }

        public void stringBuilderMethods() {
            // all the methods in StringBuffer are Non-Synchronized
            StringBuilder strBuild1 = new StringBuilder();
            System.out.println("Default Capacity: " + strBuild1.capacity());
            System.out.println("String Length: " +strBuild1.length());

            // (old capacity * 2) + 2 -> 16*2 +2 -> 34
            strBuild1.append("Hello To Java World");
            System.out.println("Default Capacity: " + strBuild1.capacity());
            System.out.println("String Length: " +strBuild1.length());

            StringBuilder strBuild2 = new StringBuilder("Hello To Java");
            System.out.println("Char at position 15: " + strBuild2.charAt(11));
            System.out.println(strBuild2.delete(6, 8));   // will delete "to"
            System.out.println(strBuild2.deleteCharAt(6));    // will delete " "

            // StringBuilder does not override the Object class equals method
            // So StringBuilder equals method will check the reference of the object is same or not
            // but in case of String it will chechk that string is same or not because String override the equals method
            System.out.println("Is strBuild1 equals to strBuild2: " + strBuild1.equals(strBuild2));

            System.out.println(strBuild2.insert(5, " to"));
            System.out.println(strBuild2.replace(0, 6, "Welcome "));
            System.out.println(strBuild2.reverse());
            System.out.println(strBuild2.reverse());
            System.out.println(strBuild2.subSequence(3, 6));
            System.out.println(strBuild2.substring(3));
            System.out.println(strBuild2.substring(3, 6));
            strBuild2.ensureCapacity(100);
            System.out.println(strBuild2.capacity());
            strBuild2.setCharAt(0, 'C');  // Setting character at first position
            System.out.println(strBuild2);
            strBuild2.setCharAt(0, 'W');
            System.out.println(strBuild2);
            strBuild2.trimToSize();   // it will release the extra memory that aren't used
            System.out.println(strBuild2.capacity());
        }
    }


}
