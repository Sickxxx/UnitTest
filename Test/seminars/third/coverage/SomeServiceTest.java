package seminars.third.coverage;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.lang.reflect.Array;
import java.util.ArrayList;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class SomeServiceTest {
    private SomeService someservice;

    @BeforeEach
    void setUp() {
        someservice = new SomeService();
    }

    // 3.1.

    @Test
    void multipleThreeNotFiveReturnsFizz() {
        // assertEquals...
        String check = someservice.fizzBuzz(3);
        assertThat(check).isEqualTo("Fizz");
    }

    @Test
    void multipleThreeNotThreeReturnsBuzz() {
        // assertEquals...
        String check = someservice.fizzBuzz(5);
        assertThat(check).isEqualTo("Buzz");
    }

    @Test
    void multipleThreeNotFiveteenReturnsFizzBuzz() {
        // assertEquals...
        String check = someservice.fizzBuzz(15);
        assertThat(check).isEqualTo("FizzBuzz");
    }

    @Test
    void multipleReturnsString() {
        // assertEquals...
        String check = someservice.fizzBuzz(22);
        assertThat(check).isEqualTo("22");
    }

    // 3.2.
    @Test
    void firstLast6() {
        boolean result = someservice.firstLast6(new int[]{1, 2, 3, 4, 5, 6});
        assertTrue(result);

    }

    @Test
    void firstLastNot6() {
        boolean result = someservice.firstLast6(new int[]{1, 2, 3, 4, 5});
        assertFalse(result);

    }


    @ParameterizedTest
    @CsvSource({"2000, 50, 1000",
            "2000, 100, 0",
            "2000, 0, 2000"})
    void fiftyPercentDiscount(double amount, int discount, int expected) {

        assertThat(someservice.calculatingDiscount(amount, discount))
                .isEqualTo(expected);
    }


    @Test
    void DiscountOverdraftTest() {
        assertThatThrownBy(() ->
                someservice.calculatingDiscount(2000.0, 101))
                .isInstanceOf(ArithmeticException.class)
                .hasMessage("Скидка должна быть в диапазоне от 0 до 100%");
    } // процент скидки больше 100%

    @Test
    void NegativeDiscountTest() {
        assertThatThrownBy(() ->
                someservice.calculatingDiscount(2000.0, -10))
                .isInstanceOf(ArithmeticException.class)
                .hasMessage("Скидка должна быть в диапазоне от 0 до 100%");
    } // процент скидки меньше 0
}
