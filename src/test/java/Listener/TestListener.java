package Listener;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListener implements ITestListener {

    @Override
    public void onTestStart(ITestResult result) {
        System.out.println("**** OnStart ***"  + result.getTestName());
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("**** OnStart ***"  + result.getTestName());
    }

    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println("**** On Failure ***"  + result.getTestName());
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        System.out.println("**** On Skipped ***"  + result.getTestName());
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        System.out.println("**** On Failed with success % ***"  + result.getTestName());
        System.out.println("**** On Failed with success % ***"  + result.getStatus());
    }

    @Override
    public void onStart(ITestContext context) {
//        System.out.println(" on Start Context *******"  + context.getFailedTests());
    }

    @Override
    public void onFinish(ITestContext context) {
//        System.out.println("***  OnFinished ******" +  context.getPassedTests());
    }



    /*
    *
    *   Steps on creating a listener class
    *  1: Create a package
    *  2: Create a class in the package
    *  3 :Implement the Itestlistener class in the class
    * 4: import all methods of the class implemented
    * 5: add @Listener annotations on the Tests class
    *
    * */
}
