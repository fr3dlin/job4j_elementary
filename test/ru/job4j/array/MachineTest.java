package ru.job4j.array;

import org.junit.Test;
import ru.job4j.array.Machine;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class MachineTest {
    @Test
    public void whenEquals() {
        int[] expected = {};
        int[] rsl = Machine.change(100, 100);
        assertThat(rsl, is(expected));
    }

    @Test
    public void when50by35() {
        int[] expected = {10, 5};
        int[] rsl = Machine.change(50, 35);
        assertThat(rsl, is(expected));
    }

    @Test
    public void when60by32() {
        int[] expected = {10, 10, 5, 2, 1};
        int[] rsl = Machine.change(60, 32);
        assertThat(rsl, is(expected));
    }
}