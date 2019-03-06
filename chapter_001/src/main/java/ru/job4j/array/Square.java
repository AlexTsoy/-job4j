package ru.job4j.array;

/**
 * class Square.
 *
 * @author Alexey Tsoy (alextsoy1984@mail.ru)
 * @version 1
 * @since 06.03.2019
 */
public class Square {

    /**
     * Массив заполнеными  числами в квадрате
     * @param bound аргумент
     * return результат
     */
    public int[] calculate(int bound){
        int[] rst = new int[bound];
        for(int i = 0; i < bound; i++){
            rst[i] = (i + 1) * (i + 1);
        }
        return rst;
    }
}



