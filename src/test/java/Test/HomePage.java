package Test;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePage extends BaseClass{
    String actualTitle;
    @Test
    public void verify(){
        actualTitle = driver.getTitle();
        //Assert.assertEquals(actualTitle,"OrangeHRM");

    }
    @Test
    public void logout(){
        //driver.findElement(By.partialLinkText("Welcome")).click();
        //driver.findElement(By.linkText("Logout")).click();
    }
}
