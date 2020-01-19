package tests;

import base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import sun.jvm.hotspot.debugger.Page;
import utils.SeleniumUtils;

public class EmployeeDashboardPageTest extends TestBase {
    public EmployeeDashboardPageTest(){
        PageFactory.initElements(driver,this);
    }

    @FindBy(className = "page-title")
    public WebElement dashboardTitle;

    @FindBy(className = "page-title")
    public WebElement admin_Btn;

    @FindBy(className = "page-title")
    public WebElement announcement_Btn;

    @FindBy(className = "page-title")
    public WebElement news_Btn;


    public void navigateToViewsPage(){
        SeleniumUtils.click(admin_Btn);
        SeleniumUtils.click(announcement_Btn);
        SeleniumUtils.click(news_Btn);
    }



}
