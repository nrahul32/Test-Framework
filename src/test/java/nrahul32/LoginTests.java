package nrahul32;

import nrahul32.pages.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginTests extends TestBase {

    private HomePage flipkart;

    @BeforeClass
    private void setup(){
        flipkart = new HomePage(driver);
        PageFactory.initElements(driver, flipkart);
    }

    /**
     * This is a test that navigates to Flipkart website, enters wrong username and password
     * and verifies that the invalid credentials error is shown
     */
    @Test
    private void LoginTest() {
        flipkart.load();
        flipkart.enterUsername("wrong_username");
        flipkart.enterPassword("wrong_password");
        flipkart.clickLoginButton();
        Assert.assertTrue(flipkart.IsInvalidUsernameErrorDisplayed());
    }

}
