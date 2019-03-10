package ru.job4j.Array;

import org.junit.Test;
import ru.job4j.array.Matrix;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test.
 *
 * @author Alexey Tsoy (alextsoy1984@mail.ru)
 * @version 1
 * @since 11.03.2019
 */
public class MatrixTest {

    /**
     * Метод для тестирования, двойной массива таблица умножения
     * @param table массив таблица умножения
     * expect предпологаемый результат
     */
    @Test
    public void when2on2() {
        Matrix matrix = new Matrix();
        int[][] table = matrix.multiple(2);
        int[][] expect = {
                {1, 2},
                {2, 4}
        };
        assertThat(table, is(expect));
    }
}

