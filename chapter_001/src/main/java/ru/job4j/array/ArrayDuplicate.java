package ru.job4j.array;

import java.util.Arrays;

/**
 * class ArrayDuplicate.
 *
 * @author Alexey Tsoy (alextsoy1984@mail.ru)
 * @version 1
 * @since 13.03.2019
 */
public class ArrayDuplicate {
    /**
     * Метод для удаления дублирующих элементов в массиве.
     * @param array необходимый нам массив для удаления дублирующих элементов.
     * return результат
     */
    public String[] remove(String[] array) {
        int unique = array.length;
        for (int out = 0; out < unique; out++) {
            for (int in = out + 1; in < unique; in++) {
                if (array[out].equals(array[in])) {
                    array[in] = array[unique - 1];
                    unique--;
                    in--;
                }
            }
        }
        return Arrays.copyOf(array, unique);
    }
}
