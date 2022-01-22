package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import page_objects.GiftIdeas;

public class GiftIdeasSteps {

    public static final Logger LOGGER = LogManager.getLogger(GiftIdeasSteps.class);
    WebDriver driver = Hooks.driver;

    @And("^User clicks on Cookies tab for Gift Ideas tab$")
    public void userClicksOnCookies() {
        new GiftIdeas(driver)
                .userClicksOnCookiesTab();
        LOGGER.info("User clicks on cookies");
    }

    @When("^User clicks on the Gift Ideas and For The Gamer tabs and clicks on Buy Now after selecting the preferred monitor$")
    public void userClicksOnGiftIdeasAndGamerTabAndSelectsPreferredProduct() {
        new GiftIdeas(driver)
                .clickOnGiftIdeasTab()
                .userClicksOnForTheGamerTab()
                .userClicksOnBuyNowTab();
        LOGGER.info("User clicks on the Gift Ideas and For The Gamer tabs and clicks on Buy Now after selecting the preferred monitor");
    }

    @Then("^User can see the Check Out tab after clicking on Add to Cart$")
    public void userClicksOnAddToCartTab() {
        new GiftIdeas(driver)
                .userClicksOnAddToCartTab()
                .validateThatUserCanSeeCheckOutButton();
        LOGGER.info("User can see the Check Out tab after clicking on Add to Cart");
    }
}
