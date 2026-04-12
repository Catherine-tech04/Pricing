import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {

    // ================================
    // 1. PRICING TEST
    // ================================
    @Test
    void testPricing() {
        assertEquals(118.0, App.calculatePrice(100, true), 0.001);
        assertEquals(90.0, App.calculatePrice(100, false), 0.001);
    }
}