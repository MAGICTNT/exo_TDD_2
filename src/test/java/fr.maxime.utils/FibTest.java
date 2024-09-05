package fr.maxime.utils;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.List;

public class FibTest {

    private Fib fib;
    private int serie;
    private int expected;
    private List<Integer> resultList;
    private List<Integer> expectedList;
    // Test pour un range de 1


    @Test
    public void testFib_Serie_Range_1_notEmpty() {
        serie = 1;

        fib = new Fib(serie);
        resultList = fib.getFibSeries();

        Assertions.assertFalse(resultList.isEmpty());


    }

    @Test
    public void testFib_Serie_Range_1_with_0() {
        serie = 1;

        fib = new Fib(serie);
        resultList = fib.getFibSeries();

        Assertions.assertEquals(0, resultList.get(0));
    }

    // Test pour un range de 6
    @Test
    public void testFib_Serie_Range_6_containe_3() {
        int serie = 6;

        fib = new Fib(serie);
         resultList = fib.getFibSeries();

        Assertions.assertTrue(resultList.contains(3));

    }

    @Test
    public void testFib_Serie_Range_6_containe_6_element() {
        int serie = 6;

        fib = new Fib(serie);
        resultList = fib.getFibSeries();

        Assertions.assertEquals(6, resultList.size());

    }

    @Test
    public void testFib_Serie_Range_6_don_t_containe_4() {
        int serie = 6;

        fib = new Fib(serie);
        resultList = fib.getFibSeries();

        Assertions.assertFalse(resultList.contains(4));


    }

    @Test
    public void testFib_Serie_Range_6_have_list_0_1_1_2_3_5() {
        int serie = 6;

        fib = new Fib(serie);
        resultList = fib.getFibSeries();

        expectedList = List.of(0, 1, 1, 2, 3, 5);
        Assertions.assertEquals(expectedList, resultList);

    }

    @Test
    public void testFib_Serie_Range_6_desc() {
        int serie = 6;

        fib = new Fib(serie);
        resultList = fib.getFibSeries();

        for (int i = 1; i < resultList.size(); i++) {
            Assertions.assertTrue(resultList.get(i) >= resultList.get(i - 1));
        }
    }
}
