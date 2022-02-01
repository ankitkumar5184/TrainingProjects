package Test;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Loginpage extends BaseClass {
    public static String uname,pass,message;

    @Test
    public void login() throws IOException {

        FileInputStream fis = new FileInputStream(path);
        XSSFWorkbook wb = new XSSFWorkbook(fis);
        XSSFSheet sheet =wb.getSheet("Login_Details");
        System.out.println(sheet.getLastRowNum());

        for(int i=1;i<=sheet.getLastRowNum();i++)
        {
            uname = sheet.getRow(i).getCell(0).getStringCellValue();
            driver.findElement(By.id("txtUsername")).sendKeys(uname);
            pass = sheet.getRow(i).getCell(1).getStringCellValue();
            driver.findElement(By.id("txtPassword")).sendKeys(pass);

            FileOutputStream df = new FileOutputStream(path);
            message = "Data imported Successfully";
            sheet.getRow(i).createCell(4).setCellValue(message);
            wb.write(df);
            df.close();
            driver.findElement(By.id("btnLogin")).click();

        }

    }
@Test
    public void forgetPass(){
        driver.findElement(By.id("forgotPasswordLink")).click();
        driver.navigate().back();

}
}
