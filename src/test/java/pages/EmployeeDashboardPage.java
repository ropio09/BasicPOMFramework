package pages;

import base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EmployeeDashboardPage extends TestBase {
    public EmployeeDashboardPage(){
        PageFactory.initElements(driver, this);
    }

    @FindBy (className = "page-title")
    public WebElement dashBoardTitle;

}
