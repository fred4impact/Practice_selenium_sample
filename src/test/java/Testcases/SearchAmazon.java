package Testcases;

import Base.BaseTests;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.*;


@Listeners(Listener.TestListener.class) // implementing test listener .
public class SearchAmazon extends BaseTests {

    @BeforeMethod
    public void setUrl(){
        driver.get(pageURL);
    }
    // search book, computers, bikes,

    @DataProvider(name = "dataSearch")
    public Object[][] createSearch(){

        return new Object[][]{
                {"Sport Bikes"},
//                {"username2", "password2", "email2"},
//                {"username3", "password3", "email3"}
        };
    }


    @Test(dataProvider = "dataSearch")
    public void AmazonSearchTest(String val1, String val2, String val3){
        String searcResult1 = val1;
        System.out.println(searcResult1);
        String searcResult2 = val2;
        System.out.println(searcResult2);
        String searcResult3 = val3;
        System.out.println(searcResult3);

    }

//     @Parameters("")
     @Test(dataProvider = "dataSearch")
     public void TC_Find( String search){
         WebElement seBox = driver.findElement(By.id("twotabsearchtextbox"));
         seBox.clear();
         seBox.sendKeys(search);
         seBox.submit();
    }

}
