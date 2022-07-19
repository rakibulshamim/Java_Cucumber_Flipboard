package stepDefinitions.Download;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.Download.DownloadPage;
import pages.Login.LoginPage;
import utils.TestContextSetup;

public class DownloadPageStepDefinition {
    TestContextSetup testContextSetup;
    DownloadPage downloadPage;
    LoginPage loginPage;

    public DownloadPageStepDefinition(TestContextSetup testContextSetup) {
        this.testContextSetup=testContextSetup;
        this.downloadPage = testContextSetup.pageObjectManager.download();
        this.loginPage = testContextSetup.pageObjectManager.logIn();
    }
    @When("click on Tools button")
    public void click_on_tools_button() throws InterruptedException {
        downloadPage.tools().click();
        Thread.sleep(5000);
        loginPage.switchWindow();
    }
    @When("click on Available on iOS button")
    public void click_on_available_on_i_os_button() throws InterruptedException {
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("arguments[0].scrollIntoView();", downloadPage.availableOniOS());
//        js.executeScript("arguments[0].click();", downloadPage.availableOniOS());
          downloadPage.availableOniOS().click();
    }
    @Then("user redirect to Apple App Store page and validation of page title")
    public void user_redirect_to_apple_app_store_page_and_validation_of_page_title() throws InterruptedException {
        Thread.sleep(3000);
        Assert.assertEquals(DownloadPage.getPageTitle(), "Tools");
    }
    @When("click on Available on Android button")
    public void click_on_available_on_android_button() throws InterruptedException {
        downloadPage.availableOnAndroid().click();
    }
    @Then("user redirect to Google Play Store page and validation of page title")
    public void user_redirect_to_google_play_store_page_and_validation_of_page_title() throws InterruptedException {
        Thread.sleep(3000);
        Assert.assertEquals(DownloadPage.getPageTitle(), "Flipboard - Latest News, Top Stories & Lifestyle - Apps on Google Play");
    }
}
