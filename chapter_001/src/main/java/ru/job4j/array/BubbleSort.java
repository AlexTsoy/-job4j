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
    public int[] sort(int[] array){
        boolean isSorting = false;
        while (!isSorting){
            isSorting = true;
            for (int index = 0; index < array.length - 1; index++){
                if (array[index] > array[index + 1]){
                    isSorting = false;
                    int number = array[index];
                    array[index] = array[index + 1];
                    array[index + 1] = number;
                }
            }
        }
        return array;
    }
}
