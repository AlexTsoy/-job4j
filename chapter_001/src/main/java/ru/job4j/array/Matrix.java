package ru.job4j.array;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * class Matrix.
 *
 * @author Alexey Tsoy (alextsoy1984@mail.ru)
 * @version 1
 * @since 11.03.2019
 */
public class Matrix {

    /**
     * Метод реализует двойной массив (матрицу) и выводит таблицу умножения.
     * @param table двойной массив.
     * @param size задает симетричный размер нашей табоицы умноженич
     * return результат
     */
    public int[][] multiple(int size) {
        int[][] table = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                table[i][j] = (i + 1) * (j + 1);
            }
        }
        return table;
    }
}
