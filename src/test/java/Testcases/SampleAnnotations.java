package Testcases;

import Base.BaseTests;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SampleAnnotations extends BaseTests {


  @Test(priority = 1, enabled = true, groups = {"e2e", "sanity","integration"})
  public void Tc_add_numbers(){
      // get google search id
      WebElement scbox = driver.findElement(By.name("q"));
      scbox.clear();
      scbox.sendKeys("20 + 10");
      scbox.submit();

      // get result display in calculator
      WebElement getResult = driver.findElement(By.id("cwos"));
      Assert.assertEquals(getResult.getText(), "30");
      System.out.println("**** the Result is    " + getResult.getText());

  }

    @Test(priority = 2, groups = "sanity" , description ="multiplication")
    public void Tc_multiply_numbers(){
        // get google search id
        WebElement scbox = driver.findElement(By.name("q"));
        scbox.clear();
        scbox.sendKeys("20 * 10");
        scbox.submit();

        // get result display in calculator
        WebElement getResult = driver.findElement(By.id("cwos"));
        Assert.assertEquals(getResult.getText(), "200");
        System.out.println("**** Second TestCase  Result is    " + getResult.getText());

    }

    @Test(priority = 3, enabled = true, groups ={"sanity", "integration"})
    public void Tc_divide_numbers(){
        // get google search id
        WebElement scbox = driver.findElement(By.name("q"));
        scbox.clear();
        scbox.sendKeys("20 / 10");
        scbox.submit();

        // get result display in calculator
        WebElement getResult = driver.findElement(By.id("cwos"));
        Assert.assertEquals(getResult.getText(), "2");
        System.out.println("**** Third TestCase  Result is    " + getResult.getText());

    }

    @Test(priority = 4, groups = {"e2e", "integration"})
    public void Tc_subtract_numbers(){
        // get google search id
        WebElement scbox = driver.findElement(By.name("q"));
        scbox.clear();
        scbox.sendKeys("50 - 10");
        scbox.submit();

        // get result display in calculator
        WebElement getResult = driver.findElement(By.id("cwos"));
        Assert.assertEquals(getResult.getText(), "40");
        System.out.println("**** Forth TestCase  Result is    " + getResult.getText());

    }

}
