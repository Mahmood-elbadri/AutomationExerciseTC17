package Tests;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.ProductPage;

public class ProductTest extends BaseTest{
    ProductPage product;
    String emptyPhrase;
    @BeforeClass
    public void setProduct(){
        product = new ProductPage(driver);
        emptyPhrase = "Cart is empty!";
    }
    @Test
    public void checkEmpty() throws InterruptedException {
        Assert.assertEquals(product.isEmpty(),true);
        System.out.println(product.isEmpty());
    }
}
