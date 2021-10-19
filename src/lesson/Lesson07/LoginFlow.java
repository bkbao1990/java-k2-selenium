package lesson.Lesson07;

public class LoginFlow {
    public static void login(LoginPage loginPage){
        System.out.println("User name: " + loginPage.usernameSelector());
        System.out.println("Pass: " + loginPage.passwordSelector());
        System.out.println("Login Button: " + loginPage.loginButtonSelector());
    }
}
