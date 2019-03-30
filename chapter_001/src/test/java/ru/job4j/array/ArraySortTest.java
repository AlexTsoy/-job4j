package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ArraySortTest {

    /**
     * Метод для тестирования, объединяем 2 массива и сортируем ячейки по возрастанию
     * @param input1 первый массив который нужно объеденить
     * @param input2 второй массив который нужно объеденить
     * expect предполагаемый результат
     */
    @Test
    public void whenArraySortWithLeftElementsAndRightsElements() {
        ArraySort sort = new ArraySort();
        int[] input1 = new int[] {1, 3};
        int[] input2 = new int[] {2, 4};
        int[] result = sort.merge(input1, input2);
        int[] expect = new int[] {1, 2, 3, 4};
        assertThat(result, is(expect));
    }

    @Test
    public void ArraySortWhenLeftElementsLongRightsElements() {
        ArraySort sort = new ArraySort();
        int[] input1 = new int[] {1, 3, 5, 8};
        int[] input2 = new int[] {2, 4};
        int[] result = sort.merge(input1, input2);
        int[] expect = new int[] {1, 2, 3, 4, 5, 8};
        assertThat(result, is(expect));
    }

    @Test
    public void ArraySortWhenRightsElementsLongLeftElements() {
        ArraySort sort = new ArraySort();
        int[] input1 = new int[] {1, 3};
        int[] input2 = new int[] {2, 4, 6, 5, 8};
        int[] result = sort.merge(input1, input2);
        int[] expect = new int[] {1, 2, 3, 4, 5, 6, 8};
        assertThat(result, is(expect));
    }

    @Test
    public void ArraySortWhenRightsElementsIsNull() {
        ArraySort sort = new ArraySort();
        int[] input1 = new int[] {2, 4, 5, 6, 8};
        int[] input2 = null;
        int[] result = sort.merge(input1, input2);
        int[] expect = new int[] {2, 4, 5, 6, 8};
        assertThat(result, is(expect));
    }

    @Test
    public void ArraySortWhenLeftElementsIsNull() {
        ArraySort sort = new ArraySort();
        int[] input1 = null;
        int[] input2 = new int[] {2, 4, 5, 6, 8};
        int[] result = sort.merge(input1, input2);
        int[] expect = new int[] {2, 4, 5, 6, 8};
        assertThat(result, is(expect));
    }

    @Test
    public void whenArraySortAllElementsIsNull() {
        ArraySort sort = new ArraySort();
        int[] input1 = null;
        int[] input2 = null;
        int[] result = sort.merge(input1, input2);
        int[] expect = null;
        assertThat(result, is(expect));
    }
}
