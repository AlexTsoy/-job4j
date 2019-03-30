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
        int count = 0;
        for (int i = 0; i < left.length; i++) {
            merge [count] = left[i];
            count++;
        }
        for (int j = 0; j < right.length; j++) {
            merge [count] = right[j];
            count++;
        }
        for(int i = merge.length-1 ; i > 0 ; i--){
            for(int j = 0 ; j < i ; j++){
                if( merge[j] > merge[j+1] ){
                int tmp = merge[j];
                merge[j] = merge[j+1];
                merge[j+1] = tmp;
            }
        }
    }
    return merge;
    }
}
