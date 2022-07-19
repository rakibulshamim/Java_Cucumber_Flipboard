package stepDefinitions.Post;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.Login.LoginPage;
import pages.Post.PostPage;
import utils.TestContextSetup;
import java.time.Duration;
import static pages.Post.PostPage.driver;

public class PostPageStepDefinition {
    PostPage postPage;
    LoginPage loginPage;
    TestContextSetup testContextSetup;

    public PostPageStepDefinition(TestContextSetup testContextSetup) {
        this.testContextSetup=testContextSetup;
        this.postPage = testContextSetup.pageObjectManager.postPage();
        this.loginPage = testContextSetup.pageObjectManager.logIn();
    }

    @Given("click on Share icon in home page")
    public void click_on_share_icon_in_home_page() {
        postPage.homeShare().click();
    }

    @Then("click on Share icon")
    public void click_on_share_icon() throws InterruptedException {
        postPage.setShare().click();
    }

    @When("click on Share on Facebook button")
    public void click_on_share_on_facebook_button() throws InterruptedException {
        postPage.setFacebook().click();
        loginPage.switchWindow();
    }

    @Then("click on Post To Facebook button")
    public void click_on_post_to_facebook_button() {
        postPage.setPost().click();
    }

    @When("click on Facebook login Button")
    public void click_on_Facebook_login_Button() {
        loginPage.setFbLogin().click();
    }

    @When("click on share the link below box and copy the link")
    public void click_on_share_the_link_below_box_and_copy_the_link() {
        postPage.shareLink().click();
    }

    @Then("verify copied message")
    public void verify_copied_message() {
        Assert.assertEquals(postPage.messagesCopied(), "Copied!");
    }

    @Then("click on cancel button")
    public void click_on_cancel_button() {
        postPage.cancel().click();
    }

    @Then("click on Flip icon")
    public void click_on_flip_icon() {
        postPage.setFlip().click();
    }

    @Given("click on Flip icon in home page")
    public void click_on_flip_icon_in_home_page() {
        postPage.homeFlip().click();
    }

    @Then("user enter {string} search magazines box")
    public void user_enter_search_magazines_box(String magazine_name) {
        postPage.searchMagazines(magazine_name);
    }

    @When("click on Create Magazine button")
    public void click_on_create_magazine_button() {
        postPage.createMagazine().click();
    }

    @When("user enter magazine {string} in magazine name box")
    public void user_enter_magazine_in_magazine_name_box(String title) {
        postPage.setTitle(title);
    }

    @When("user enter magazine {string} magazine description box")
    public void user_enter_magazine_magazine_description_box(String description) {
        postPage.setDescription(description);
    }

    @When("user enter a {string} in Add a comment box")
    public void user_enter_a_in_add_a_comment_box(String comment) {
        postPage.addComments(comment);
    }

    @Then("click on Flip button")
    public void click_on_flip_button() {
        postPage.commentFlip().click();
    }

    @Given("click on Heart icon")
    public void click_on_heart_icon() {
        postPage.react().click();
    }

    @Given("click on The Daily Edition button")
    public void click_on_the_daily_edition_button() throws InterruptedException {
        postPage.theDailyEditionBtn().click();
    }

    @When("click on menu button")
    public void click_on_menu_button() {
        postPage.menu().click();
    }

    @Then("click on Like button")
    public void click_on_like_button(){
        postPage.like().click();
    }

    @When("click on report button")
    public void click_on_report_button() {
        postPage.setReport().click();
    }

    @When("click on report button in report content")
    public void click_on_report_button_in_report_content() {
        postPage.reported().click();
    }

    @Then("verify reported successfully")
    public void verify_reported_successfully() throws InterruptedException {
        Assert.assertEquals(postPage.reportedMessage(), "Content reported successfully.");
        Thread.sleep(3000);
    }

    @When("click on follow button")
    public void click_on_follow_button() {
        postPage.follow().click();
    }

    @Given("click on avatar icon")
    public void click_on_avatar_icon() {
        postPage.avatar().click();
    }

    @When("click on profile page")
    public void click_on_profile_page() {
        postPage.profile().click();
    }

    @Then("user redirect to profile page and verify page title")
    public void user_redirect_to_profile_page_and_verify_page_title() throws InterruptedException {
        Thread.sleep(3000);
        Assert.assertEquals("Flipboard - Profile", PostPage.getPageTitle());
    }
}
