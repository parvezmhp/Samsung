package step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import page_objects.HomePage;

public class HomePageSteps {
    private static final Logger LOGGER = LogManager.getLogger(HomePage.class);
    WebDriver driver = Hooks.driver;

    @Given("^User is on the Home Page$")
    public void userIsOnHomePage() {
        new HomePage(driver)
                .homePage();
        LOGGER.info("User is on Home Page");
    }

     @Then("^User will see the Samsung Logo$")
    public void validateThatUserSeesTheLogo() {
        new HomePage(driver)
                .homePage();
        LOGGER.info("User saw Samsung Logo");
    }
}
