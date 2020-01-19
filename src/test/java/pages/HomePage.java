package pages;

import base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.SeleniumUtils;

public class HomePage extends TestBase {

    public HomePage(){
        PageFactory.initElements(driver, this); //get driver and connect with all webelements in this class and instantiate those
    }

    @FindBy(id="btnLogin")
    public WebElement logIn_Btn;

    public void navigateToHomePage(){
        SeleniumUtils.click();
    }


}
