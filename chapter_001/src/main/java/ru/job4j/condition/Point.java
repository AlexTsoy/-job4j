package ru.job4j.condition;

/**
 * @author Alexey Tsoy.
 * @version 1
 * @since 26.02.2019
 */
public class Point {
    public double distance(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }
}
