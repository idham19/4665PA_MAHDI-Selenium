package page_library;

import base.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountPage extends Base {

@FindBy(xpath = "//h1[@class='page-heading']")
public  WebElement myAccountHeadingText;

    public AccountPage() {
        PageFactory.initElements(driver, this);
    }
}
