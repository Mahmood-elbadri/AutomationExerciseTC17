package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.openqa.selenium.support.ui.ExpectedConditions.elementToBeClickable;
import static org.openqa.selenium.support.ui.ExpectedConditions.presenceOfElementLocated;

public class HomePage {

    private final WebDriver driver;
    private final Actions actions;
    WebDriverWait wait; // 10 seconds timeout

    private final By pageLogo = By.xpath("//img[@alt='Website for automation practice']");
    private final By product = By.xpath("//a[@data-product-id='7']");
    private final By addToCart = By.linkText("Add to cart");
    private final By viewCart = By.xpath("//u[normalize-space()='View Cart']");
    public HomePage(WebDriver driver) {
        this.driver = driver;
        this.actions = new Actions(driver);
         wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public boolean isHomePageDisplayed() {
        return driver.findElement(pageLogo).isDisplayed();
    }

    public void selectProduct() throws InterruptedException {
        actions.moveToElement(driver.findElement(product)).perform(); // Perform the action
        Thread.sleep(2000);
        driver.findElement(addToCart).click();
        WebElement button = driver.findElement(viewCart);
        wait.until(presenceOfElementLocated(viewCart));
        button.click();
    }
}