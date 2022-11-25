package ie.atu.addition;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AdditionTest {
    @Test
    @DisplayName("Addition test")
    void addsTwoNumbers() {
        Addition add = new Addition();
        assertEquals(15, add.addNumber(5, 5), "5 + 5 should give 10");
    }
}