package seminars.third.hw;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MainHWTest {
    private MainHW mainhwtest;

    @BeforeEach
    void setUp() {
        mainhwtest = new MainHW();
    }

    @Test
    public void oddNumberTest() {
        boolean result = mainhwtest.isEvenOddNumber(2);
        assertTrue(result);
    }
    @Test
    public void notOddNumberTest() {
        boolean result = mainhwtest.isEvenOddNumber(3);
        assertFalse(result);
    }

    @Test
    public void numInInterval() {
        boolean result = mainhwtest.numberInInterval(26);
        assertTrue(result);
    }

    @Test
    public void numNotInInterval() {
        boolean result = mainhwtest.numberInInterval(24);
        assertFalse(result);
    }
}