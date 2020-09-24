package JavaLearning;

public class StaticKeyword13 {
    // static members to class
    public static void main(String[] args) {
        // there is no need to create the object of the class to call the static methods
        String s1 = staticExplain.method1("Hello");
        String s2 = staticExplain.method2("World");
        System.out.println(s1 + " " + s2);
        System.out.println("Age is: " + staticExplain.value);

        staticExplain tom = new staticExplain();
        System.out.println("Total No. of students: " + tom.numberOfStudents);
        staticExplain harry = new staticExplain();
        System.out.println("Total No. of students: " + harry.numberOfStudents);

        System.out.println("Total No. of students: " + staticExplain.numberOfStudents);

    }
}

class staticExplain {
    static int value = 21;

    public static String method1(String s1) {
        return s1;
    }

    public static String method2(String s2) {
        return s2;
    }

    String name;
    int age;
    static int numberOfStudents = 0;

    public staticExplain() {
        numberOfStudents++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return value;
    }

    public void setAge(int age) {
        this.value = age;
    }

}


