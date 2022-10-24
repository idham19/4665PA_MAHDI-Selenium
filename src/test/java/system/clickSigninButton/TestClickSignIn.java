package system.clickSigninButton;

import base.Base;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import page_library.HomePage;
import page_library.SignInPage;

import static org.testng.AssertJUnit.assertTrue;

public class TestClickSignIn extends Base {

    @Test(groups = "smoke")
    public void testSignIn() {
        SignInPage signInPage = new SignInPage();
        HomePage homePage = new HomePage();
        homePage.clickSignInButton();
        WebElement alreadyRegisteredString = signInPage.alreadyRegisteredSubHeading;
        assertTrue(alreadyRegisteredString.isDisplayed());
    }

}
