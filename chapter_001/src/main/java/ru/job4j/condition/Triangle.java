package ru.job4j.condition;

public class Triangle {

    public double period(double a, double b, double c) {
        return (a + b + c) / 2;
    }

    public double area(int x1, int y1, int x2, int y2, int x3, int y3) {
        double rsl = -1;
        double a = new Point().distance(x1, y1, x2, y2);
        double b = new Point().distance(x2, y2, x3, y3);
        double c = new Point().distance(x1, y1, x3, y3);
        double p = period(a, b, c);
        if (this.exist(a, b, c)) {
            a = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
            b = Math.sqrt(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2));
            c = Math.sqrt(Math.pow(x3 - x1, 2) + Math.pow(y3 - y1, 2));
            rsl = Math.sqrt(p * (p - a)*(p - b)*(p - c));
        }
        return rsl;
    }

    private boolean exist(double a, double c, double b) {
        if (a + c < b || a + b < c || c + b < a){
            return false;
        }
            return true;
    }
}
