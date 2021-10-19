package lesson.Lesson07;

public class TestLoginPage {
    public static void main(String[] args) {
        testInternalLoginPage();
        System.out.println("======");
        testExternalLoginPage();
    }

    private static void testInternalLoginPage() {
        LoginPage loginPage = new InternalLoginPage();
        LoginFlow.login(loginPage);
    }

    private static void testExternalLoginPage() {
        LoginPage loginPage = new ExternalLoginPage();
        LoginFlow.login(loginPage);
    }
}
