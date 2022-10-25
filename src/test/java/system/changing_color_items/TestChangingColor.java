package system.changing_color_items;

import base.Base;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import page_library.AddingToCartPage;
import page_library.HomePage;
import page_library.SearchingPage;

import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertTrue;

public class TestChangingColor extends Base {

    @Test
    public void changeColorTest() {
        HomePage homePage = new HomePage();
        SearchingPage searchingPage =new SearchingPage();
        AddingToCartPage addingToCartPage=new AddingToCartPage();
        String item = prop.getProperty("item_to_search");
        homePage.searchItems(item);
        searchingPage.clickItem();
        WebElement orangeColor= addingToCartPage.orangeColor;
        WebElement orangeDress= addingToCartPage.orangeDress;
        addingToCartPage.changeColor(orangeColor);
        assertTrue("the dress should be  displayed in orange",orangeDress.isDisplayed());

    }
}
