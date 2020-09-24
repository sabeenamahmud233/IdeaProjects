package JavaIntermediateLearning;

import java.time.DateTimeException;
import java.time.Month;
import java.util.Arrays;

class SeasonException extends RuntimeException {
    public SeasonException(String message) {
        super(message);
    }
}

enum Season {
    WINTER, SPRING, SUMMER, FALL;

    private static final Season[] ENUMS = Season.values();

    public static Season of(int season) {
        if (season < 1 || season > 4) {
            throw new SeasonException("Invalid value for Season: " + season);
        }
        return ENUMS[season - 1];
    }



    private int number;

    Season() {
        this.number = 0;
    }

    private Season(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }
}

public class EnumExplained {
    public static void main(String[] args) {
        Season season1 = Season.WINTER;
        System.out.println(season1);

        Season season2 = Season.valueOf("WINTER");
        System.out.println(season2);
        System.out.println(season2.name());
        System.out.println(season2.ordinal());
        System.out.println(Arrays.toString(season2.values()));
        System.out.println(Season.of(1));
        System.out.println(Season.of(2));
        System.out.println(Season.of(3));
        System.out.println(Season.of(4));
        try {
            System.out.println(Season.of(5));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
