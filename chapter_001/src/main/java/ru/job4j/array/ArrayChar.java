package ru.job4j.array;

/**
 * class ArrayChar.
 *
 * @author Alexey Tsoy (alextsoy1984@mail.ru)
 * @version 1
 * @since 10.03.2019
 */
public class ArrayChar {
    private char[] data;

    public ArrayChar(String line) {
        this.data = line.toCharArray();
    }

    /**
     * Проверяет, что слово начинается с префикса.
     * @param prefix префикс.
     * @return если слово начинается с префикса
     */
    public boolean startWith(String prefix) {
        boolean result = true;
        char[] value = prefix.toCharArray();
        int min = Math.min(data.length, value.length);
        for (int index = 0; index < min; index++){
            if (data[index] != value[index]){
                result = false;
                break;
            } else result = true;
        }
        return result;
    }
}
