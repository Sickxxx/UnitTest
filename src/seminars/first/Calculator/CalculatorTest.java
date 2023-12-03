package seminars.first.Calculator;

import seminars.first.Calculator.Calculator;

import javax.lang.model.type.ErrorType;
import java.io.IOException;
import java.rmi.UnexpectedException;

import static org.assertj.core.api.Assertions.*;

public class CalculatorTest {
    public static void main(String[] args) {
        // Проверка базового функционала с целыми числами:
//        if (8 != Calculator.calculation(2, 6, '+')) {
//            throw new AssertionError("Ошибка в методе");
//        }
//
//        if (0 != Calculator.calculation(2, 2, '-')) {
//            throw new AssertionError("Ошибка в методе");
//        }
//
//        if (14 != Calculator.calculation(2, 7, '*')) {
//            throw new AssertionError("Ошибка в методе");
//        }
//
//        if (2 != Calculator.calculation(100, 50, '/')) {
//            throw new AssertionError("Ошибка в методе");
//        }


        // Случаи с неправильными аргументами
        // аргумент operator типа char, должен вызывать исключение, если он получает не базовые символы (+-*/)
//         try {
//             seminars.first.Calculator.Calculator.calculation(8, 4, '_');
//         } catch (IllegalStateException e) {
//             if (!e.getMessage().equals("java.lang.String cannot be converted to float")) {
//                 throw new AssertionError("Ошибка в методе");
//             }
//         }
        //HW 1 В классе Calculator создайте метод calculateDiscount, который принимает сумму покупки и процент скидки
        // и возвращает сумму с учетом скидки. Ваша задача - проверить этот метод с использованием библиотеки AssertJ.
        // Если метод calculateDiscount получает недопустимые аргументы, он должен выбрасывать исключение
        // ArithmeticException. Не забудьте написать тесты для проверки этого поведения.
        assertThat(Calculator.calculatingDiscount(100, 50)).isEqualTo(50);
        assertThat(Calculator.calculatingDiscount(100.25, 30)).isEqualTo(70.25);
        try {
            Calculator.calculatingDiscount(100,50);
        }
        catch (IllegalArgumentException e){
            throw new ArithmeticException("Недопустимые аргументы в методе");
        }

    }
}