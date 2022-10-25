package system.addign_new_address;

import base.Base;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import page_library.HomePage;
import page_library.MyAddressesPage;
import page_library.SignInPage;

import static org.testng.AssertJUnit.assertTrue;

public class TestAddNewAddress extends Base {


    @Test
    public void addingNewAddressTest() {
        SignInPage signInPage = new SignInPage();
        HomePage homePage = new HomePage();
        MyAddressesPage myAddressesPage = new MyAddressesPage();

        homePage.clickSignInButton();

        String userName = prop.getProperty("app_user");
        String password = prop.getProperty("app_password");
        signInPage.signIn(userName, password);

        signInPage.clickMyAddresses();
        myAddressesPage.clickAddNewAddressButton();
        WebElement addressesHeader = myAddressesPage.yourAddressesHeader;

        assertTrue("this h2 header should be displayed", addressesHeader.isDisplayed());
    }
}
