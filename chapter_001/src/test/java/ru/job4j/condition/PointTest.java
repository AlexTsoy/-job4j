package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.number.IsCloseTo.closeTo;
import static org.junit.Assert.assertThat;

public class PointTest {
    @Test
    public void distanceApointB(){
        Point x = new Point();
        double pointx = x.distanceTo(16);
        Point y = new Point();
        double pointy = y.distanceTo(2);
        double ab = Math.sqrt(pointx + pointy);
        assertThat(ab, closeTo(4,5));
    }

}
