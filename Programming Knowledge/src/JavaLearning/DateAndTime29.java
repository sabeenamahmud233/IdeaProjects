package JavaLearning;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateAndTime29 {
    public static void main(String[] args) {
        DateAndTime dateAndTime = new DateAndTime();
//        dateAndTime.showDate();
        dateAndTime.setDate();
    }
}

class DateAndTime {
    public void showDate() {
        Date date = new Date();
        System.out.println(date.toString());

        System.out.println(date.getDate());
        System.out.println(date.getTime());
        System.out.println(date.getDay());
        System.out.println(date.getMonth() + 1);    // you have to add +1 to it

        System.out.println(date.getYear() + 1900);  // You have to add 1900
        System.out.println(date.getTime());
    }

    public void setDate() {
        Date date = new Date();
        SimpleDateFormat myDate1 = new SimpleDateFormat();
        System.out.println(myDate1.format(date));

        SimpleDateFormat myDate2 = new SimpleDateFormat("E dd/MM/yy hh:mm:ss");
        System.out.println(myDate2.format(date));
    }
}
