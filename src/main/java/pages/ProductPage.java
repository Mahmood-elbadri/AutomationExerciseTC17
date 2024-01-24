package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductPage {
    private WebDriver driver;
    private final By xBtn = By.xpath("(//i[@class='fa fa-times'])[1]");
    private final By cardEmpty = By.xpath("//b[normalize-space()='Cart is empty!']");
    public ProductPage(WebDriver driver){
        this.driver = driver;
    }
    public boolean isEmpty() throws InterruptedException {
        driver.findElement(xBtn).click();
        //just to see the flow
        Thread.sleep(2000);
        WebElement emptyPhrase = driver.findElement(cardEmpty);
        return (emptyPhrase.isDisplayed());
    }
}
