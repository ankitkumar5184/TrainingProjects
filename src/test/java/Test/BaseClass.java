package Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class BaseClass {
   public static WebDriver driver;
   public static String path;
@BeforeSuite
    public void launch_browser() throws IOException {

    WebDriverManager.chromedriver().setup();
    driver = new ChromeDriver();
    driver.get("https://opensource-demo.orangehrmlive.com/index.php");




}
@AfterSuite
public void close_Browser(){
    driver.close();
}
}
