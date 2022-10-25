package page_library;

import base.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends Base {
    @FindBy(id = "search_query_top")
    public WebElement searchInput;
    @FindBy(xpath = "//span[@class='lighter']")
    public WebElement searchedItem;
    @FindBy(xpath = "//button[@class='btn btn-default button-search']")
    public WebElement searchButton;
    @FindBy(xpath = "//a[@class='login']")
    public WebElement signInButton;


    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    public SignInPage clickSignInButton() {
        clickElement(signInButton);
        return new SignInPage();
    }

    public void setSearchInput(String item) {
        sendKeysToElements(searchInput, item);
    }

    public void clickSearchButton() {
        clickElement(searchButton);
    }

    public ProductPage searchItems(String items) {
        setSearchInput(items);
        clickSearchButton();
        return new ProductPage();
    }

}
