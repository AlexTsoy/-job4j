package ru.job4j.array;

import java.util.Arrays;

/**
 * class Turn.
 *
 * @author Alexey Tsoy (alextsoy1984@mail.ru)
 * @version 1
 * @since 07.03.2019
 */
public class Turn {

    /**
     * Метод переворачивает массив.
     * @param array необходимый нам для переворачивания массив.
     * return результат
     */
    public int[] back(int[] array) {
        for (int index = 0; index < array.length / 2; index++){
            int tmp = array[index];
            array[index] = array[array.length - index - 1];
            array[array.length - index - 1] = tmp;
        }
        return array;
    }
}
