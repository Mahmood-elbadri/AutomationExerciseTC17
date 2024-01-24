package Tests;

import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.HomePage;

public class HomePageTest extends BaseTest{
    HomePage home;
    @BeforeClass
    public void setHome(){
        home = new HomePage(driver);
    }
    @Test
    public void isHomePageVisible(){
        Assert.assertTrue(home.isHomePageDisplayed());
    }
    @Test
    public void selectProduct() throws InterruptedException {
        home.selectProduct();
    }
}
