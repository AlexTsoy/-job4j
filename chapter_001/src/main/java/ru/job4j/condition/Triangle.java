package ru.job4j.condition;

public class Triangle {

    public double period(double a, double b, double c) {
        return (a + b + c) / 2;
    }

    public double area(int x1, int y1, int x2, int y2, int x3, int y3) {
        double rsl = -1;
        Point point = new Point();
        double a = point.distance(x1, y1, x2, y2);
        double b = point.distance(x2, y2, x3, y3);
        double c = point.distance(x1, y1, x3, y3);
        double p = period(a, b, c);
        if (this.exist(a, b, c)) {
            rsl = Math.sqrt(p * (p - a)*(p - b)*(p - c));
        }
        return rsl;
    }

    private boolean exist(double a, double c, double b) {
        return (a + c > b && a + b > c && c + b > a);
    }
}
