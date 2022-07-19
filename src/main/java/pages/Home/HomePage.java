package pages.Home;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
<<<<<<< HEAD
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
=======
>>>>>>> 45cf3f318b4de694cc7ba8465edfcea2ac7496a6

public class HomePage {
    public static WebDriver driver;
    public HomePage(WebDriver driver) {
        HomePage.driver = driver;
    }

    By hrefForYou = By.xpath("//h2[contains(text(),'For You')]");
    By hrefDailyEdition = By.xpath("(//a[@class])[3]");
    By personalizeIcon = By.xpath("//header/div[1]/button[1]");
    By selectBtn = By.xpath("//body/div[1]/div[1]/div[1]/div[1]/div[2]/section[1]/div[2]/div[2]/div[1]/ul[1]/button[1]");
    By saveBtn = By.xpath("//button[contains(text(),'Save')]");
    By entertainmentImage = By.xpath("//h3[contains(text(),'Entertainment')]");

    public String forYou(){
<<<<<<< HEAD
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(hrefForYou));
=======
>>>>>>> 45cf3f318b4de694cc7ba8465edfcea2ac7496a6
        return driver.findElement(hrefForYou).getText();
    }
    public WebElement theDailyEdition (){
        return driver.findElement(hrefDailyEdition);
    }
    public WebElement personalizeForYou(){
        return driver.findElement(personalizeIcon);
    }
    public WebElement selectTopic(){
        return driver.findElement(selectBtn);
    }
    public WebElement Save(){
        return driver.findElement(saveBtn);
    }
    public WebElement entertainment(){
        return driver.findElement(entertainmentImage);
    }
    public static String getPageTitle() {
        return driver.getTitle();
    }
}
