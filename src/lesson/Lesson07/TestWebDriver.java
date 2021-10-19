package lesson.Lesson07;

public class TestWebDriver {
    public static void main(String[] args) {
        WebDriver driver;

        if (System.getenv("browser") == null)
            driver = new ChromeDriver();
        else {
            if (System.getenv("browser").equalsIgnoreCase("chrome"))
                driver = new ChromeDriver();
            else driver = new FirefoxDriver();
        }
        driver.init();

        // respect Polymorphism concept
        WebDriver driver1 = new ChromeDriver();
        ChromeDriver driver2 = new ChromeDriver();
    }
}
