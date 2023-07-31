import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumCalculatorTest {

    @Test
    void testSum1() {

        //Given
        final var sumCalculator = new SumCalculator();

        //When
        int result = sumCalculator.sum(1);

        //Then
        final int expected = 1;
        assertEquals(result, expected);
    }

    @Test void testSum3() {

        //Given
        final var sumCalculator = new SumCalculator();

        //When
        int result = sumCalculator.sum(3);

        //Then
        final int expected = 6;
        assertEquals(result, expected);
    }
    @Test void testSum0() {

        //Given
        final var sumCalculator = new SumCalculator();

        //When & Then
        assertThrows(IllegalArgumentException.class,()->sumCalculator.sum(0));
    }
}