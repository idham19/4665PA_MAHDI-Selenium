package system.addign_new_address;

import base.Base;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import page_library.AccountPage;
import page_library.HomePage;
import page_library.MyAddressesPage;
import page_library.SignInPage;

import static org.testng.AssertJUnit.assertTrue;

public class TestAddNewAddress extends Base {


    @Test
    public void addingNewAddressTest() {
        HomePage homePage = new HomePage();
        String userName = prop.getProperty("app_user");
        String password = prop.getProperty("app_password");

        MyAddressesPage myAddressesPage = homePage
                .clickSignInButton()
                .signIn(userName, password)
                .clickMyAddresses();
        myAddressesPage.clickAddNewAddressButton();

        assertTrue("this h2 header should be displayed", myAddressesPage.yourAddressesHeader.isDisplayed());
    }
}
