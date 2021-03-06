package pages.Signup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SignupPage {
    public static WebDriver driver;
    public SignupPage(WebDriver driver) {
        SignupPage.driver = driver;
    }

    By signupBtn = By.xpath("//header/nav[1]/ul[1]/li[3]/div[1]/a[1]");
    By email = By.name("email");
    By fullName = By.name("realName");
    By password = By.name("password");
    By continueBtn = By.xpath("//button[@type='submit']");

    public WebElement signup(){
        return driver.findElement(signupBtn);
    }
    public void setEmail(String Email){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(email));
        driver.findElement(email).sendKeys(Email);
    }
    public void setFullName(String FullName){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(fullName));
        driver.findElement(fullName).sendKeys(FullName);
    }
    public void setPassword(String Password){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(password));
        driver.findElement(password).sendKeys(Password);
    }
    public WebElement setSignup() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(continueBtn));
        return driver.findElement(continueBtn);
    }
    public static String getPageTitle() {
        return driver.getTitle();
    }
}

