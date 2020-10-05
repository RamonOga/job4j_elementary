package ru.job4j.pojo;

import static org.junit.Assert.*;

import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.is;
import org.junit.Test;

public class LicenseTest {

    @Test
    public void eqName() {
        License first = new License();
        first.setCode("audio");
        License second = new License();
        second.setCode("audio");
        assertThat(first, is(second));
    }

    @Test
    public void eqNameNull() {
        License first = new License();
        License second = new License();
        assertThat(first, is(second));
    }
}