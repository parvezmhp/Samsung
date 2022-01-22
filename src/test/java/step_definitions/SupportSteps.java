package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import page_objects.SupportTab;

public class SupportSteps {

    public static final Logger LOGGER = LogManager.getLogger(SupportSteps.class);
    WebDriver driver = Hooks.driver;

    @When("^User hovers mouse on Support tab, clicks on Contact Us tab$")
    public void userHoversMouseOnSupportTab() {
        new SupportTab(driver)
                .userHoversMouseOnSupportTab()
                .userClicksOnContactUsTab();
        LOGGER.info("User hovers mouse on Support tab, clicks on Contact Us tab");
    }


    @And("^User selects appropriate product and related issue$")
    public void userSelectsMobileAsProductCategory() {
        new SupportTab(driver)
                .userSelectsMobileAsProductCategory()
                .userSelectsGalaxyS21Ultra5gAsDevice()
                .userSelectsScreenIsCrackedAsIssueWithThePhone();
        LOGGER.info("User selects Mobile as Product Category");
    }

    @Then("^User lands on the Recommended Solutions page$")
    public void validateThatUserLandsOnTheRecommendedSolutionsPage() {
        new SupportTab(driver)
                .validateThatUserLandsOnTheRecommendedSolutionsPage();
        LOGGER.info("User lands on the Recommended Solutions page");
    }
}
