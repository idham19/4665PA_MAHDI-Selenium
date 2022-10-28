package system.authentication;

import base.Base;
import org.testng.annotations.Test;
import page_library.AccountPage;
import page_library.HomePage;
import page_library.SignInPage;

import static org.testng.AssertJUnit.assertTrue;

public class TestSignIn extends Base {

    @Test
    public void testSignIn(){
        String userName= prop.getProperty("app_user");
        String password = prop.getProperty("app_password");

        HomePage page = new HomePage();
        SignInPage signInPage = page.clickSignInButton();
        AccountPage accountPage = signInPage.signIn(userName,password);

        assertTrue(accountPage.myAccountHeadingText.isDisplayed());
    }
}
