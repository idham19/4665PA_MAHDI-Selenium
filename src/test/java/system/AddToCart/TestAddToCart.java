package system.AddToCart;

import base.Base;
import org.testng.annotations.Test;
import page_library.HomePage;
import page_library.ProductPage;

import static org.testng.AssertJUnit.assertTrue;

public class TestAddToCart extends Base {

    @Test
    public void addingItemsToCartTest() throws InterruptedException {
        HomePage homePage = new HomePage();
        String item = prop.getProperty("item_to_search");

        ProductPage productPage = homePage.searchItems(item);
        productPage.addingItemsToCart();

        assertTrue("this confirmation should appear after clicking add button", productPage.addCartConfirmation.isDisplayed());
    }

}
