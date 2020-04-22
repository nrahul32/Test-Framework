package nrahul32.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage {
    private WebDriver driver;

    @FindBy(how = How.XPATH, using = "//a[text()='Login']")
    private WebElement LoginLink;

    @FindBy(how = How.XPATH, using = "//span[contains(text(), 'Enter Email/Mobile number')]/../../input")
    private WebElement username;

    @FindBy(xpath = "//span[contains(text(), 'Enter Password')]/../../input")
    private WebElement password;

    @FindBy(xpath = "//span[contains(text(), 'Login')]/../../button")
    private WebElement loginButton;

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
        this.username.sendKeys(username);
    }

    public void enterPassword(String password) {
        this.password.sendKeys(password);
    }

    public void clickLoginButton() {
        loginButton.click();
    }

    public boolean IsInvalidUsernameErrorDisplayed() {
        return driver.findElement(By.xpath("//span[text() = 'Please enter valid Email ID/Mobile number']")).isDisplayed();
    }
}
