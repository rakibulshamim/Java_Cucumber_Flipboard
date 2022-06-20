package pages.Download;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

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
    public WebElement availableOniOS() throws InterruptedException {
        Thread.sleep(5000);
        return driver.findElement(hrefIOS);
    }
    public WebElement availableOnAndroid(){
        return driver.findElement(hrefAndroid);
    }
    public static String getPageTitle() {
        return driver.getTitle();
    }
}
