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
    public int indexOf(int[] data, int el){
        int rst = -1; // если элемента нет в массиве, то возвращаем -1.
        for (int index = 0; index < data.length; index++){
            if (data[index] == el){
                rst = index;
                break;
            }
        }
        return rst;
    }
}
