import java.util.Scanner;

public class UserRegistrationTest {
    @Test
    public void givenFirstName_WhenProper_ShouldReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.validateFirstName("John");
        Assertions.assertTrue(result);
    }

    @Test
    public void givenFirstName_WhenShort_ShouldReturnFalse() {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.validateFirstName("Jo");
        Assertions.assertFalse(result);
    }

    @Test
    public void givenFirstName_WhenNotStartingWithUpperCase_ShouldReturnFalse() {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.validateFirstName("john");
        Assertions.assertFalse(result);
    }

    @Test
    public void givenLastName_WhenProper_ShouldReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.validateLastName("Doe");
        Assertions.assertTrue(result);
    }

    @Test
    public void givenLastName_WhenShort_ShouldReturnFalse() {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.validateLastName("Do");
        Assertions.assertFalse(result);
    }

    @Test
    public void givenLastName_WhenNotStartingWithUpperCase_ShouldReturnFalse() {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.validateLastName("doe");
        Assertions.assertFalse(result);
    }

    @Test
    public void givenEmail_WhenProper_ShouldReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.validateEmail("john.doe@gmail.com");
        Assertions.assertTrue(result);
    }

    @Test
    public void givenEmail_WhenNotProper_ShouldReturnFalse() {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.validateEmail("john.doe.gmail.com");
        Assertions.assertFalse(result);
    }

    @Test
    public void givenMobileNumber_WhenProper_ShouldReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.validateMobileNumber("91 9876543210");
        Assertions.assertTrue(result);
    }

    @Test
    public void givenMobileNumber_WhenNotProper_ShouldReturnFalse() {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.validateMobileNumber("919876543210");
        Assertions.assertFalse(result);
    }

    @Test
    public void givenPassword_WhenProper_ShouldReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.validatePassword("Abcd1234@");
        Assertions.assertTrue(result);
    }

    @Test
    public void givenPassword_WhenNotProper_ShouldReturnFalse() {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.validatePassword("1234");
        Assertions.assertFalse(result);
    }
}