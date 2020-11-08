package Utilities;



import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

/*
   The purpose of this class is to
   read from config properties files
 */

public class ConfReader {

     // instantiate a props variable
     Properties props ;

    // constructor to load properties
    public ConfReader() {
        // import and create a file instance
        File file = new File("./configuration/config.properties");

        try{
            // create input stream instance
             FileInputStream input = new FileInputStream(file);
             props = new Properties();
             props.load(input);
         }catch (Exception e){
            System.out.println("Exception is " + e.getMessage());
         }


    }

    // the method will return the url set in properties file
    public String getBaseUrl(){
        String Url = props.getProperty("testUrl"); // reading from config file
        return Url;
    }

    public String getBrowser(String bw){
         String browser = props.getProperty("browser"); // read browser type from config file
         return browser;
    }

    public String getMessage(){
        String message = props.getProperty("message");
        return message;
    }
}
