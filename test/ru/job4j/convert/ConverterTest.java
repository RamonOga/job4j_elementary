package ru.job4j.convert;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConverterTest {

    @Test
    public void whenConvert210RubThen3Euro() {
        int in = 210;
        int out = Converter.rubleToEuro(in);
        int expected = 3;
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenConvert120RubThen2Dollars() {
        int in = 120;
        int out = Converter.rubleToDollar(in);
        int expected = 2;
        Assert.assertEquals(expected, out);
    }
}