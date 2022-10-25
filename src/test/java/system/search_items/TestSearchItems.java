package system.search_items;

import base.Base;
import org.testng.annotations.Test;
import page_library.HomePage;

import static org.testng.AssertJUnit.assertEquals;

public class TestSearchItems extends Base {

    @Test
    public void searchItemsTest() {
        HomePage homePage = new HomePage();
        String item = prop.getProperty("item_to_search");
        homePage.searchItems(item);
        assertEquals(homePage.searchedItem.getText().toLowerCase().replace("\"",""),item.toLowerCase());
    }
}
