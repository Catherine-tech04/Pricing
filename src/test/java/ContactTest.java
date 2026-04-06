import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ContactTest {

    @Test
    void testContactCreation() {
        Contact contact = new Contact("Alice", "1234567890");

        assertEquals("Alice", contact.getName());
        assertEquals("1234567890", contact.getPhone());
    }

    @Test
    void testSetName() {
        Contact contact = new Contact("Bob", "9876543210");

        contact.setName("Charlie");

        assertEquals("Charlie", contact.getName());
    }

    @Test
    void testSetPhone() {
        Contact contact = new Contact("David", "1111111111");

        contact.setPhone("2222222222");

        assertEquals("2222222222", contact.getPhone());
    }
}