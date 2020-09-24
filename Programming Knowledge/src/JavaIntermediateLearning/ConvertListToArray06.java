package JavaIntermediateLearning;

import java.util.Arrays;
import java.util.LinkedList;

public class ConvertListToArray06 {
    public static void main(String[] args) {
        ConvertArray convertArray = new ConvertArray();
        convertArray.convertMethode();

    }
}

class ConvertArray {
    public void convertMethode() {
        String[] grocery = {"eggs", "cheese", "apple", "orange", "pepper", "pie", "banana"};

        LinkedList<String> list = new LinkedList<String>(Arrays.asList(grocery));

        for (String s : list) {
            System.out.printf("%s ", s);
        }
        System.out.println();

        // Convert back to an Array
        grocery = list.toArray(new String[list.size()]);
        for (String s : grocery) {
            System.out.printf("%s ", s);
        }
    }
}
