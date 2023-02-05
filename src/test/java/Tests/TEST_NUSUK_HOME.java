package Tests;
import Pages.PAGE_NUSUK_HOME;
import Pages.PAGE_Sign_Up;
import com.aventstack.extentreports.ExtentReports;
import org.apache.commons.io.FileUtils;
import org.apache.commons.mail.*;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.internet.MimeMessage;
import java.io.File;
import java.io.IOException;
import java.util.Properties;

public class TEST_NUSUK_HOME{

    static WebDriver driver;

 /*   public static void main(String[] args) throws InterruptedException {
        Navigate_to_HOME_PAGE();
        Click_on_Signup();
        Enter_fristname();
        System.out.println("Entered firstname");
     select_nationality();
        selectNationality_from_dropdown();
        selecCountry();
        select_country_from_drop_down();
        Enter_lastname();
        Thread.sleep(5000);
       // click_birthdate();
        PICK_BIRTHDATE();
        select_birhtdate();
        Thread.sleep(3000);
        click_on_gender();
        Thread.sleep(3000);
        select_from_gender();
        Thread.sleep(3000);
        Enter_password();
        Thread.sleep(3000);
        Confirm_password();
        Thread.sleep(3000);
        Enter_mobile_number();
        Thread.sleep(3000);
        Enter_email();
        Thread.sleep(3000);
        System.out.println("SELECTED COUNTRY");
        System.out.println("selected NATIONALITY");
        Agree_terms_conditions();
        Thread.sleep(3000);
        Endorsement();
        Thread.sleep(3000);
        CAPTACH();
        Thread.sleep(3000);
      quit();
    }*/
    @Test(priority = 1)
    public static void  Navigate_to_HOME_PAGE() throws Exception {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\MajedSultanAlotaibi\\Downloads\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://hajj.nusuk.sa/index");
        driver.findElement(By.xpath("//header/nav[1]/div[1]/div[1]/div[1]/ul[1]/li[6]/a[1]")).click();
        driver.findElement(By.xpath("//a[contains(text(),'العربية')]")).click();
        driver.manage().window().maximize();
        PAGE_NUSUK_HOME.Navigate_to_browser(driver);
        takeSnapShot(driver, "C:\\Users\\MajedSultanAlotaibi\\OneDrive - SAUDI COMPANY FOR VISA AND TRAVEL SOLUTIONS\\Desktop\\Selenium\\screenshots\\navigate to home screen.png") ;
        System.out.println("Taken screenshot");
    }
   @Test(priority = 2)
    public static void Click_on_Signup() throws Exception {
        PAGE_NUSUK_HOME.Click_on_Sign_up(driver).click();
       takeSnapShot(driver, "C:\\Users\\MajedSultanAlotaibi\\OneDrive - SAUDI COMPANY FOR VISA AND TRAVEL SOLUTIONS\\Desktop\\Selenium\\screenshots\\click_on sign up.png") ;
    }
    @Test (priority = 3)
    public static void select_nationality() throws Exception {
       TEST_Sign_UP.Click_on_Select_nationality();
        takeSnapShot(driver, "C:\\Users\\MajedSultanAlotaibi\\OneDrive - SAUDI COMPANY FOR VISA AND TRAVEL SOLUTIONS\\Desktop\\Selenium\\screenshots\\select nationality.png") ;
}
    @Test (priority = 4)
public static void selectNationality_from_dropdown() throws Exception {
        TEST_Sign_UP.Select_nationaltiy_from_dropdown();
        takeSnapShot(driver, "C:\\Users\\MajedSultanAlotaibi\\OneDrive - SAUDI COMPANY FOR VISA AND TRAVEL SOLUTIONS\\Desktop\\Selenium\\screenshots\\select nationality from dropdown.png") ;
        System.out.println("Taken screenshot");
    }
    @Test (priority = 5)
public static void selecCountry() throws Exception {
        TEST_Sign_UP.Click_on_select_country();
        takeSnapShot(driver, "C:\\Users\\MajedSultanAlotaibi\\OneDrive - SAUDI COMPANY FOR VISA AND TRAVEL SOLUTIONS\\Desktop\\Selenium\\screenshots\\select country.png") ;

    }
    @Test (priority = 6)
public static void select_country_from_drop_down() throws Exception {
        TEST_Sign_UP.select_country_from_drop_down();
        takeSnapShot(driver, "C:\\Users\\MajedSultanAlotaibi\\OneDrive - SAUDI COMPANY FOR VISA AND TRAVEL SOLUTIONS\\Desktop\\Selenium\\screenshots\\select country from dropdown.png") ;

    }
    @Test (priority = 7)
    public static void Enter_fristname() throws Exception {
        TEST_Sign_UP.Enter_firstname();
        takeSnapShot(driver, "C:\\Users\\MajedSultanAlotaibi\\OneDrive - SAUDI COMPANY FOR VISA AND TRAVEL SOLUTIONS\\Desktop\\Selenium\\screenshots\\Enter_first_name.png") ;

    }
    @Test (priority = 8 )
    public static void Enter_lastname() throws Exception {
        TEST_Sign_UP.Enter_LastName();
        takeSnapShot(driver, "C:\\Users\\MajedSultanAlotaibi\\OneDrive - SAUDI COMPANY FOR VISA AND TRAVEL SOLUTIONS\\Desktop\\Selenium\\screenshots\\enter last name.png") ;

    }
    @Test (priority = 10)
    public static void select_birhtdate() throws Exception {
        TEST_Sign_UP.select_birhtdate();
        takeSnapShot(driver, "C:\\Users\\MajedSultanAlotaibi\\OneDrive - SAUDI COMPANY FOR VISA AND TRAVEL SOLUTIONS\\Desktop\\Selenium\\screenshots\\select birth date.png") ;

    }
    @Test (priority = 9)
    public static void PICK_BIRTHDATE() throws Exception {
        TEST_Sign_UP.PICK_BIRTHDATE();
        takeSnapShot(driver, "C:\\Users\\MajedSultanAlotaibi\\OneDrive - SAUDI COMPANY FOR VISA AND TRAVEL SOLUTIONS\\Desktop\\Selenium\\screenshots\\PICK_BIRTHDATE.png") ;

    }
    @Test (priority = 11)
    public static void click_on_gender() throws InterruptedException {
        TEST_Sign_UP.click_on_gender();
    }
    @Test (priority = 12)
    public static void select_from_gender() throws InterruptedException {
        TEST_Sign_UP.select_from_gender();
    }
    @Test (priority = 13)
    public static void Enter_mobile_number(){
        TEST_Sign_UP.Enter_mobile_number();
    }
    @Test (priority = 14)
    public static void Enter_email(){
        TEST_Sign_UP.Enter_email();
    }
    @Test (priority = 15)
    public static void Enter_password(){
        TEST_Sign_UP.Enter_password();
    }
    @Test (priority = 16)
    public static void Confirm_password() throws IOException {
        TEST_Sign_UP.Confirm_password();
    }
    @Test (priority = 17)
    public static void Agree_terms_conditions() throws Exception {
        TEST_Sign_UP.Agree_terms_conidtions();
        takeSnapShot(driver, "C:\\Users\\MajedSultanAlotaibi\\OneDrive - SAUDI COMPANY FOR VISA AND TRAVEL SOLUTIONS\\Desktop\\Selenium\\screenshots\\Agree_terms_conditions.png") ;
        ;
    }
    @Test (priority = 18)
    public static void Endorsement() throws Exception {
        TEST_Sign_UP.Endorsement();
        takeSnapShot(driver, "C:\\Users\\MajedSultanAlotaibi\\OneDrive - SAUDI COMPANY FOR VISA AND TRAVEL SOLUTIONS\\Desktop\\Selenium\\screenshots\\Endorsement.png") ;
    }
    @Test (priority = 19)
    public static void click_on_register() throws InterruptedException {
        TEST_Sign_UP.Click_on_register();
        Thread.sleep(1000);
    }
    @Ignore
    public static void CAPTACH() throws Exception {
        TEST_Sign_UP.CAPTACH();
        takeSnapShot(driver, "C:\\Users\\MajedSultanAlotaibi\\OneDrive - SAUDI COMPANY FOR VISA AND TRAVEL SOLUTIONS\\Desktop\\Selenium\\screenshots\\Captcah.png") ;
        Thread.sleep(10000);

    }

   // @Test (priority = 21)
    //public static void quit(){
      //  driver.quit();
    //}
    public static void takeSnapShot(WebDriver webdriver,String fileWithPath) throws Exception{

        //Convert web driver object to TakeScreenshot

        TakesScreenshot scrShot =((TakesScreenshot)webdriver);

        //Call getScreenshotAs method to create image file

        File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);

        //Move image file to new destination

        File DestFile=new File(fileWithPath);

        //Copy file at destination

        FileUtils.copyFile(SrcFile, DestFile);
    }
    @Ignore
    public static void Click_on_register() throws InterruptedException {
        TEST_Sign_UP.Click_on_register();
        Thread.sleep(2500);
    }
  //  @Test (priority = 20) //bnptjojqqfzourbq
   //public static void send_email() throws EmailException {
     //  new GMailer().se
    //}
      //  Properties prop = new Properties();
      //  prop.setProperty("PORT","587");
      //  email.setHostName("smtp.googlemail.com");
        //email.setSmtpPort(587);
        //email.setAuthenticator(new DefaultAuthenticator("mso.fbi@gmail.com", "bnptjojqqfzourbq"));
        //email.setSSLOnConnect(true);
        //email.setFrom("user@gmail.com");
        //email.setSubject("TestMail");
        //email.setMsg("This is a test mail ... :-)");
        //email.addTo("foo@bar.com");
        //email.send();
    @Test (priority = 20)
    public static void Send() throws EmailException {
        System.out.println("before report sending");
        EmailAttachment attachment = new EmailAttachment();
        attachment.setPath("C:\\Users\\MajedSultanAlotaibi\\OneDrive - SAUDI COMPANY FOR VISA AND TRAVEL SOLUTIONS\\Desktop\\Selenium\\emailable-report.html");
        attachment.setDisposition(EmailAttachment.ATTACHMENT);
        attachment.setDescription("Report QA automation report");
        attachment.setName("Report QA");
        MultiPartEmail email1 = new MultiPartEmail();
        Email email = new SimpleEmail();
        email1.setHostName("smtp.gmail.com");
        email1.setSmtpPort(587);
        email1.setAuthenticator(new DefaultAuthenticator("mso.fbi@gmail.com", "elljetatqnpowxqk"));
        email1.setSSLOnConnect(true);
        email1.setFrom("mso.fbi@gmail.com");
        email1.setSubject("Test Automation report");
        email1.setMsg("Sending email through selenium");
        email1.addTo("majsalotaibi@gmail.com");
        email1.attach(attachment);
        email1.send();
        System.out.println("Report sent");
    }

    }



