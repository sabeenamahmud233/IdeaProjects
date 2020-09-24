package JavaIntermediateLearning;

public class StringAdvance02 {
    public static void main(String[] args) {
        StringAdvance1 strAdv = new StringAdvance1();
        strAdv.stringMethod1();
        strAdv.stringMethod2();
    }
}

class StringAdvance1 {
    public void stringMethod1() {
        String s1 = "funkchunkfurrybaconator";
        System.out.println(s1.indexOf("furry"));
        System.out.println(s1.indexOf('k'));
        System.out.println(s1.indexOf('k', 5));
    }

    public void stringMethod2() {
        String a = "Something";
        String b = "Very Funny";

        System.out.println(a + " " + b);
        System.out.println(a.concat(" " + b));    // THis will print the same result

        System.out.println(a.replace('S', 'T'));
        System.out.println(a.toUpperCase());
        System.out.println(b.toLowerCase());
        System.out.println(b.trim());   // It will trim the white space, here is not any
    }
}
