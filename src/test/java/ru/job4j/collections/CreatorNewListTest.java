package ru.job4j.collections;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class CreatorNewListTest {
    @Test
    public void main() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        CreatorNewList.main(null);
        String ln = System.lineSeparator();
        String expected = "Создаем список с пустым конструктором." + ln
                + "Добавляем 3 элемента в список." + ln
                + "Создаем список - в конструктор передаем коллекцию." + ln
                + "Выводим все элементы в списке." + ln
                + "one" + ln + "two" + ln + "three" + ln;
        assertThat(out.toString(), is(expected));
    }
}