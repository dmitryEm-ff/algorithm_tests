package ru.job4j.collections;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class ListIteratorUsageTest {
    @Test
    public void main() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        ListIteratorUsage.main(null);
        String ln = System.lineSeparator();
        String expected = "Start iterate..." + ln
                + "one" + ln + "two" + ln + "three" + ln
                + "Change direction iterate..." + ln
                + "three" + ln + "two" + ln + "one" + ln
                + "Finish iterate..." + ln;
        assertThat(out.toString(), is(expected));
    }
}