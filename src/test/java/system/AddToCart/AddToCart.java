package system.AddToCart;

import base.Base;
import org.testng.annotations.Test;
import page_library.HomePage;
import page_library.SearchingPage;

import java.util.concurrent.TimeUnit;

import static org.testng.AssertJUnit.assertTrue;

public class AddToCart extends Base {

    @Test
    public void addingItemsToCartTest() throws InterruptedException {
        HomePage homePage = new HomePage();
        SearchingPage searchingPage =new SearchingPage();
        String item = "dress";
        homePage.searchItems(item);
        searchingPage.addingItemsToCart();
        assertTrue("this confirmation should appear after clicking add button",searchingPage.addCartConfirmation.isDisplayed());
    }

}
