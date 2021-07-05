package zad2;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PrimeNumbersTest {

    @Test
    void finalResult() {
        assertEquals(
                List.of(2),
                PrimeNumbers.finalResult(2)
        );
        assertEquals(
                List.of(2, 3),
                PrimeNumbers.finalResult(3)
        );
        assertEquals(
                List.of(2, 3, 5, 7),
                PrimeNumbers.finalResult(9)
        );
        assertEquals(
                List.of(2, 3, 5, 7, 11, 13, 17),
                PrimeNumbers.finalResult(17)
        );
        assertEquals(
                List.of(2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31),
                PrimeNumbers.finalResult(33)
        );
        assertEquals(
                List.of(2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37),
                PrimeNumbers.finalResult(37)
        );
    }

    @Test
    void invalidMaxNumber() {
        assertThrows(
                NumberFormatException.class,
                () -> PrimeNumbers.finalResult(-997)
        );
        assertThrows(
                NumberFormatException.class,
                () -> PrimeNumbers.finalResult(1)
        );
        assertThrows(
                NumberFormatException.class,
                () -> PrimeNumbers.finalResult(0)
        );
    }
}