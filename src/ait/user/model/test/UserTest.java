package ait.user.model.test;
import ait.user.model.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;



import static org.junit.jupiter.api.Assertions.*;

class UserTest {
    private User user;
    private String email = "markstevens@gmail.com";
    private String password = "Uu12345!";

    @BeforeEach
    void setUp() {
        user = new User(email, password);
    }

    @Test
    void testValidEmail() {
        String validEmail = "   markstevens@gmail.com ";
        user.setEmail(validEmail.trim());
        assertEquals(validEmail.trim(), user.getEmail());
    }

    @Test
    void testEmailWithoutAt() {
        String invalidEmail = "markstevens@gmail.com";
        user.setEmail(invalidEmail);
        assertEquals(email, user.getEmail());
    }

    @Test
    void testEmailDoubleAt() {
        String invalidEmail = "mark@stevens@gmail.com";
        user.setEmail(invalidEmail);
        assertEquals(email, user.getEmail());
    }

    @Test
    void testEmailDotAfterAt() {
        String invalidEmail = "markstevens@gmailcom";
        user.setEmail(invalidEmail);
        assertEquals(email, user.getEmail());
    }

    @Test
    void testEmailLastDot() {
        String invalidEmail = "markstevens@gmailcom.";
        user.setEmail(invalidEmail);
        assertEquals(email, user.getEmail());
        invalidEmail = "john@gmxd.e";
        user.setEmail(invalidEmail);
        assertEquals(email, user.getEmail());
    }

    @Test
    void testEmailIncorrectSymbol() {
        String invalidEmail = "$markstevens@gmail.com";
        user.setEmail(invalidEmail);
        assertEquals(email, user.getEmail());
    }

    @Test
    void testValidPassword() {
        String validPassword = "U12345u!";
        user.setPassword(validPassword);
        assertEquals(validPassword, user.getPassword());
    }

    @Test
    void testPasswordLength() {
        String invalidPassword = "u12345!";
        user.setPassword(invalidPassword);
        assertEquals(password, user.getPassword());
    }

    @Test
    void testPasswordUpperCase() {
        String invalidPassword = "Uu!";
        user.setPassword(invalidPassword);
        assertEquals(password, user.getPassword());
    }

    @Test
    void testPasswordLowerCase() {
        String invalidPassword = "Uu12345";
        user.setPassword(invalidPassword);
        assertEquals(password, user.getPassword());
    }

}
