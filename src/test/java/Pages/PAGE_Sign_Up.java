package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class PAGE_Sign_Up {
    static WebElement element = null;
    static WebElement Nationality;
    public static Select select_Nationality (WebDriver driver ) {
        Select Nationality = new Select(driver.findElement(By.cssSelector("#select2-ApplicantRegistrationViewModel_NationalityId-container")));
//	Select_Traveling_as.selectByIndex(1);
        return Nationality;
    }
}
