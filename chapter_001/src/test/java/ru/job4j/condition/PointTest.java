package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.number.IsCloseTo.closeTo;
import static org.junit.Assert.assertThat;

public class PointTest {

    @Test
    public void distancePointAtoB(){
        Point a = new Point(4, 3);
        Point b = new Point(8, 5);
        double result = a.distanceTo(b);
        assertThat(result, closeTo(4, 5));
    }
}
