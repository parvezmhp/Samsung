package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import page_objects.CompleteSearchToPurchase;

public class CompleteSearchToPurchaseSteps {

    private static final Logger LOGGER = LogManager.getLogger(CompleteSearchToPurchaseSteps.class);
    WebDriver driver = Hooks.driver;

    @When("^User searches for Smart TV after sorting for the Newest option$")
    public void userSearchesForSmartTvAfterSortingForTheNewestOption() {
        new CompleteSearchToPurchase(driver)
                .userClicksOnSearchIcon()
                .userSearchForSmartTv()
                .userClicksOnSearchTab()
                .userClicksOnSortBy()
                .userSelectsNewestAsOption();
        LOGGER.info("User searches for Smart TV after sorting for the Newest option");
       }

    @And("^User selects the desired TV and clicks on Add To Cart$")
    public void userSelectsTheDesiredTvAndClicksOnCheckOut() {
        new CompleteSearchToPurchase(driver)
                .userSelectsPreferredTV()
                .userClicksOnAddToCart();
        LOGGER.info("User selects the desired TV and clicks on Check Out");
    }

    @Then("^User lands on the Check Out page to complete purchase$")
    public void validateUserLandsOnTheCheckOutPageToCompletePurchase() {
        new CompleteSearchToPurchase(driver)
                .userIsOnTheCheckOutPage();
        LOGGER.info("User lands on the Check Out page to complete purchase");
      }
}
