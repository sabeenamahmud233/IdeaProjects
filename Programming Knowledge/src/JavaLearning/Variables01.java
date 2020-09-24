package JavaLearning;

public class Variables01 {
    /*
     * byte (Number, 1 byte)
     * short (Number, 2 byte)
     * int (Number, 4 byte)
     * long (Number, 8 byte)
     * float (Float Number, 4 byte)
     * double (Float Number, 8 byte)
     * char (Character, 2 byte)
     * boolean (True or False, 1 byte)
     */
    public static void main(String[] args) {
       byte byteVariable = 1;
       short shortVariable = 10;
       int intVariable = 40;
       long longVariable = (long) 1.45856128;
       float floatVariable = (float) 1.35284605;
       double doubleVariable = 1.2598684;
       char charVariable = 'a';
       boolean booleanVariable = true;

        System.out.println("This is byteVariable: " + byteVariable);
        System.out.println("This is shortVariable: " + shortVariable);
        System.out.println("This is intVariable: " + intVariable);
        System.out.println("This is longVariable: " + longVariable);
        System.out.println("This is floatVariable: " + floatVariable);
        System.out.println("This is doubleVariable: " + doubleVariable);
        System.out.println("This is charVariable: " + charVariable);
        System.out.println("This is booleanVariable: " + booleanVariable);

    }
}
