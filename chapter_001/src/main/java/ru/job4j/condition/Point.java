package ru.job4j.condition;


import static java.lang.Math.*;

/**
 * @author Alexey Tsoy.
 * @version 1
 * @since 26.02.2019
 */
public class Point {
    private int x;
    private int y;

    public Point(int first, int second) {
        this.x = first;
        this.y = second;
    }

    public double distance(Point that) {
        return sqrt(pow(this.x - that.x, 2) + pow(this.y - that.y, 2));
    }

    public void info() {
        System.out.println(String.format("Point [%s, %s]", this.x, this.y));
    }
}
