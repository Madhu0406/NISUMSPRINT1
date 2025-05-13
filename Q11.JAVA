import java.util.regex.*;

public class AuthUtil {

    public static boolean isValidUsername(String username) {
        String emailRegex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
        return username.matches(emailRegex);
    }

    public static boolean isValidPassword(String password) {
        String passwordRegex = "^(?=.*[A-Za-z])(?=.*\\d)(?=.*[@#$%^&+=!]).{6,}$";
        return password.matches(passwordRegex);
    }

    public static void Q11(String[] args) {
        String username = "user@GMAIL.com";
        String password = "Pass@123";

        if (isValidUsername(username) && isValidPassword(password)) {
            System.out.println("Valid credentials");
        } else {
            System.out.println("Invalid username or password");
        }
    }
}
