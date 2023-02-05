package Tests;
import Pages.PAGE_NUSUK_HOME;
import Pages.PAGE_Sign_Up;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import Utility.Read_excel_file;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import static Tests.TEST_NUSUK_HOME.driver;

public class TEST_Sign_UP {

    static WebElement element = null;

    public static void Click_on_Select_nationality() throws InterruptedException {
        PAGE_Sign_Up.Click_on_select_Nationality(driver).click();
    }

    public static void Select_nationaltiy_from_dropdown() throws InterruptedException {
        Thread.sleep(1000);
        PAGE_Sign_Up.select_nationality_from_drop_down(driver);

    }

    public static void Click_on_select_country() throws InterruptedException {
        System.out.println("IS SELECT COUNTRY DISPLAYED ?");
        PAGE_Sign_Up.Click_on_select_country(driver).click();
    }

    public static void select_country_from_drop_down() throws InterruptedException {
        Thread.sleep(1000);
        PAGE_Sign_Up.Select_Country_from_drop_down(driver);
        Thread.sleep(1000);
    }

    public static void Enter_firstname() throws IOException {

       // PAGE_Sign_Up.Firstname(driver).sendKeys("MAJED");
        PAGE_Sign_Up.Firstname(driver).sendKeys(Read_excel_file.getFirstName());
    }

    public static void Enter_LastName() throws IOException {
        PAGE_Sign_Up.LastName(driver).sendKeys(Read_excel_file.getLastName());
    }

    public static void select_birhtdate() {
        PAGE_Sign_Up.select_birthdate(driver).click();
    }

    public static void PICK_BIRTHDATE() {
        PAGE_Sign_Up.PICK_BIRTHDATE(driver).sendKeys("");

    }

    public static void click_on_gender() throws InterruptedException {
        System.out.println("is CLICK on gender menu displayed"+PAGE_Sign_Up.Click_on_select_gender(driver).isDisplayed());
        Thread.sleep(1000);
        PAGE_Sign_Up.Click_on_select_gender(driver).click();
    }

    public static void select_from_gender() throws InterruptedException {
        PAGE_Sign_Up.Select_gender_from_drop_down(driver).click();
    }

    public static void Enter_mobile_number() {
        PAGE_Sign_Up.Enter_Mobile_NUMBER(driver).sendKeys("535352881");
    }
public static void Enter_email(){
    PAGE_Sign_Up.Enter_email(driver).sendKeys("majsalotaibi@gmail.com");
}
    public static void Enter_password(){
        PAGE_Sign_Up.Enter_password(driver).sendKeys("Abc@123456");
    }
    public static void Confirm_password() throws IOException {
        PAGE_Sign_Up.Confirm_password(driver).sendKeys("Abc@123456");
       Read_excel_file.readExcel("C:\\Users\\MajedSultanAlotaibi\\git\\NUSUK-pre\\src\\test\\java\\Utility\\Inputs.xlsx",
                "inputs","Sheet");
    }
    public static void Agree_terms_conidtions(){
        PAGE_Sign_Up.Agree_Terms_conditions(driver).click();
    }
    public static void Endorsement(){
        PAGE_Sign_Up.Endorsement(driver).click();
    }
    public static void CAPTACH() throws InterruptedException {
        PAGE_Sign_Up.CAPTACH(driver).click();
        Thread.sleep(2000);
    }
    public static void Click_on_register(){
        PAGE_Sign_Up.Clcik_on_register(driver).click();
    }
    public static String getFirstName() throws IOException {
         File file = new File("C:\\Users\\MajedSultanAlotaibi\\git\\NUSUK-pre\\src\\test\\java\\Utility\\Inputs.xlsx");
        FileInputStream fs = new FileInputStream(file);
        XSSFWorkbook workbook = new XSSFWorkbook(fs);
        XSSFSheet sheet = workbook.getSheetAt(0);
        Row row = sheet.getRow(0);
        Cell cell = row.getCell(0);
        return getFirstName();
    }
}