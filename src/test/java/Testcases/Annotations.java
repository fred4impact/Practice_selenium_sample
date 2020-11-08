package Testcases;


import org.testng.annotations.*;

public class Annotations {


    @BeforeSuite
    public void beforeSuite(){
        System.out.println(" get configuration files");
    }

    @BeforeTest(alwaysRun = true)
    public void beforeTest(){
        System.out.println(" set driver ");
    }

    @BeforeGroups
    public void beforeGroup(){
        System.out.println("  collate data");
    }

    @BeforeClass
    public void beforeClass(){
        System.out.println("  open application ");
    }
    @BeforeMethod
    public void beforeMethod(){
        System.out.println("  setUp");
    }

     // condition for testing
    @Test
    public void TestCASE1(){
        System.out.println(" condition for testing ");
    }
    // condition for testing

    @Test
    public void TestCASE2(){
        System.out.println(" condition for testing ");
    }

    // after testing the conditions
    @AfterSuite
    public void afterSuite(){
        System.out.println(" delete config ");
    }

    @AfterTest
    public void afterTest(){
        System.out.println(" tear down");
    }
     @AfterGroups
    public void afterGroup(){
        System.out.println(" dispose data");
    }

    @AfterClass
    public void afterClass(){
        System.out.println(" close application");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println(" tearDwon");
    }




























}
