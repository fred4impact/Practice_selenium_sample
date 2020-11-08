package Testcases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class sampleDataprovider {

   @DataProvider(name = "data")
   public  Object[][] myData(){

     return new Object[][]{
             {"Django Books", "Brown bag", ""} // searching for books
     };

    }

   @Test(dataProvider = "data")
   public  void searchTestCase( String result, String result2){
        String searchResult = result;
        String resultAnswer = result2;
        System.out.println("********* Result of data searched :" + searchResult );
        System.out.println("********* Result of data searched :" + resultAnswer );
    }


    @Test
    void testSample(){

    }
}





// Dataprovider
// parameterization/ parameter
// TestNG XML file

