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
        HomePage page =new HomePage();
        SignInPage signInPage = new SignInPage();
        AccountPage accountPage= new AccountPage();
        String userName= prop.getProperty("app_user");
        String password = prop.getProperty("app_password");
        page.clickSignInButton();
        signInPage.signIn(userName,password);
        assertTrue(accountPage.myAccountHeadingText.isDisplayed());
    }
}
