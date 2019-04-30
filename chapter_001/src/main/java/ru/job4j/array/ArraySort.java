package ru.job4j.array;

/**
 * class ArraySort.
 *
 * @author Alexey Tsoy (alextsoy1984@mail.ru)
 * @version 1
 * @since 22.03.2019
 */
public class ArraySort {

    /**
     * Объединяем 2 массива и сортируем ячейки по возрастанию.
     * @param left первый исходный массив.
     * @param right второй исходный массив.
     * @return megre отсортированный массив, объединяющий массивы left и right.
     */
    public int[] merge(int[] left, int[] right) {
        if (left == null) {
            return right;
        }
        if (right == null) {
            return left;
        }
        int[] merge = new int[left.length + right.length];
        int i = 0, j = 0, p = 0;
        while (i < left.length && j < right.length) {
            if (left[i] < right[j]) {
                merge[p] = left[i];
                i++;
            } else {
                merge[p] = right[j];
                j++;
            }
            p++;
        }

        while (i < left.length) {
            merge[p] = left[i];
            i++;
            p++;
        }

        while (j < right.length) {
            merge[p] = right[j];
            j++;
            p++;
        }
    return merge;
    }
}
