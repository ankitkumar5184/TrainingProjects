package Groups;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class GroupDemo {
    String path;
    WebDriver driver;
    @BeforeSuite
    public void launch(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/");

    }
    @Test(groups = {"Smoke"})
    public void login(){
        System.out.println("Login Demo");
    }
    @Test(groups = "Sanity")
    public void logout(){
        System.out.println("Logout");
    }
    @AfterSuite(groups = {"Sanity"})
    public void Close_Browser(){
        driver.close();
    }
}
