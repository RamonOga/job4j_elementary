package ru.job4j.condition;

import org.junit.Test;
import org.junit.Assert;

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
    public void when000to1000then10() {
        int expected = 10;
        Point one = new Point(0, 0, 0);
        Point two = new Point(10, 0, 0);
        double out = one.distance3d(two);
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

    @Test
    public void when131112to1031441then95() {
        float expected = 95.86f;
        Point one = new Point(13, 111, 2);
        Point two = new Point(103, 144, 1);
        double out = one.distance3d(two);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when100toMinus100then346() {
        float expected = 346.41f;
        Point one = new Point(-100, -100, -100);
        Point two = new Point(100, 100, 100);
        double out = one.distance3d(two);
        Assert.assertEquals(expected, out, 0.01);
    }
}