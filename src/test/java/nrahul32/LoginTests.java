package nrahul32;

import nrahul32.pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTests extends TestBase {

    /**
     * This is a test that navigates to Flipkart website, enters wrong username and password
     * and verifies that the invalid credentials error is shown
     */
    @Test
    public void LoginTest() {

        HomePage flipkart = new HomePage(driver);

        flipkart.load();
        flipkart.enterUsername("asd");
        flipkart.enterPassword("asdasd");
        flipkart.clickLoginButton();
        Assert.assertTrue(flipkart.IsUsernameErrorDisplayed());
    }

}
