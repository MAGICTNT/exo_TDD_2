package fr.maxime.utils;

import static org.junit.jupiter.api.Assertions.*;

import fr.maxime.utils.Fib;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.List;

public class FibTest {

    private Fib fib;
    private List<Integer> result;
    private List<Integer> expected;
    // Test pour un range de 1
    @Test
    public void testFib_Serie_Range_1_notEmpty() {
        fib = new Fib(1);
        result = fib.getFibSeries();

        Assertions.assertFalse(result.isEmpty());


    }

    @Test
    public void testFib_Serie_Range_1_with_0() {
        fib = new Fib(1);
        result = fib.getFibSeries();

        Assertions.assertEquals(0, result.get(0));
    }

    // Test pour un range de 6
    @Test
    public void testFib_Serie_Range_6_containe_3() {
        fib = new Fib(6);
         result = fib.getFibSeries();

        Assertions.assertTrue(result.contains(3));

    }

    @Test
    public void testFib_Serie_Range_6_containe_6_element() {
        fib = new Fib(6);
        result = fib.getFibSeries();

        Assertions.assertEquals(6, result.size());

    }

    @Test
    public void testFib_Serie_Range_6_don_t_containe_4() {
        fib = new Fib(6);
        result = fib.getFibSeries();

        Assertions.assertFalse(result.contains(4));


    }

    @Test
    public void testFib_Serie_Range_6_have_list_0_1_1_2_3_5() {
        fib = new Fib(6);
        result = fib.getFibSeries();

        expected = List.of(0, 1, 1, 2, 3, 5);
        Assertions.assertEquals(expected, result);

    }

    @Test
    public void testFib_Serie_Range_6_desc() {
        fib = new Fib(6);
        result = fib.getFibSeries();

        for (int i = 1; i < result.size(); i++) {
            Assertions.assertTrue(result.get(i) >= result.get(i - 1));
        }
    }
}
