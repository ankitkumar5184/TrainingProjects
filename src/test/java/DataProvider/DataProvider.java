package DataProvider;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import java.io.FileInputStream;
import java.io.IOException;

public class DataProvider {
    static String path;
    static WebDriver driver;
    FileInputStream fis;
    HSSFWorkbook wb;
    HSSFSheet sheet;
    @org.testng.annotations.DataProvider(name="login_details")
    public Object[][] Data() throws IOException {

        path = System.getProperty("user.dir")+"//Excel_Sheet//datasheet.xls";
        System.out.println(path);

        //Step-1 Give path in File Input stream class from where you want to run
        fis = new FileInputStream(path);

        //Step-2 Move to workbook
        wb = new HSSFWorkbook(fis);

        //Step-3 Move to specific sheet
        sheet =wb.getSheetAt(0);
        int num = sheet.getLastRowNum();
        Object[][] arr= new Object[num][2];
        System.out.println(num);
        int ci=0;
        for(int i=1;i<=num;i++,ci++) {
            String uname=sheet.getRow(i).getCell(0).getStringCellValue();
            String pass=sheet.getRow(i).getCell(1).getStringCellValue();
            arr[ci][0]=uname;
            arr[ci][1]=pass;
        }
        return arr;
    }

    @Test(dataProvider = "login_details")
    public void signIn(String uname, String pass) {
        System.out.println(uname+"\t"+pass);

    }
}

