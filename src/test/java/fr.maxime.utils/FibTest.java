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
    public void testFib_Serie_Range_1() {
        fib = new Fib(1);
        result = fib.getFibSeries();

        Assertions.assertFalse(result.isEmpty());

        Assertions.assertEquals(1, result.size() );
        Assertions.assertEquals(0, result.get(0));
    }

    // Test pour un range de 6
    @Test
    public void testFib_Serie_Range_6() {
        fib = new Fib(6);
         result = fib.getFibSeries();

        Assertions.assertTrue(result.contains(3));

        Assertions.assertEquals(6, result.size());

        Assertions.assertFalse(result.contains(4));

         expected = List.of(0, 1, 1, 2, 3, 5);
        Assertions.assertEquals(expected, result);

        for (int i = 1; i < result.size(); i++) {
            Assertions.assertTrue(result.get(i) >= result.get(i - 1));
        }
    }
}
