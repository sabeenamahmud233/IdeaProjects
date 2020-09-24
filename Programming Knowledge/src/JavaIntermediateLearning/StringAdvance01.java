package JavaIntermediateLearning;

public class StringAdvance01 {
    public static void main(String[] args) {
        StringAdvance strAdv = new StringAdvance();
        strAdv.stringMethod1();
        strAdv.stringMethod2();
    }
}

class StringAdvance {
    public void stringMethod1() {
        String[] words = {"funk", "chunk", "furry", "baconator"};
        for(String word : words) {
            if(word.startsWith("fu")) {
                System.out.println(word + " Starts with fu");
            }
        }
    }

    public void stringMethod2() {
        String[] words = {"funk", "chunk", "furry", "baconator"};
        for(String word : words) {
            if(word.endsWith("nk")) {
                System.out.println(word + " ends with nk");
            }
        }
    }
}
