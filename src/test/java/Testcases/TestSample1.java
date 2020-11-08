package Testcases;


import Base.BaseTests;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;



public class TestSample1  extends BaseTests {

    @BeforeMethod
    public void openSite(){
        driver.get(pageURL);
    }



    @Test
    public void TC_checkLogo(){
    WebElement logo = driver.findElement(By.className("logo"));
    Boolean logoDisplayed = logo.isDisplayed();
    Assert.assertTrue(logoDisplayed);
    System.out.println("*** Logo is visible ***");


    }



//    @BeforeMethod
//    public void closeSite(){
//        driver.close();
//    }

}
