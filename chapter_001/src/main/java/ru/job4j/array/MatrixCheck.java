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
        int count = 0;
        int backCount = data.length - 1;
        for (int i = 0; i < data.length - 1; i++) {
           if ((data[count][count] != data[count + 1][count + 1])
                   || (data[count][backCount] != data[count + 1][backCount - 1])) {
               result = false;
               break;
           } else {
               result = true;
               count++;
               backCount--;
           }
           if ((count == data.length - 1) || (backCount == 0)) {
               break;
           }
        }
        return result;
    }
}
