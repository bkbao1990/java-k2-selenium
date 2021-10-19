package lesson.Lesson07;

public class InternalLoginPage extends LoginPage{
    @Override
    protected String passwordSelector() {
        return null;
    }

    @Override
    protected String usernameSelector() {
        return null;
    }

    @Override
    protected String loginButtonSelector() {
        return null;
    }
}
