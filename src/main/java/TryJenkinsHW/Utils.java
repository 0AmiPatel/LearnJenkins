package TryJenkinsHW;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import org.apache.commons.io.FileUtils;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Utils extends BasePage {


        //Method to click any element
        public static void clickElement(By by){  // By is the class
            driver.findElement(by).click();         //driver will find element and click
        }

        //Method to Enter Value in Textbox
        public static void enterValue(By by,String text){
            driver.findElement(by).clear();
            driver.findElement(by).sendKeys(text);
        }

        //method to gettext
        public String getText(By by,String s){
            s= driver.findElement(by).getText();
            return s;
        }

        //Wait method for invisibilty of Element
        public static void waitForInVisibiltyOfElement(By by){
            WebDriverWait wait=new WebDriverWait(driver, 20);
            wait.until(ExpectedConditions.invisibilityOfElementLocated(by));
        }

        //Wait method for invisibilty of Element
        public static void waitForVisibiltyOfElement(By by){
            WebDriverWait wait=new WebDriverWait(driver, 20);
            wait.until(ExpectedConditions.visibilityOfElementLocated(by));
        }



        //Generates Date stamp - to generate diff email address each time
        public String randomDate() {
            DateFormat formatofdate = new SimpleDateFormat("ddMMyyHHmmss");
            return formatofdate.format(new Date());
        }

        public void resizeBrowser() {
            Dimension d = new Dimension(1600, 900);
            driver.manage().window().setSize(d);
        }

       //  Take a Screenshot
        public  void captureScreenshot(String ScreenshotName) {
            try {
                TakesScreenshot scrShot = (TakesScreenshot) driver;
                File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);
                FileUtils.copyFile(SrcFile, new File("Screenshots\\" + ScreenshotName + ".png"));
                System.out.println("Screenshot taken");

            }catch(IOException e ){
                System.out.println("Exception while taking screenshot" + e.getMessage());
            }
        }

    }

