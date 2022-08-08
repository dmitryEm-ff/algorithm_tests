package ru.job4j.sort;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

import static org.junit.jupiter.api.Assertions.*;

class SortMapTest {
    @Test
    public void test() {
        Map<Integer, String> input = Map.of(
                1, "1",
                2, "2",
                3, "3"
        );
        Map<Integer, String> expect = new TreeMap<>(Comparator.reverseOrder());
        expect.putAll(input);
        Map<Integer, String> result = SortMap.sort(input);
        Assert.assertEquals(expect, result);
    }
}