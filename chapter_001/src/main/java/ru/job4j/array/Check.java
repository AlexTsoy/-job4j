package ru.job4j.array;

/**
 * class Check.
 *
 * @author Alexey Tsoy (alextsoy1984@mail.ru)
 * @version 1
 * @since 08.03.2019
 */
public class Check {

    /**
     * Метод проверки массива на boolean значения true или false.
     * @param data необходимый нам для проверки массив.
     * return результат
     */
    public boolean mono(boolean[] data) {
        boolean result = false;
        for (int index = 0; index != data.length - 1; index++) {
            if (data[0] != data[index + 1]) {
                result = false;
                break;
            } else {
                result = true;
            }
        }
        return result;
    }
}
