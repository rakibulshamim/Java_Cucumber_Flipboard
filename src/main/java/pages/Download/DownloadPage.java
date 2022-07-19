package pages.Download;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
<<<<<<< HEAD
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
=======
>>>>>>> 45cf3f318b4de694cc7ba8465edfcea2ac7496a6

public class DownloadPage {
    public static WebDriver driver;
    public DownloadPage(WebDriver driver) {
        DownloadPage.driver = driver;
    }

    By hrefTools = By.xpath("//a[contains(text(),'Tools')]");
    By hrefIOS = By.xpath("//li[@id='menu-item-18257']");
    By hrefAndroid = By.xpath("//li[@id='menu-item-18250']");

    public WebElement tools(){
        return driver.findElement(hrefTools);
    }
<<<<<<< HEAD
    public WebElement availableOniOS() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(hrefIOS));
        return driver.findElement(hrefIOS);
    }
    public WebElement availableOnAndroid(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(hrefAndroid));
=======
    public WebElement availableOniOS() throws InterruptedException {
        Thread.sleep(5000);
        return driver.findElement(hrefIOS);
    }
    public WebElement availableOnAndroid(){
>>>>>>> 45cf3f318b4de694cc7ba8465edfcea2ac7496a6
        return driver.findElement(hrefAndroid);
    }
    public static String getPageTitle() {
        return driver.getTitle();
    }
}
