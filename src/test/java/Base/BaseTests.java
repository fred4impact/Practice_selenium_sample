package Base;


import Utilities.ConfReader;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import java.util.concurrent.TimeUnit;

public class BaseTests {

    public static ConfReader readFile = new ConfReader();
     //create the variable of the config reader.

    public WebDriver driver;
    public static String pageURL = readFile.getBaseUrl();// get url from config file
    public static Logger logger = Logger.getLogger(BaseTests.class); // or you specify name of teh project

   @Parameters("browser")
   @BeforeClass
   public void setUp(String br){

     if (br.equals("chrome")) { // lunching chrome browser
         WebDriverManager.chromedriver().setup();
         driver = new ChromeDriver();

     }else if (br.equals("firefox")){// lunching firefox browser
         WebDriverManager.firefoxdriver().setup();
         driver = new FirefoxDriver();
     }

         driver.manage().window().maximize();
         driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);

       PropertyConfigurator.configure("log4j.properties");
       logger.debug("Log4j appender configuration is successful !!");

       driver.get(pageURL);
   }



    @AfterClass
     public void tearDown(){
         if (driver != null) {
             driver.quit();
         }
         logger.info("**** App Quit ***");
   }


}
