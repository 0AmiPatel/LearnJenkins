package TryJenkinsHW;

import org.openqa.selenium.By;

public class HomePage extends Utils {

    public void navigateToElectronicsPage(){
        clickElement(By.linkText("Electronics"));

    }



    public void navigateToJwelleryPage(){

        clickElement(By.linkText("Jewelry"));
    }



}
