package com.example.sorting;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class SortingUtilityTest {

    private Integer[] array;
    List<Integer> expected;

    @BeforeEach
    public void before() {

        // Generate an array of random integers:
        array = IntStream.generate(() -> (int) (Math.random() * 50000))
                .boxed()
                .limit(1000)
                .toArray(Integer[]::new);

        expected = Arrays.stream(array)
                .collect(Collectors.toList());

    }

    @Test
    public void testGnomeSort() {

        Collections.sort(expected);
        SortingUtility.gnomeSort(array);

        List<Integer> actual = Arrays.stream(array)
                .collect(Collectors.toList());

        boolean result = actual.equals(expected);

        assertTrue(result);

    }

    @Test
    public void testCocktailShakerSort() {

        Collections.sort(expected);
        SortingUtility.cocktailShakerSort(array);

        List<Integer> actual = Arrays.stream(array)
                .collect(Collectors.toList());

        boolean result = actual.equals(expected);

        assertTrue(result);

    }

    @Test
    public void testShellSort() {

        Collections.sort(expected);
        SortingUtility.shellSort(array);

        List<Integer> actual = Arrays.stream(array)
                .collect(Collectors.toList());

        boolean result = actual.equals(expected);

        assertTrue(result);

    }

}