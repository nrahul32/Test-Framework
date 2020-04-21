package nrahul32;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTests {

    /**
     * This is a test that navigates to Flipkart website, enters wrong username and password
     * and verifies that the invalid credentials error is shown
     */
    @Test
    public static void LoginTest() {

        WebDriverManager.chromedriver().version("80.0.3987").setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.flipkart.com/");

        // Commenting as the div opens automatically
        // driver.findElement(By.xpath("//a[text()='Login']")).click();

        driver.findElement(By.xpath("//span[contains(text(), 'Enter Email/Mobile number')]/../../input")).sendKeys("asd");
        driver.findElement(By.xpath("//span[contains(text(), 'Enter Password')]/../../input")).sendKeys("asasd");
        driver.findElement(By.xpath("//span[contains(text(), 'Login')]/../../button")).click();
        Assert.assertTrue(driver.findElement(By.xpath("//span[text() = 'Please enter valid Email ID/Mobile number']")).isDisplayed());

        driver.quit();
    }

}
