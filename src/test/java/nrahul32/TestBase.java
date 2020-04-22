package nrahul32;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class TestBase {

    public WebDriver driver;

    @BeforeSuite
    public void commonSetup(){
        WebDriverManager.chromedriver().version("80.0.3987").setup();
        driver = new ChromeDriver();
    }

    @AfterSuite
    public void cleanup(){
        driver.quit();
    }
}
