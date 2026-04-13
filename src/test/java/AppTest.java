import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {


    // ================================
    // 2. LOAN TEST
    // ================================
    @Test
    void testLoan() {
        assertEquals(50000, App.checkEligibility(50000, true));
        assertEquals(0, App.checkEligibility(50000, false));
    }

}