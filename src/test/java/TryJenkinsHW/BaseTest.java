package TryJenkinsHW;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;



public class BaseTest extends Utils {

    BrowserSelecter browserSelecter = new BrowserSelecter();

    //Select from all browsers

    @BeforeMethod
    public void selectBrowser() {
        browserSelecter.selectBrowser();
     //   driver.manage().deleteAllCookies();
        driver.get("http://demo.nopcommerce.com/");
        System.out.println("superduper");

    }

    @AfterMethod
    public void closeBrowser(ITestResult result){
        if(ITestResult.FAILURE==result.getStatus()){
            captureScreenshot(result.getName()+randomDate());

        }
      //  driver.quit();
    }

}
