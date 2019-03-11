package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test.
 *
 * @author Alexey Tsoy (alextsoy1984@mail.ru)
 * @version 1
 * @since 10.03.2019
 */
public class ArrayCharTest {

    /**
     * Метод для тестирования, проверить префиксы двух массивов одинаковые или отличаются
     * @param word первый массив
     * @param result второй массив
     * is(value) результат сравнения
     */
    @Test
    public void whenStartWithPrefixThenTrue() {
        ArrayChar word = new ArrayChar("Hello");
        boolean result = word.startWith("He");
        assertThat(result, is(true));
    }

    /**
     * Метод для тестирования, проверить префиксы двух массивов одинаковые или отличаются
     * @param word первый массив
     * @param result второй массив
     * is(value) результат сравнения
     */
    @Test
    public void whenNotStartWithPrefixThenFalse() {
        ArrayChar word = new ArrayChar("Hello");
        boolean result = word.startWith("Hil");
        assertThat(result, is(false));
    }
}
