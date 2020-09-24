package ru.job4j.array;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FindLoopTest {

    @Test
    public void whenArrayHas5Then0() {
        int[] input = {5, 4, 3, 2};
        int value = 5;
        int result = FindLoop.indexOf(input, value);
        int expect = 0;
        assertThat(result, is(expect));
    }

    @Test
    public void whenArrayHas2Then3() {
        int[] input = {5, 4, 3, 2};
        int value = 2;
        int expect = 3;
        int rsl = FindLoop.indexOf(input, value);
        assertThat(rsl, is(expect));

    }

    @Test
    public void whenArrayHasLength5Then0() {
        int[] input = new int[] {5, 10, 3};
        int value = 5;
        int result = FindLoop.indexOf(input, value);
        int expect = 0;
        assertThat(result, is(expect));
    }

    @Test
    public void whenFind3() {
        int[] input = new int[] {5, 2, 10, 2, 4};
        int value = 2;
        int start = 2;
        int finish = 4;
        int result = FindLoop.indexOf(input, value, start, finish);
        int expect = 3;
        assertThat(result, is(expect));
    }

    @Test
    public void whenFind0() {
        int[] input = {9, 2, 3, 4, 5, 6, 7, 1};
        int value = 9;
        int start = 0;
        int finish = 5;
        int expect = 0;
        int rsl = FindLoop.indexOf(input, value, start, finish);
        assertThat(rsl, is(expect));
    }

    @Test
    public void whenNotFind() {
        int[] input = {999, 0, 0, 0, 0, 0, 0};
        int value = 999;
        int start = 1;
        int finish = input.length - 1;
        int rsl = FindLoop.indexOf(input, value, start, finish);
        int expect = -1;
        assertThat(rsl, is(expect));
    }

}