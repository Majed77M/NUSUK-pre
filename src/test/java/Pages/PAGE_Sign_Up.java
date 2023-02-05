package Pages;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.bouncycastle.math.raw.Nat;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class PAGE_Sign_Up {
    static WebElement element = null;
  // static WebElement click_on_day_month_year;
    static Select Nationality;
    public static WebElement Click_on_select_Nationality (WebDriver driver ) throws InterruptedException {
        WebElement Nationality= driver.findElement(By.tagName("b"));
        Thread.sleep(1000);

    // Select Nationality = new Select(driver.findElement(By.id("select2-ApplicantRegistrationViewModel_NationalityId-container")));
      //  System.out.println(Nationality.isMultiple());
     return Nationality;
    }
    public static void select_nationality_from_drop_down(WebDriver driver){
        WebElement Nationality= driver.findElement(By.tagName("b"));
       WebElement ACTIVE_MENU = driver.switchTo().activeElement();
        System.out.println( "The list displayed value is"+Nationality.isDisplayed());
          ACTIVE_MENU.sendKeys(Keys.ARROW_DOWN);
       ACTIVE_MENU.sendKeys(Keys.ENTER);
       ACTIVE_MENU.sendKeys(Keys.SHIFT);
        return ;
    }
    public static WebElement Click_on_select_country (WebDriver driver ) throws InterruptedException {
        WebElement select_country= driver.findElement(By.xpath("//body/main[1]/div[1]/form[1]/div[2]/div[2]/span[2]/span[1]/span[1]/span[2]/b[1]"));
        Thread.sleep(1000);

        // Select Nationality = new Select(driver.findElement(By.id("select2-ApplicantRegistrationViewModel_NationalityId-container")));
        //  System.out.println(Nationality.isMultiple());
        return select_country;
    }
    public static void Select_Country_from_drop_down(WebDriver driver) {
        WebElement select_country= driver.findElement(By.xpath("//span[@id='select2-ApplicantRegistrationViewModel_CountryResidenceId-container']"));
        WebElement ACTIVE_COUNTRY_MENU= driver.switchTo().activeElement();
        System.out.println("The country list is displayed value is "+select_country.isDisplayed());
        ACTIVE_COUNTRY_MENU.sendKeys(Keys.ARROW_DOWN);
        ACTIVE_COUNTRY_MENU.sendKeys(Keys.ENTER);
        return ;
    }
public static WebElement Firstname(WebDriver driver){
    element = driver.findElement(By.cssSelector("#ApplicantRegistrationViewModel_FirstNameEn"));
    return element;
}
    public static WebElement LastName(WebDriver driver){
        element = driver.findElement(By.cssSelector("#ApplicantRegistrationViewModel_LastNameEn"));
        return element;
    }
    public static WebElement select_birthdate(WebDriver driver){
        element = driver.findElement(By.xpath("//tbody/tr[1]/td[4]"));
        return element;
    }
    public static WebElement PICK_BIRTHDATE(WebDriver driver){
        element = driver.findElement(By.xpath("//input[@id='ApplicantRegistrationViewModel_BirthDate']"));
        element.sendKeys("");
        return element;
    }
    public static WebElement Click_on_select_gender(WebDriver driver) throws InterruptedException {//body/main[1]/div[1]/form[1]/div[5]/div[2]/div[1]/span[2]/span[1]/span[1]/span[2]
        WebElement Click_on_select_gender= driver.findElement(By.xpath("//span[@id='select2-ApplicantRegistrationViewModel_GenderId-container']"));
        System.out.println("is select gender displayed "+Click_on_select_gender.isDisplayed());
        Thread.sleep(1000);
        return Click_on_select_gender;
    }
    public static WebElement Select_gender_from_drop_down(WebDriver driver) throws InterruptedException {
            WebElement element= driver.findElement(By.xpath("//span[@id='select2-ApplicantRegistrationViewModel_GenderId-container']"));
        System.out.println("The GENDER list  displayed value is "+element.isDisplayed());
           WebElement ACTIVE_COUNTRY_MENU= driver.switchTo().activeElement();
            Thread.sleep(1000);
         ACTIVE_COUNTRY_MENU.sendKeys(Keys.ARROW_DOWN);
        ACTIVE_COUNTRY_MENU.sendKeys(Keys.ARROW_DOWN);
         ACTIVE_COUNTRY_MENU.sendKeys(Keys.ENTER);
        ACTIVE_COUNTRY_MENU.sendKeys(Keys.ENTER);
return element;
        }
        public static WebElement Enter_Mobile_NUMBER(WebDriver driver){
        WebElement element = driver.findElement(By.xpath("//input[@id='ApplicantRegistrationViewModel_MobileNumber']"));
        return element;
        }
        public static WebElement Enter_email(WebDriver driver){
        WebElement element = driver.findElement(By.xpath("//input[@id='ApplicantRegistrationViewModel_Email']"));
      return element;
        }
        public static WebElement Enter_password(WebDriver driver) {
            WebElement element = driver.findElement(By.xpath("//input[@id='ApplicantRegistrationViewModel_Password']"));
            return element;
        }

    public static WebElement Confirm_password(WebDriver driver) {
        WebElement element = driver.findElement(By.xpath("//input[@id='ApplicantRegistrationViewModel_PasswordConfirmation']"));
        return element;
    }
    public static WebElement Agree_Terms_conditions(WebDriver driver) {
        WebElement element = driver.findElement(By.xpath("//input[@id='ApplicantRegistrationViewModel_PrivacyAgree']"));
        return element;
    }
    public static WebElement Endorsement(WebDriver driver) {
        WebElement element = driver.findElement(By.xpath("//input[@id='ApplicantRegistrationViewModel_EndorsementAgree']"));
        return element;
    }
    public static WebElement CAPTACH(WebDriver driver){
        WebElement element = driver.findElement(By.xpath("//div[@id='recaptcha']"));
        return element;
    }
    public static WebElement Clcik_on_register(WebDriver driver){
        WebElement element = driver.findElement(By.xpath("//input[@id='frmRegisteration']"));
        return element;
    }
    public static  String getFirstName() throws IOException {
         File file = new File("C:\\Users\\MajedSultanAlotaibi\\git\\NUSUK-pre\\src\\test\\java\\Utility\\Inputs.xlsx");
        String getFirstName = null;
        FileInputStream fs = new FileInputStream(file);
        XSSFWorkbook workbook = new XSSFWorkbook(fs);
        XSSFSheet sheet = workbook.getSheetAt(0);
        Row row = sheet.getRow(0);
        Cell cell = row.getCell(0);
        getFirstName = String.valueOf(sheet.getRow(0).getCell(0));
        return getFirstName();
    }
    }

