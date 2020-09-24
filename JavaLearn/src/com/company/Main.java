package com.company;

import java.util.Timer;
import java.util.TimerTask;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int delay = 5000;// in ms

        Timer timer = new Timer();

        timer.schedule( new TimerTask(){
            public void run() {
                System.out.println("Wait, what..:"); // this code will be execute after 5 seconds
            }
        }, delay);

        System.out.println("Would it run?"); // this code will be execute immediately
    }
}