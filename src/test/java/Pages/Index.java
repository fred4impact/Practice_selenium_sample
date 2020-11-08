package Pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Index {

    WebDriver driver ;
    @FindBy(name="username")
    WebElement username;

    @FindBy(name="password")
    WebElement password;

    @FindBy(className = "login")
    WebElement loginBtn;

//    @FindBy(linkText = "Log in")
//    WebElement btnLogin;

    @FindBy(linkText = "Forgot login info?")
    WebElement forgotLoginTxt;

    @FindBy(linkText = "Register")
    WebElement registerTxt;

    @FindBy(linkText = "alert")
    WebElement link;

    public Index(WebDriver driver ){
        this.driver = driver ;
        PageFactory.initElements(driver, this );
    }



    public void Customerlogin(String uname, String pass){
       username.sendKeys(uname);
       password.sendKeys(pass);
    }


    public void  clickLogin(){
        loginBtn.click();
    }

    public void usingWaite(){
        WebDriverWait oWaite = new WebDriverWait(driver, 6);
//        oWaite.until(ExpectedConditions.invisibilityOf(
//                driver.findElement(alert)));
         oWaite.until(ExpectedConditions.alertIsPresent());
    }





}
