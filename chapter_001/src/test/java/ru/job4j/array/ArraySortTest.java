package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ArraySortTest {

    @Test
    public void whenArraySortWithLeftElementsAndRightsElements() {
        ArraySort sort = new ArraySort();
        int[] input1 = new int[] {1, 3};
        int[] input2 = new int[] {2, 4};
        int[] result = sort.merge(input1, input2);
        int[] expect = new int[] {1, 2, 3, 4};
        assertThat(result, is(expect));
    }
}
