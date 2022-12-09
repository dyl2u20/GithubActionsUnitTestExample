package ie.atu.addition;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    @Test
    @DisplayName("Username Setter Test")
    void testSetter() {
        User newUser = new User("Adrian");

        newUser.setUsername("Ciara");
        assertEquals("John", newUser.getUsername(), "Username should be Ciara");
    }

}