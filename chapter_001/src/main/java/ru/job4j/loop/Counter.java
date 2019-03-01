package ru.job4j.loop;

/**
 * @author Alexey Tsoy (alextsoy1984@mail.ru)
 * @version 1
 * @since 27.02.2019
 */
public class Counter {
    public int add(int start, int finish) {
        int sum = 0;
        for (int i = start; i <= finish; i++) {
            if (i % 2 == 0) {
                sum = sum + i;
            }
        }
        return sum;
    }
}

