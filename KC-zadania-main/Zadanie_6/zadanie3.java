import org.junit.jupiter.api.*;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;

public class NetworkTest {

    static private Network network;

    @BeforeAll
    public static void init() {
        network = new Network("192.168.0.0", 16);
    }

    @AfterAll
    public static void tearDown() { 
        network = null; 
    }

    @Test
    public void testConvertMaskToDecimal() {
        assertEquals("255.255.0.0", network.getNetworkMaskDecimal());
    }

    @Test
    public void testConvertMaskToDecimalIncorrect() {
        assertNotEquals("99.72.21.4", network.getNetworkMaskDecimal());
    }
}

