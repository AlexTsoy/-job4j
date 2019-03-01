package ru.job4j.loop;

/**
 * @author Alexey Tsoy (alextsoy1984@mail.ru)
 * @version 1
 * @since 02.03.2019
 */
public class Factorial {
    public int calc(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result = result * i;
        }
        return result;
    }
}