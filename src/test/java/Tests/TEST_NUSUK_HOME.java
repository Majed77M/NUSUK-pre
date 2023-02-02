package Tests;
import Pages.PAGE_NUSUK_HOME;
import Pages.PAGE_Sign_Up;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TEST_NUSUK_HOME{

    static WebDriver driver = null;

    public static void main(String[] args) {
        Navigate_to_HOME_PAGE();
        Click_on_Signup();
        select_nationality();
        quit();

    }
    public static void  Navigate_to_HOME_PAGE(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\MajedSultanAlotaibi\\Downloads\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://hajj.nusuk.sa/index");
        PAGE_NUSUK_HOME.Navigate_to_browser(driver);
    }
    public static void Click_on_Signup(){
        PAGE_NUSUK_HOME.Click_on_Sign_up(driver).click();
    }
    public static void select_nationality(){
        PAGE_Sign_Up.select_Nationality(driver).selectByIndex(2);
    }
    public static void quit(){
        driver.quit();
    }
}
