package Oops;

import java.sql.SQLOutput;

public class StringBufferDepth {
    public void methodImplemented() {
        StringBufferImplemented stringBufferImplemented = new StringBufferImplemented();
//        stringBufferImplemented.stringBufferCapacity();
        stringBufferImplemented.stringBufferMethods();


    }

    class StringBufferImplemented {

        public void stringBufferCapacity() {
            // default capacity of the String buffer is 16
            // when StringBuffer reached the capacity than it will increase the capacity by: default capacity + String length
            // the String buffer automatically increase its capacity when reached the default capacity: (last capacity * 2) + 2
            StringBuffer sb1 = new StringBuffer();
            System.out.println(sb1.capacity());
            System.out.println(sb1.length());

            StringBuffer sb2 = new StringBuffer("Vishnu");
            System.out.println(sb2.capacity());
            System.out.println(sb2.length());
        }

        public void stringBufferMethods() {

            // all the methods in StringBuffer are Synchronized
            // that thow thread will not execute simultaneously which required same lock
            StringBuffer sb1 = new StringBuffer();
            System.out.println("Default Capacity: " + sb1.capacity());
            System.out.println("String Length: " +sb1.length());

            // (old capacity * 2) + 2 -> 16*2 +2 -> 34
            sb1.append("Hello To Java World");
            System.out.println("Default Capacity: " + sb1.capacity());
            System.out.println("String Length: " +sb1.length());

            StringBuffer sb2 = new StringBuffer("Hello To Java");
            System.out.println("Char at position 15: " + sb2.charAt(11));
            System.out.println(sb2.delete(6, 8));   // will delete "to"
            System.out.println(sb2.deleteCharAt(6));    // will delete " "

            // StringBuffer does not override the Object class equals method
            // So StringBuffer equals method will check the reference of the object is same or not
            // but in case of String it will chechk that string is same or not because String override the equals method
            System.out.println("Is sb1 equals to sb2: " + sb1.equals(sb2));

            System.out.println(sb2.insert(5, " to"));
            System.out.println(sb2.replace(0, 6, "Welcome "));
            System.out.println(sb2.reverse());
            System.out.println(sb2.reverse());
            System.out.println(sb2.subSequence(3, 6));
            System.out.println(sb2.substring(3));
            System.out.println(sb2.substring(3, 6));
            sb2.ensureCapacity(100);
            System.out.println(sb2.capacity());
            sb2.setCharAt(0, 'C');  // Setting character at first position
            System.out.println(sb2);
            sb2.setCharAt(0, 'W');
            System.out.println(sb2);
            sb2.trimToSize();   // it will release the extra memory that aren't used
            System.out.println(sb2.capacity());

        }
    }
}
