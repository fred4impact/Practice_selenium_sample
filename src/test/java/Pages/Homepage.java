package Pages;

import Base.BaseTests;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage extends BaseTests {

    private WebDriver driver;

//     @FindBy(linkText = "")
//     WebElement link;
//
//    @FindBy(className = "logo")
//    WebElement logo;

    @FindBy(xpath = "//*[@class=\"logo\"]") // relative xpath
     WebElement mainlogo;

  // Page Constructor
    public Homepage(){
        PageFactory.initElements(driver, this);
    }


}
