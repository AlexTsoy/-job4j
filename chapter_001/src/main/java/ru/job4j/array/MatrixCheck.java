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
        boolean tmp = data[0][0];
        boolean tmp2 = data[0][data.length - 1];
        for (int i = 1; i < data.length; i++) {
            if (data[i][i] != tmp || data[i][data.length - i - 1] != tmp2) {
                result = false;
            }
        }
        return result;
    }
}
