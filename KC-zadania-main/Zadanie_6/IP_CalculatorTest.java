import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class IP_CalculatorTest {
    @Test
    public void testLowestNotAllowedMask() {
        assertFalse(IP_Calculator.isMaskCorrect("cybant"));
    }

    @Test
    public void testMaximumAllowedAddress() {
        assertTrue(IP_Calculator.isAddressCorrect("192.168.2.3"));
    }
}