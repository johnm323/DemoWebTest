package stepdefinitions;

import com.pages.LoginPages;
import com.qa.factory.DriverFactor;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class LoginSteps {

    private static String title;
   private LoginPages loginPages = new LoginPages(DriverFactor.getDriver());


    @Given("user is on login page")
    public void user_is_on_login_page() {

        DriverFactor.getDriver().get("https://www.google.com");

    }
    @When("user gets the title of the page")
    public void user_gets_the_title_of_the_page() {


        title = loginPages.getLoginPageTitle();
        System.out.println("Login page title is "+ title);

    }

    @Then("page title should be {string}")
    public void page_title_should_be(String expectedTitle) {
        Assert.assertTrue(title.contains(expectedTitle));

    }


}
