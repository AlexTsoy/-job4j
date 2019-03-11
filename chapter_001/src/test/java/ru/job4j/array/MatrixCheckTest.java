package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test.
 *
 * @author Alexey Tsoy (alextsoy1984@mail.ru)
 * @version 1
 * @since 12.03.2019
 */
public class MatrixCheckTest {

    /**
     * Метод для тестирования, проверка элементов двойного массива по диагоналям равны true или false.
     * @param input двойной массив с элементами true или false
     * is(value) предпологаемый результат
     */
    @Test
    public void whenDataMonoByTrueThenTrue() {
        MatrixCheck check = new MatrixCheck();
        boolean[][] input = new boolean[][] {
                {true, true, true},
                {false, true, true},
                {true, false, true}
        };
        boolean result = check.mono(input);
        assertThat(result, is(true));
    }

    /**
     * Метод для тестирования, проверка элементов двойного массива по диагоналям равны true или false.
     * @param input двойной массив с элементами true или false
     * is(value) предпологаемый результат
     */
    @Test
    public void whenDataNotMonoByTrueThenFalse() {
        MatrixCheck check = new MatrixCheck();
        boolean[][] input = new boolean[][] {
                {true, true, true},
                {false, true, true},
                {false, false, true}
        };
        boolean result = check.mono(input);
        assertThat(result, is(false));
    }

    /**
     * Метод для тестирования, проверка элементов двойного массива по диагоналям равны true или false.
     * @param input двойной массив с элементами true или false
     * is(value) предпологаемый результат
     */
    @Test
    public void whenData2On2False() {
        MatrixCheck check = new MatrixCheck();
        boolean[][] input = new boolean[][] {
                {true, true},
                {false, true}
        };
        boolean result = check.mono(input);
        assertThat(result, is(false));
    }

    /**
     * Метод для тестирования, проверка элементов двойного массива по диагоналям равны true или false.
     * @param input двойной массив с элементами true или false
     * is(value) предпологаемый результат
     */
    @Test
    public void whenData2On2True() {
        MatrixCheck check = new MatrixCheck();
        boolean[][] input = new boolean[][] {
                {true, true},
                {true, true}
        };
        boolean result = check.mono(input);
        assertThat(result, is(true));
    }
}
