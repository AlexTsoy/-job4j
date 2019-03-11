package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test.
 *
 * @author Alexey Tsoy (alextsoy1984@mail.ru)
 * @version 1
 * @since 08.03.2019
 */
public class CheckTest {

    /**
     * Метод для тестирования, проверить массива на boolean значения true или false
     * @param input массив который нужно проверить
     * is(value) предпологаемый результат
     */
    @Test
    public void whenDataMonoByTrueThenTrue() {
        Check check = new Check();
        boolean[] input = new boolean[] {true, true, true};
        boolean result = check.mono(input);
        assertThat(result, is(true));
    }

    /**
     * Метод для тестирования, проверить массива на boolean значения true или false
     * @param input массив который нужно проверить
     * is(value) предпологаемый результат
     */
    @Test
    public void whenDataNotMonoByTrueThenFalse() {
        Check check = new Check();
        boolean[] input = new boolean[] {true, false, true, true};
        boolean result = check.mono(input);
        assertThat(result, is(false));
    }


}
