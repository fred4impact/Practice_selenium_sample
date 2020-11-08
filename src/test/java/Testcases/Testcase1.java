package Testcases;

import Base.BaseTests;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class Testcase1 extends BaseTests {


    @BeforeMethod
    public void setUrl(){
        driver.get(pageURL);
    }

    @Test(priority = 2)
    public void getPageCurrentUrl(){
        System.out.println(driver.getCurrentUrl());
    }

    @Test(priority = 1)
    public void getPageTitle(){
        String expected = "Amazon.co.uk: Low Prices in Electronics, Books, Sports Equipment & more";
        Assert.assertEquals(driver.getTitle(),expected,"The Actual Page Title does not math expected");
        if(driver.getTitle().equals(expected)){
            Assert.assertTrue(true);
        }
        else {

             Assert.assertFalse(false);
        }

        logger.info("*** Run title test");

    }

    @Test(priority = 4)
    public void getLinksOnPage(){
        List<WebElement> pageLinks = driver.findElements(By.tagName("a"));
        int CountLinks = pageLinks.size();
        System.out.println("***** Number of links on amazon is : " + " " + CountLinks);
    }


    @Test(priority = 3)
    public void getImageCount(){
//        List<WebElement> listImages = driver.findElements(By.tagName("img"));
//        int imagesCount =  listImages.size();
//        System.out.println("The Number of Images on Amazon is : " + imagesCount);
    }



    @Test
    public void clickImage(){
//      WebElement img =  driver.findElement(By.xpath("//div[@id=\"1niVGo1k8TXk31_y5bOQKg\"]"));
//      img.click();
    }


}
