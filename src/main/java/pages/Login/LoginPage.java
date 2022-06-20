package pages.Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.ArrayList;
import java.util.Set;

public class LoginPage {
    public static WebDriver driver;
    public LoginPage(WebDriver driver) {
        LoginPage.driver = driver;
    }

    By loginBtn = By.xpath("(//a[@class=\"button--base internal-link\"])[1]");
    By userName = By.xpath("//*[@name=\"username\"]");
    By passWord = By.xpath("//*[@name=\"password\"]");
    By facebookIcon = By.xpath("//*[@class='facebook-icon']");
    By userId = By.name("email");
    By fbPassword = By.name("pass");
    By loginBtn2 = By.xpath("//button[@type='submit']");
    By fbLoginBtn = By.name("login");

    public WebElement login(){
        return driver.findElement(loginBtn);
    }
    public void setUserName(String username) throws InterruptedException {
        Thread.sleep(5000);
        driver.findElement(userName).sendKeys(username);
    }
    public void setPassword(String password){
        driver.findElement(passWord).sendKeys(password);
    }
    public WebElement setLogin() throws InterruptedException {
        Thread.sleep(5000);
        return driver.findElement(loginBtn2);
    }
    public WebElement signInByFacebook() {
        return driver.findElement(facebookIcon);
    }
    public void switchWindow() throws InterruptedException {
        String parentHandle = driver.getWindowHandle();
        Set<String> handles = driver.getWindowHandles();
        for (String handle : handles) {
            if (!handle.equals(parentHandle)) {
                driver.switchTo().window(handle);
                Thread.sleep(5000);
            }
        }
    }
    public void setUserId(String Phone) {
        driver.findElement(userId).sendKeys(Phone);
    }
    public void setFBPassword(String FbPassword){
        driver.findElement(fbPassword).sendKeys(FbPassword);
    }
    public WebElement setFbLogin() {
        return driver.findElement(fbLoginBtn);
    }
    public void switchTab() {
        ArrayList<String> w = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(w.get(0));
    }
    public static String getPageTitle() {
            return driver.getTitle();
    }
}

