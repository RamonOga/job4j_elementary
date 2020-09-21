package ru.job4j.calculator;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

public class FitTest {

    @Test
    public void whenHeight180Then92Man() {
        short in = 180;
        double expected = 92;
        double out = Fit.manWeight(in);
        Assert.assertEquals(expected, out, 0.00001);
    }

    @Test
    public void whenHeight180Then80woman() {
        short in = 180;
        double expected = 80.5f;
        double out = Fit.womanWeight(in);
        Assert.assertEquals(expected, out, 0.00001);
    }
}