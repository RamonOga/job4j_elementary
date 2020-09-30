package ru.job4j.condition;

import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;
import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void when00to20then2() {
        Point one = new Point(0, 0);
        Point two = new Point(2, 0);
        int expected = 2;
        double out = one.distance(two);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when00to30then4() {
        int expected = 4;
        Point one = new Point(0, 0);
        Point two = new Point(4, 0);
        double out = one.distance(two);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when11to11then0() {
        int expected = 0;
        Point one = new Point(1, 1);
        Point two = new Point(1, 1);
        double out = one.distance(two);
        Assert.assertEquals(expected, out, 0.01);
    }
}