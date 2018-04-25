
package TryJenkinsHW;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSuite extends BaseTest {
    HomePage homePage = new HomePage();

    @Test
        public void userShouldBeAbleToOpenTheHomePage(){
        Assert.assertEquals(driver.getCurrentUrl(),"http://demo.nopcommerce.com/");
System.out.println("one line added to github");
    }

    @Test
        public void userShouldBeAbleToNavigateOnElectronicsCategoryPage(){
         homePage.navigateToElectronicsPage();
         Assert.assertEquals(driver.getCurrentUrl(),"http://demo.nopcommerce.com/electronics");

    }

    @Test
        public void userShouldBeAbleToNavigateOnJwelleryCategoryPage(){
        homePage.navigateToJwelleryPage();
        Assert.assertEquals(driver.getCurrentUrl(),"http://demo.nopcommerce.com/jewelry");
    }


}
