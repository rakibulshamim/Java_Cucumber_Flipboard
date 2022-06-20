package stepDefinitions.Website;

import io.cucumber.java.en.Given;
import org.testng.Assert;
import pages.Website.Website;
import utils.TestContextSetup;

public class WebsiteStepDefinition {
    TestContextSetup testContextSetup;
    Website website;

    public WebsiteStepDefinition(TestContextSetup testContextSetup) {
        this.testContextSetup=testContextSetup;
        this.website = testContextSetup.pageObjectManager.website();
    }
    @Given("user visit website and home page visible")
    public void user_visit_website_and_home_page_visible() {
        Assert.assertEquals("Flipboard: Your Social Magazine", Website.getPageTitle());
    }
}
