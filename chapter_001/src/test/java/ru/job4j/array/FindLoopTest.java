package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test.
 *
 * @author Alexey Tsoy (alextsoy1984@mail.ru)
 * @version 2
 * @since 07.03.2019
 */
public class FindLoopTest {

    /**
     * Метод для тестирования, поиск индекса элемента массива
     * @param value условие для поиска элемента массива
     * expect предпологаемый результат
     */
    @Test
    public void whenArrayHas40Then3() {
        FindLoop find = new FindLoop();
        int[] input = new int[] {1, 10, 5, 40};
        int value = 40;
        int result = find.indexOf(input, value);
        int expect = 3;
        assertThat(result, is(expect));
    }

    /**
     * Метод для тестирования, поиск не существующего индекса элемента массива
     * @param value условие для поиска элемента массива
     * expect предпологаемый результат
     */
    @Test
    public void whenArrayHasNoElement() {
        FindLoop find = new FindLoop();
        int[] input = new int[] {1, 10, 5, 40};
        int value = 9;
        int result = find.indexOf(input, value);
        int expect = -1;
        assertThat(result, is(expect));
    }
}
