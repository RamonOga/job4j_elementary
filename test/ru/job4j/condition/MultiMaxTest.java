package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MultiMaxTest {

    @Test
    public void whenMaxFirst() {
        int rsl = MultiMax.max(3, 2, 1);
        Assert.assertEquals(rsl, 3);
    }

    @Test
    public void whenMaxSecond() {
        int rsl = MultiMax.max(1, 3, 2);
        Assert.assertEquals(rsl, 3);
    }

    @Test
    public void whenMaxThird() {
        int rsl = MultiMax.max(1, 2, 3);
        Assert.assertEquals(rsl, 3);
    }

    @Test
    public void whenAllNumbersEqual() {
        int rsl = MultiMax.max(99, 99, 99);
        Assert.assertEquals(rsl, 99);
    }
}