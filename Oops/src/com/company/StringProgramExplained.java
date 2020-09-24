package com.company;

public class StringProgramExplained {

    public void stringPrograms() {
        AllPrograms allPrograms = new AllPrograms();
        allPrograms.reverseProgram();

        allPrograms.palindromeProgram();
        allPrograms.maxOccurCharProgram();
    }

    class AllPrograms {
        public void reverseProgram() {
            String reverse1 = "";
            String s1 = new String("Hello Java");
            for (int i = s1.length() - 1; i>= 0; i--) {
                reverse1 += s1.charAt(i);
            }
            System.out.println(reverse1);
        }

        public void palindromeProgram() {
            String reverse1 = "";
            String s1 = new String("Hello Java");
            for (int i = s1.length() - 1; i>= 0; i--) {
                reverse1 += s1.charAt(i);
            }
            if (s1.equals(reverse1)) {
                System.out.println("This is palindrome string");
            } else {
                System.out.println("This string is not palindrome");
            }
        }

        public void maxOccurCharProgram() {
            String s1 = "Hello Java";
            int[] intArray = new int[256];

            /*
            String s1 = "Hello Java";
            String[] strArray = new String[256];
            for (int i = 0; i <= s1.length() - 1; i++) {
                strArray[i] = String.valueOf(s1.charAt(i));
            }

            for (int i = 0; i < strArray.length; i ++) {
                System.out.print(strArray[i]);
            }*/

            for (int i = 0; i <= s1.length() - 1; i++) {
                intArray[s1.charAt(i)] += + 1;
            }


            int max = -1;
            char c1 = ' ';

            for (int i = 0; i < s1.length(); i ++) {
                if (max < intArray[s1.charAt(i)]) {
                    max = intArray[s1.charAt(i)];
                    c1 = s1.charAt(i);
                }
            }
            System.out.println("Maximum repeated char is: " + c1);
        }
    }
}
