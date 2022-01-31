import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNg {
    public String url = "https://www.google.com/";
    String driverpath = "driver/chromedriver.exe";
    public WebDriver driver;
    @BeforeTest
    public void launch(){
        System.out.println("launching chrome browser");
        System.setProperty("webdriver.chrome.driver",driverpath);
        driver = new ChromeDriver();
        driver.get(url);
    }
    @Test
    public void Title(){
        String expectedTitle = "Google";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(expectedTitle,actualTitle);
    }
    @AfterTest
    public void terminate(){
        driver.close();
    }
}
