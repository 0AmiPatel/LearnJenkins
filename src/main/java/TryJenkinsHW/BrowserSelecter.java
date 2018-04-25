package TryJenkinsHW;

import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.concurrent.TimeUnit;

public class BrowserSelecter extends Utils {
      //  String browser="IE";

    public void selectBrowser() {
       String browser=System.getProperty("browser");
        if (browser.equalsIgnoreCase("chrome")) {
            //Google chrome
            System.setProperty("webdriver.chrome.driver", "src\\Resources\\Drivers\\chromedriver.exe");
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        } else if (browser.equalsIgnoreCase("IE")) {
            //  Internet explorer
            System.setProperty("webdriver.ie.driver", "D:\\AMI\\testing\\TRIAL\\src\\Resources\\Drivers\\IEDriverServer.exe");
            driver = new InternetExplorerDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);


        } else if (browser.equalsIgnoreCase("firefox")) {
             //  Firefox
             System.setProperty("webdriver.gecko.driver", "src\\Resources\\Drivers\\geckodriver.exe");
             driver = new FirefoxDriver();
             resizeBrowser();
             driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        }

    }
}