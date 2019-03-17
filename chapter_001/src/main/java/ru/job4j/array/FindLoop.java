package ru.job4j.array;

/**
 * class FindLoop.
 *
 * @author Alexey Tsoy (alextsoy1984@mail.ru)
 * @version 1
 * @since 07.03.2019
 */
public class FindLoop {

    /**
     * Поиск индекса элемента массива.
     * @param el значение елемнта, соответствующего условиям поиска индекса массива.
     * return результат
     */
    public int indexOf(int[] data, int el) {
        int rst = -1;
        for (int i = 0; i < data.length; i++) {
            if (data[i] == el) {
                rst = i;
                break;
            }
        }
        return rst;
    }
}
