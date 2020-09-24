package com.company;

public class FinalKeyword {
    final int a = 0;

    final void show() {
//        a += 1; // this cannot implemented
        System.out.println(a);
    }

    void show(String s) {
        System.out.println(s);
    }
}

class FinalKeyword2 extends FinalKeyword {
    /*void show() {
           // this cannot implemented as well. final methods can not override
    }*/
    public void showData() {
        System.out.println("Simple method");
    }
}
