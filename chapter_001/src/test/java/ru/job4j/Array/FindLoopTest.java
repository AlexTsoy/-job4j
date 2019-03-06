package ru.job4j.Array;

import org.junit.Test;
import ru.job4j.array.FindLoop;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test.
 *
 * @author Alexey Tsoy (alextsoy1984@mail.ru)
 * @version 1
 * @since 07.03.2019
 */
public class FindLoopTest {
    /**
     * Метод для тестирования, поиск индекса элемента массива
     * @param value условие для поиска элемента массива
     * expect предпологаемый результат
     */
    @Test
    public void whenArrayHas5Then0(){
        FindLoop find = new FindLoop();
        int[] input = new int[] {1, 10, 5, 40};
        int value = 40;
        int result = find.indexOf(input, value);
        int expect = 3;
        assertThat(result, is(expect));
    }
}
