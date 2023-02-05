package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PAGE_NUSUK_HOME {
    static WebElement element = null;
    public static WebElement Navigate_to_browser(WebDriver driver){
         driver.navigate().to("https://hajj.nusuk.sa/index");
       return  element;
    }
    public static WebElement Click_on_Sign_up(WebDriver driver){
       element = driver.findElement(By.xpath("//a[contains(text(),'إنشاء حساب')]"));
        return element;
    }
}
