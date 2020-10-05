package ru.job4j.pojo;

import static org.hamcrest.Matchers.nullValue;
import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.Test;

public class ShopDropTest {

    @Test
    public void whenDropFirst() {
        Product[] products = new Product[2];
        products[0] = new Product("Milk", 10);
        products[1] = new Product("Bread", 4);
        Product[] rsl = ShopDrop.leftShift(products, 0);
        assertThat(rsl[0].getName(), is("Bread"));
        assertThat(rsl[1], is(nullValue()));
    }

    @Test
    public void whenDropLast() {
        Product[] products = new Product[2];
        products[0] = new Product("Milk", 10);
        products[1] = new Product("Bread", 4);
        Product[] rsl = ShopDrop.leftShift(products, 1);
        assertThat(rsl[0].getName(), is("Milk"));
        assertThat(rsl[1], is(nullValue()));
    }

    @Test
    public void whenDrop10() {
        Product[] products = new Product[8];
        products[0] = new Product("first", 10);
        products[1] = new Product("second", 4);
        products[2] = new Product("third", 10);
        products[3] = new Product("fourth", 4);
        products[4] = new Product("fifth", 10);
        products[5] = new Product("sixth", 4);
        products[6] = new Product("seventh", 10);
        products[7] = new Product("eighth", 4);
        Product[] rsl = ShopDrop.leftShift(products, 0);
        assertThat(rsl[0].getName(), is("second"));
        assertThat(rsl[7], is(nullValue()));
    }
}