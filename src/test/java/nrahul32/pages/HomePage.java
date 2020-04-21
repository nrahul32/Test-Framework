package nrahul32.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void load() {
        driver.get("https://www.flipkart.com/");
    }

    private void clickLoginLink() {
        driver.findElement(By.xpath("//a[text()='Login']")).click();
    }

    public void enterUsername(String username) {
        driver.findElement(By.xpath("//span[contains(text(), 'Enter Email/Mobile number')]/../../input")).sendKeys(username);
    }

    public void enterPassword(String password) {
        driver.findElement(By.xpath("//span[contains(text(), 'Enter Password')]/../../input")).sendKeys(password);
    }

    public void clickLoginButton() {
        driver.findElement(By.xpath("//span[contains(text(), 'Login')]/../../button")).click();
    }

    public boolean IsUsernameErrorDisplayed() {
        return driver.findElement(By.xpath("//span[text() = 'Please enter valid Email ID/Mobile number']")).isDisplayed();
    }
}
