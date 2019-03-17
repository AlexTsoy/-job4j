package ru.job4j.loop;

import java.util.function.BiPredicate;

/**
 *
 * @author Alexey Tsoy (alextsoy1984@mail.ru)
 * @version 01
 * @since 04.03.2019
 */
public class Paint {
    public String rightTrl(int height) {
        StringBuilder screen = new StringBuilder();
        int width = height;
        for (int row = 0; row != height; row++) {
            for (int column = 0; column != width; column++) {
                if (row >= column) {
                    screen.append("^");
                    } else {
                    screen.append(" ");
                }
            }
            screen.append(System.lineSeparator());
        }
        return screen.toString();
    }

    public String leftTrl(int height) {
        StringBuilder screen = new StringBuilder();
        int width = height;
        for (int row = 0; row != height; row++) {
            for (int col = 0; col != width; col++) {
                if (row >= width - col - 1) {
                    screen.append("^");
                } else {
                    screen.append(" ");
                }
            }
            screen.append(System.lineSeparator());
        }
        return screen.toString();
    }

    public String pyramid(int height) {
        StringBuilder screen = new StringBuilder();
        int widht = 2 * height - 1;
        for (int row = 0; row != height; row++) {
            for (int col = 0; col != widht; col++) {
                if (row >= height - col - 1 && row + height - 1 >= col) {
                    screen.append("^");
                } else {
                    screen.append(" ");
                }
            }
            screen.append(System.lineSeparator());
        }
        return screen.toString();
    }
}