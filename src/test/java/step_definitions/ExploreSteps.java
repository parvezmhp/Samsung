package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import page_objects.ExploreOption;

public class ExploreSteps {

    public static final Logger LOGGER = LogManager.getLogger(ExploreSteps.class);
    WebDriver driver = Hooks.driver;

    @When("^User hovers mouse on Explore button$")
    public void userHoversMouseOnExploreButton() {
        new ExploreOption(driver)
                .userHoversMouseOnExploreButton();
        LOGGER.info("User hovers mouse on Explore button");
    }

    @And("^User hovers mouse on Wellbeing tab and clicks on Wellbeing Article tab$")
    public void userHoversMouseOnWellbeingTab() {
        new ExploreOption(driver)
                .userHoversMouseOnWellbeingTab()
                .userClicksOnWellbeingArticlesTab();
        LOGGER.info("User hovers mouse on Wellbeing tab and clicks on Wellbeing Article tab");
    }

    @Then("^User will land on the Wellbeing page and be able to read Kids' First Phones article under Kids' First Phones article link$")
    public void userClicksOnKidsFirstPhonesArticleLink() {
        new ExploreOption(driver)
                .userClicksOnKidsFirstPhonesArticleLink()
                .validateUserIsAbleToReadKidsFirstPhonesArticle();
        LOGGER.info("User will land on the Wellbeing page and be able to read Kids' First Phones article under Kids' First Phones article link");
    }
}

