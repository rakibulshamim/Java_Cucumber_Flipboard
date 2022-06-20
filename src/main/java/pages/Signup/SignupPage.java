package pages.Signup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

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
        driver.findElement(email).sendKeys(Email);
    }
    public void setFullName(String FullName){
        driver.findElement(fullName).sendKeys(FullName);
    }
    public void setPassword(String Password){
        driver.findElement(password).sendKeys(Password);
    }
    public WebElement setSignup() {
        return driver.findElement(continueBtn);
    }
    public static String getPageTitle() {
        return driver.getTitle();
    }
}

