package ru.job4j.loop;

import org.junit.Test;

import static org.junit.Assert.*;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FactorialTest {
    @Test
    public void whenCalculateFactorialForFiveThenOneHundreedTwenty() {
        int in = 5;
        int out = Factorial.calc(in);
        assertThat(out, is(120));

    }

    @Test
    public void whenCalculateFactorialForZeroThenOne() {
        int in = 0;
        int out = Factorial.calc(in);
        assertThat(out, is(1));
    }
}