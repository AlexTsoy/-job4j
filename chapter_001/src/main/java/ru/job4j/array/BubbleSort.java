package ru.job4j.array;

/**
 * class BubbleSort.
 *
 * @author Alexey Tsoy (alextsoy1984@mail.ru)
 * @version 1
 * @since 10.03.2019
 */
public class BubbleSort {

    /**
     * Метод сортирует массив при помощи алгоритма сортировки пузырьков.
     * @param array необходимый нам для сортировки массив.
     * return результат
     */
    public int[] sort(int[] array) {
        int i = 0;
        int count = 0;
        while (true) {
            if (array[i] > array[i + 1]) {
                int q = array[i];
                array[i] = array[i + 1];
                array[i + 1] = q;
                count = 0;
            } else {
                count++;
            }
            i++;
            if (i == array.length - 1) {
                i = 0;
            }
            if (count == array.length - 1) {
                break;
            }
        }
        return array;
    }
}
