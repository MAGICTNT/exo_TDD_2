package fr.maxime.utils;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.ArrayList;
import java.util.List;

public class FibTestParam {
    private Fib fib;
    private List<Integer> resultList;

    @ParameterizedTest
    @ValueSource(ints = {1, 6})
    public void testFib_Serie_notEmpty(int range) {
        fib = new Fib(range);
        resultList = new ArrayList<>();
        resultList = fib.getFibSeries();

        Assertions.assertFalse(resultList.isEmpty());
    }


    @ParameterizedTest
    @ValueSource(ints = {1})
    public void testFib_Serie_Range_1_with_0(int range) {
        fib = new Fib(range);
        resultList = new ArrayList<>();
        int expected = 0;
        resultList = fib.getFibSeries();

        Assertions.assertEquals(expected, resultList.get(0));
    }

    // Test pour un range de 6 et vérifier si la série contient un certain nombre
    @ParameterizedTest
    @CsvSource({
            "6, 3, true",
            "6, 4, false"
    })
    public void testFib_Serie_Range_6_contains_element(int range, int element, boolean expected) {
        fib = new Fib(range);
        resultList = new ArrayList<>();
        resultList = fib.getFibSeries();

        Assertions.assertEquals(expected, resultList.contains(element));
    }

    // Test pour vérifier le nombre d'éléments dans la série pour un range donné
    @ParameterizedTest
    @CsvSource({
            "1, 1",
            "6, 6"
    })
    public void testFib_Serie_Range_Size(int range, int expectedSize) {
        fib = new Fib(range);
        resultList = new ArrayList<>();
        resultList = fib.getFibSeries();

        Assertions.assertEquals(expectedSize, resultList.size());
    }

    @Test
    public void testFib_Serie_Range_6_have_list_0_1_1_2_3_5() {
        fib = new Fib(6);
        resultList = new ArrayList<>();
        resultList = fib.getFibSeries();

        List<Integer> expected = List.of(0, 1, 1, 2, 3, 5);
        Assertions.assertEquals(expected, resultList);
    }


    @ParameterizedTest
    @ValueSource(ints = {6})
    public void testFib_Serie_Range_6_desc(int range) {
        fib = new Fib(range);
        resultList = new ArrayList<>();
        resultList = fib.getFibSeries();

        for (int i = 1; i < resultList.size(); i++) {
            Assertions.assertTrue(resultList.get(i) >= resultList.get(i - 1));
        }
    }
}
