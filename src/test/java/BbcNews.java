import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class BbcNews {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        String url = "https://www.bbc.com/news/";
        driver.get(url);
        System.out.println(driver.getTitle());

        List<WebElement> link = driver.findElements(By.tagName("a"));
        System.out.println(link.size());
        for (int i = 0; i < link.size(); i++) {
            String li = link.get(i).getText();


            System.out.println(li);
        }
        driver.close();
    }
}
