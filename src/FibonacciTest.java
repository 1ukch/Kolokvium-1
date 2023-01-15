import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FibonacciTest {
    @Test
    public void testNthFibonacci() {
        // Arrange
        int n = 5;
        int expected = 3;

        // Act
        int result = Fibonacci.nthFibonacci(n);

        // Assert
        assertEquals(expected, result);
    }

    @Test
    public void testFirstNFibonacci() {
        // Arrange
        int n = 5;
        int[] expected = {0, 1, 1, 2, 3};

        // Act
        int[] result = Fibonacci.firstNFibonacci(n);

        // Assert
        assertArrayEquals(expected, result);
    }
}
