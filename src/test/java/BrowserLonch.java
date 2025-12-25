import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BrowserLonch
{
    WebDriver driver;

    @BeforeMethod
    public void setup()
    {
        driver = new ChromeDriver();

    }

    @Test
    public void login()
    {
        driver.get("https://www.saucedemo.com/v1/index.html");
    }

    @AfterMethod
    public void logout()
    {
       // driver.quit();
    }
}
