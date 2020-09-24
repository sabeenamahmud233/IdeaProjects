package Oops;

/*
    String:
    String is non-primitive type
    String is declared as:
    ->  public final class String extends Object implements CharSequence, Serializable, Comparable
    char[] c = {'S','T','R','I','N','G'}
    String s = new String(c)
    String is the sequence of characters or array of characters
    String can be build by using three ways:
    -> String
    -> StringBuffer
    -> StringBuilder
    String is immutable object

    String Constant Pool(String Literal Pool): is an area in heap memory where java stores String literal values

    Memory Areas in JVM:
    -> Method Area      <- static
    -> Heap Area        <- Instance Variable, Object
    -> Stack Area       <- Local Variable, Current running method, main method
    -> PC Register
    -> Native Method Area

    SCP was in Method Area till Java version 1.6 after that it was moved in Heap Area
    So String objects are store in SCP that is in Heap Area

    String s1 = new String("India");
    Whenever we are creating object for String than it will create object in heap memory.
    Here we are also creating String Literal that will also alocate memory in String Constant Pool so it will also create the object in SCP.
    So total two object were created here.
    Here JVM


    But in case of:
    String s2 = "Bharat";
    This will only create one object directly in String Literal Pool.

    Few Main String constructors that are important:

    class String {
        public String() {

        }

        public String(String s) {
        }

        public String(StringBuffer sb) {
        }

        public String(StringBuilder sb) {
        }

        public String(char[] chars) {
        }

        public String(byte[] b) {
        }
    }


*/


import java.util.Scanner;

public class StringClass {

    public void methodImplemented() {
        StringImplemented stringImplements = new StringImplemented();
//        stringImplements.isEmptyMethod();
//        stringImplements.lengthMethod();
//        stringImplements.trimMethod();
//        stringImplements.equalsAndEqualsIgnore();
//        stringImplements.compareToAndCompareToIgnore();
//        stringImplements.stringConcatenation();
//        stringImplements.stringReplacing();
        stringImplements.stringSearching();


    }

    class StringImplemented {
        public void stringImplemented() {
            StringBuffer sb = new StringBuffer("Data");
            String s1 = new String(sb); // here we are making it immutable
            System.out.println(s1);

            StringBuilder sbuild = new StringBuilder("Information");
            String s2 = new String(sbuild); // here we are making it immutable
            System.out.println(s2);

            byte[] b = {101, 102, 103};
            String s3 = new String(b);  // here we are making it immutable
            System.out.println(s3);

            char[] chars = {'a', 'b', 'c'};
            String s4 = new String(chars);  // here we are making it immutable
            System.out.println(s4);
        }

        public void isEmptyMethod() {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter Your First Name: ");
            String firstName = scanner.next();

            System.out.println("Enter Your Last Name: ");
            String lastName = scanner.next();
            System.out.println("Your name is: " + firstName + " " + lastName);
            System.out.println("Is First Name is empty: " + firstName.isEmpty());
            System.out.println("Is Last Name is empty: " + lastName.isEmpty());
        }

        public void lengthMethod() {
            Scanner scanner = new Scanner(System.in);
            String firstName, lastName;

            System.out.println("Enter Your First Name: ");
            firstName = scanner.next();

            System.out.println("Enter Your Last Name: ");
            lastName = scanner.next();

            System.out.println("Your name is: " + firstName + " " + lastName);
            System.out.println("First Name length is: " + firstName.length());
            System.out.println("last Name length is: " + lastName.length());
        }

        public void trimMethod() {
            Scanner scanner = new Scanner(System.in);
            String firstName, lastName;

            System.out.println("Enter Your First Name: ");
            firstName = scanner.next();

            System.out.println("Enter Your Last Name: ");
            lastName = scanner.next();

            System.out.println("Your name is: " + firstName.trim() + " " + lastName.trim());
            System.out.println("First Name length is: " + firstName.length());
            System.out.println("last Name length is: " + lastName.length());
        }

        public void equalsAndEqualsIgnore() {
            String s1 = "India";
            String s2 = "India";
            String s3 = "india";
            String s4 = "";
            System.out.println("String s1: " + s1 + "\tString s2: " + s2 + "\tString s3: " + s3 + "\tString s4: " + s4);

            System.out.println("is s1 equals to s2: " + s1.equals(s2));
            System.out.println("is s1 equals to s3: " + s1.equals(s3));
            System.out.println("is s2 equals to s3: " + s2.equals(s3));
            System.out.println("is s1 equals to s4: " + s1.equals(s4));
            System.out.println("is s1 equals to s2: " + s1.equalsIgnoreCase(s2));
            System.out.println("is s2 equals to s3: " + s2.equalsIgnoreCase(s3));
        }

        public void compareToAndCompareToIgnore() {
            String s1 = "India";
            String s2 = "India";
            String s3 = "india";
            String s4 = "";
            System.out.println("String s1: " + s1 + "\tString s2: " + s2 + "\tString s3: " + s3 + "\tString s4: " + s4);

            System.out.println("is s1 compare to s2: " + s1.compareTo(s2));
            System.out.println("is s1 compare to s3: " + s1.compareTo(s3));
            System.out.println("is s2 compare to s3: " + s2.compareTo(s3));
            System.out.println("is s1 compare to s4: " + s1.compareTo(s4));
            System.out.println("is s1 compare to ignore case s2: " + s1.compareToIgnoreCase(s2));
            System.out.println("is s2 compare to ignore case s3: " + s2.compareToIgnoreCase(s3));

        }

        public void stringConcatenation() {
            String s1 = "Welcome to";
            String s2 = "India";
            String s3 = "everyone";
            String s4 = "";
            System.out.println("String s1: " + s1 + "\tString s2: " + s2 + "\tString s3: " + s3 + "\tString s4: " + s4);

            System.out.println(s1 + " " + s2 + " " + s3);
            System.out.println(s1 + " " + s2 + " " + 10);
            System.out.println(s1 + " " + 10 + " " + s3);
            System.out.println(10 + " " + s2 + " " + s3);
//            System.out.println(s1 * 10);    // will provide error

            System.out.println(s1.concat(" " + s2).concat(" " + s3));

            // static join(CharSequence delimiter, CharSequence... elements)
            System.out.println(String.join(",", s1, " " + s2, " " + s3));

            System.out.println(s1.subSequence(3, 6));
            System.out.println(s1.substring(3, 6));
            System.out.println(s1.substring(3));

            System.out.println(new StringBuffer(s1).reverse().toString());
            System.out.println(new StringBuffer(s1).replace(0, 8, "Hello ").toString());
            System.out.println(new StringBuffer(s1).append("" + s2).toString());
            System.out.println(new StringBuffer(s1).delete(0, 3).reverse().toString());
        }

        public void stringReplacing() {
            String s1 = "This is the demo class, it will replace and update the string";
            String s2 = "Welcome to India";
            String s3 = "Hello Everyone, how are you?";
            String s4 = "This was a simple string that will use to update the string";
            System.out.println("String s1: " + s1 + "\nString s2: " + s2 + "\nString s3: " + s3 + "\nString s4: " + s4);

            System.out.println(s1.replace("is", "was"));
            System.out.println(s1.replaceFirst("is", "was"));
            System.out.println(s1.replaceAll("is", "was"));
            System.out.println(s4.replaceAll("string", "String"));
            System.out.println(s1.replaceAll("is(.)", "was"));
            System.out.println(s1.replaceAll("is(.*)", "was"));
            System.out.println(s1.replaceAll("(.)", "was"));
            System.out.println(s1.replaceAll("(.*)", "was"));

        }

        public void stringSearching() {
            String s1 = "This is the demo class, it will replace and update the string";
            String s2 = "Welcome to India";
            String s3 = "Hello Everyone, how are you?";
            String s4 = "This was a simple string that will use to update the string";
            System.out.println("String s1: " + s1 + "\nString s2: " + s2 + "\nString s3: " + s3 + "\nString s4: " + s4);

            System.out.println(s1.charAt(3));
            System.out.println(s1.indexOf('e'));
            System.out.println(s1.lastIndexOf('o'));
            System.out.println(s1.contains("A"));
            System.out.println(s1.contains("will"));
            System.out.println(s1.startsWith("will"));
            System.out.println(s1.endsWith("string"));
        }
    }
}
