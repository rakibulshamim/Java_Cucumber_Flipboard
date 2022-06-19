package stepDefinitions.Signup;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.Signup.SignupPage;
import utils.TestContextSetup;

public class SignupPageStepDefinition {
    TestContextSetup testContextSetup;
    SignupPage signupPage;

    public SignupPageStepDefinition(TestContextSetup testContextSetup) {
        this.testContextSetup=testContextSetup;
        this.signupPage = testContextSetup.pageObjectManager.signUp();
    }
    @Given("user visits signup page")
    public void user_visits_signup_page() throws InterruptedException {
        Thread.sleep(5000);
        signupPage.signup().click();
    }
    @When("user Enter {string}, {string} and {string}")
    public void user_Enter_and(String Email, String FullName, String Password) throws InterruptedException {
        Thread.sleep(5000);
        signupPage.setEmail(Email);
        Thread.sleep(3000);
        signupPage.setFullName(FullName);
        Thread.sleep(3000);
        signupPage.setPassword(Password);
        Thread.sleep(5000);
    }
    @Then("click on Continue button")
    public void click_on_continue_button() throws InterruptedException {
        signupPage.setSignup().click();
        Thread.sleep(5000);
    }
    @Then("signup successfully and validation of page title")
    public void signup_successfully_and_validation_of_page_title() {
        Assert.assertEquals("Flipboard: Your Social Magazine", SignupPage.getPageTitle());
    }
}
