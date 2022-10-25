package page_library;

import base.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddingToCartPage extends Base {
    @FindBy(id = "color_13")
    public WebElement orangeColor;
    @FindBy(id = "bigpic")
    public WebElement orangeDress;

    public AddingToCartPage() {
        PageFactory.initElements(driver, this);
    }

    public void changeColor(WebElement color){
        clickElement(color);
    }

}
