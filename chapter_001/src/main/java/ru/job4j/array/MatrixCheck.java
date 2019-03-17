package ru.job4j.array;

/**
 * class MatrixCheck.
 *
 * @author Alexey Tsoy (alextsoy1984@mail.ru)
 * @version 1
 * @since 12.03.2019
 */
public class MatrixCheck {

    /**
     * Метод проверяет, что все элементы по диагоналям равны true или false.
     * @param data двойной массив.
     * return результат
     */
    public boolean mono(boolean[][] data) {
        boolean result = true;
        int count1 = 0;
        int count2 = data.length - 1;
        for (int i = 0; i < data.length - 1; i++) {
           if ((data[count1][count2] != data[count1 + 1][count2 + 1])
                   || (data[count1][count2] != data[count1 + 1][count2 - 1])) {
               result = false;
               break;
           } else {
               result = true;
               count1++;
               count2--;
           }
           if ((count1 == data.length - 1) || (count2 == 0)) {
               break;
           }
        }
        return result;
    }
}
