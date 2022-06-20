package stepDefinitions.Home;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.Home.HomePage;
import pages.Login.LoginPage;
import utils.TestContextSetup;

public class HomePageStepDefinition {
    TestContextSetup testContextSetup;
    HomePage homePage;
    LoginPage loginPage;

    public HomePageStepDefinition(TestContextSetup testContextSetup) {
        this.testContextSetup=testContextSetup;
        this.homePage = testContextSetup.pageObjectManager.homePage();
        this.loginPage = testContextSetup.pageObjectManager.logIn();
    }
    @Given("verify For You href visible")
    public void verify_for_you_href_visible() throws InterruptedException {
        Thread.sleep(5000);
        Assert.assertEquals(homePage.forYou(), "FOR YOU");
    }
    @Given("click on The Daily Edition")
    public void click_on_the_daily_edition() {
        homePage.theDailyEdition().click();
    }
    @Then("user redirect to The Daily Edition page and verify page title")
    public void user_redirect_to_the_daily_edition_page_and_verify_page_title() throws InterruptedException {
        Thread.sleep(5000);
        Assert.assertEquals(HomePage.getPageTitle(), "The Daily Edition | Flipboard");
    }
    @When("click on entertainment image")
    public void click_on_entertainment_image() {
        homePage.entertainment().click();
    }
    @Then("user redirect to entertainment page and verify page title")
    public void user_redirect_to_entertainment_page_and_verify_page_title() throws InterruptedException {
        Thread.sleep(5000);
        Assert.assertEquals(HomePage.getPageTitle(), "Discover More in Entertainment on Flipboard");
    }
    @Given("click on personalize icon")
    public void click_on_personalize_icon() {
        homePage.personalizeForYou().click();
    }
    @When("user select favorite topic from list")
    public void user_select_favorite_topic_from_list() {
        homePage.selectTopic().click();
    }
    @Then("click on save button")
    public void click_on_save_button() {
        homePage.Save().click();
    }
    @Then("popup close automatically and redirect to home page")
    public void popup_close_automatically_and_redirect_to_home_page() {
        //System.out.println(HomePage.getPageTitle());
        Assert.assertEquals("Flipboard: Your Social Magazine", HomePage.getPageTitle());
    }
}
