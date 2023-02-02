package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PAGE_NUSUK_HOME {
    public static void Navigate_to_browser(WebDriver driver){
       driver.navigate().to("https://hajj.nusuk.sa/index");
    }
    public static WebElement Click_on_Sign_up(WebDriver driver){
      WebElement element =  driver.findElement(By.xpath("//a[contains(text(),'إنشاء حساب')]"));
      element.click();
        return element;
    }
}
