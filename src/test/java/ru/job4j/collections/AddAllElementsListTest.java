package ru.job4j.collections;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class AddAllElementsListTest {
    @Test
    public void containsElement() {
        List<String> left = new ArrayList<>();
        left.add("first");
        left.add("second");
        left.add("third");
        List<String> right = new ArrayList<>();
        right.add("fourth");
        right.add("second");
        right.add("fifth");
        String check = "second";
        int result = AddAllElementsList.containsElement(left, right, check);
        assertThat(result, is(3));
    }

    @Test
    public void containsElementInFirstList() {
        List<String> left = new ArrayList<>();
        left.add("first");
        left.add("second");
        left.add("third");
        List<String> right = new ArrayList<>();
        right.add("fourth");
        right.add("fifth");
        String check = "second";
        int result = AddAllElementsList.containsElement(left, right, check);
        assertThat(result, is(1));
    }
}