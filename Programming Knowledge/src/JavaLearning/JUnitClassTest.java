package JavaLearning;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;

public class JUnitClassTest {
    private static int a, b, c, d, result;

    @Test
    public void addition() {
        JUnitClass jUnitClass = new JUnitClass();
        int result = jUnitClass.addition();

        assertEquals(15, result);
    }
}