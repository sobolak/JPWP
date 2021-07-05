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
    public static void tearDown() { network = null; }

    @Test
    public void testConvertMaskToDecimal() {
        assertEquals("255.255.0.0", network.getNetworkMaskDecimal());
    }

    @Test
    public void testConvertMaskToDecimalIncorrect() {
        assertNotEquals("2.1.99.7", network.getNetworkMaskDecimal());
    }

    @Nested
    @TestInstance(TestInstance.Lifecycle.PER_CLASS)
    class NumberOfHostsCorrectness {

        ArrayList<Integer> list;

        @BeforeAll
        public void init() {
            list = new ArrayList<>();
            list.add(38);
            list.add(1);
            list.add(191);
        }

        @AfterAll
        public void tearDown() {
            list = null;
        }

        @Test
        public void testIfNumberOfHostsIsCorrect() {
            assertTrue(network.isNumberOfHostsCorrect(list));
        }
    }
}