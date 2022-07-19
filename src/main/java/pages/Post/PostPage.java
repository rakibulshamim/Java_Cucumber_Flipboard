package pages.Post;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
<<<<<<< HEAD
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
=======
>>>>>>> 45cf3f318b4de694cc7ba8465edfcea2ac7496a6

public class PostPage {
    public static WebDriver driver;
    public PostPage(WebDriver driver) {
        PostPage.driver = driver;
    }
    By shareBtn = By.xpath("//span[contains(text(),'Share')]");
    By facebookBtn = By.xpath("//span[contains(text(),'Share on Facebook')]");
    By postBtn = By.name("__CONFIRM__");
    By linkTxt = By.xpath("//div[@class=\"input-field\"]");
    By copiedMsg = By.xpath("//p[contains(text(),\"Copied\")]");
    By cancelBtn = By.xpath("//button[contains(text(),'Cancel')]");
    By flipIcon = By.xpath("//span[contains(text(),'Flip')]");
    By search = By.name("flip-compose-magazine-search");
    By createBtn = By.xpath("//div[@class='flip-compose__create-magazine-thumbnail']");
    By titleField = By.name("title");
    By descriptionTxt = By.xpath("//textarea[@class='create-magazine__description']");
    By caption = By.name("captionText");
    By flipBtn = By.xpath("//button[@type='submit']");
    By reactBtn = By.xpath("(//*[@class=\"like-icon css-hkup75 eg5xtyn0\"])[1]");
    By menuBtn = By.xpath("(//button[@class=\"button--base storyboard-post__actions-icon evgp27d0 css-12a97wm ekbsk5z0\"])[1]");
    By reportBtn = By.xpath("//span[contains(text(),'Report')]");
    By reportedBtn = By.xpath("//button[contains(text(),'Report')]");
    By reportedMsg = By.xpath("//p[contains(text(),'Content reported successfully.')]");
    By dailyEditionBtn = By.xpath("//h2[contains(text(),'The Daily Edition')]");
    By followBtn = By.xpath("//body/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/main[1]/div[2]/div[1]/div[2]/div[1]/button[1]");
    By avatarIcon = By.xpath("//*[@class='avatar-icon main-nav__avatar author-avatar--default__image author-avatar__image']");
    By profileBtn = By.xpath("//a[contains(text(),'Profile')]");
    By likeBtn = By.xpath("//span[contains(text(),'Like')]");
    By homeShareIcon= By.xpath("(//*[@class=\"share-icon css-hkup75 e24wqpy0\"])[1]");
    By homeFlipIcon = By.xpath("//body/div[1]/div[1]/div[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/ul[1]/li[1]/div[1]/article[1]/footer[1]/div[1]/div[2]/button[2]/*[1]");

    public WebElement setShare() {
<<<<<<< HEAD
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.elementToBeClickable(shareBtn));
        return driver.findElement(shareBtn);
    }
    public WebElement setFacebook() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(facebookBtn));
        return driver.findElement(facebookBtn);
    }
    public WebElement setPost() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(postBtn));
        return driver.findElement(postBtn);
    }
    public WebElement shareLink() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(linkTxt));
=======
        return driver.findElement(shareBtn);
    }
    public WebElement setFacebook() {
        return driver.findElement(facebookBtn);
    }
    public WebElement setPost() {
        return driver.findElement(postBtn);
    }
    public WebElement shareLink() {
>>>>>>> 45cf3f318b4de694cc7ba8465edfcea2ac7496a6
        return driver.findElement(linkTxt);
    }
    public String messagesCopied() {
        return driver.findElement(copiedMsg).getText();
    }
    public WebElement cancel() {
        return driver.findElement(cancelBtn);
    }
    public WebElement setFlip() {
        return driver.findElement(flipIcon);
    }
    public void searchMagazines(String magazine_name) {
        driver.findElement(search).sendKeys(magazine_name);
    }
    public WebElement createMagazine() {
        return driver.findElement(createBtn);
    }
    public void setTitle(String title) {
        driver.findElement(titleField).sendKeys(title);
    }
    public void setDescription(String description) {
        driver.findElement(descriptionTxt).sendKeys(description);
    }
    public void addComments(String comment) {
        driver.findElement(caption).sendKeys(comment);
    }
    public WebElement commentFlip() {
<<<<<<< HEAD
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(flipBtn));
        return driver.findElement(flipBtn);
    }
    public WebElement react() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(reactBtn));
=======
        return driver.findElement(flipBtn);
    }
    public WebElement react() {
>>>>>>> 45cf3f318b4de694cc7ba8465edfcea2ac7496a6
        return driver.findElement(reactBtn);
    }
    public WebElement menu() {
        return driver.findElement(menuBtn);
    }
    public WebElement setReport(){
        return driver.findElement(reportBtn);
    }
    public WebElement reported(){
        return driver.findElement(reportedBtn);
    }
    public String reportedMessage(){
        return driver.findElement(reportedMsg).getText();
    }
    public WebElement follow() {
        return driver.findElement(followBtn);
    }
    public WebElement avatar(){
        return driver.findElement(avatarIcon);
    }
    public WebElement profile() {
        return driver.findElement(profileBtn);
    }
    public WebElement like(){return driver.findElement(likeBtn);}
<<<<<<< HEAD
    public WebElement theDailyEditionBtn(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(dailyEditionBtn));
        return driver.findElement(dailyEditionBtn);
    }
    public WebElement homeShare(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(homeShareIcon));
        return driver.findElement(homeShareIcon);
    }
    public WebElement homeFlip(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(homeFlipIcon));
        return driver.findElement(homeFlipIcon);
    }
=======

    public WebElement theDailyEditionBtn(){return driver.findElement(dailyEditionBtn);}
    public WebElement homeShare(){return driver.findElement(homeShareIcon);}
    public WebElement homeFlip(){return driver.findElement(homeFlipIcon);}
>>>>>>> 45cf3f318b4de694cc7ba8465edfcea2ac7496a6
    public static String getPageTitle() {
        return driver.getTitle();
    }
}
