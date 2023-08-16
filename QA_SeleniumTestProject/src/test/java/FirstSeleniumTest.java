import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FirstSeleniumTest {
    WebDriver driver; // wd, d etc.
    // before - setUp() method приводим систему к инициализированному состоянию (чистка, создание юзераб открытие сайта и т.д)
    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("https://www.ebay.com");
    }
    // test - test ()
    @Test
    public void ebayOpenTest() {
        System.out.println("Test Passed");
    }

    // after - tearDown()
    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
