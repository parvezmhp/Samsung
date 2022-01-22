package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import page_objects.OfferEducation;

public class OfferEducationsSteps {

    public static final Logger LOGGER = LogManager.getLogger(OfferEducationsSteps.class);
    WebDriver driver = Hooks.driver;

    @When("^User clicks on Cookies tab for OfferEducations$")
    public void userMouseHoverToCookiesTab() {
        new OfferEducation(driver)
                .MouseHoverToCookiesTab()
                .clicksToCookiesTab();
        LOGGER.info("User Successfully clicks on Cookies");
    }

    @And("^User hovers mouse to Offers and Offer Program tabs$")
    public void userHoversMouseToOffersAndOfferProgramsTabs() {
        new OfferEducation(driver)
                .MouseHoverToOffersTab()
                .MouseHoverToOfferPrograms();
        LOGGER.info("User hovers mouse to Offers and Offer Program tabs");
    }

    @And("^User clicks on Education Offers Program$")
    public void userClicksOnEducationOffersProgram() {
        new OfferEducation(driver)
                .ClicksOnEducationOffersProgram();
        LOGGER.info("User Successfully clicks on Education Offers Program");
    }

    @And("^User clicks on All Student Offers tab and selects desired product and clicks on Buy Now$")
    public void userClicksOnBuyNowAfterSelectingDesiredProductFromAllStudentOffers() {
        new OfferEducation(driver)
                .clicksOnTheAllStudentOffers()
                .clicksOnSamsungGalaxySmartTag()
                .clicksOnTheBuyNowTab();
        LOGGER.info("User clicks on All Student Offers tab and selects desired product and clicks on Buy Now");
    }

    @Then("^User will land on the Samsung Account Login page to complete the purchase$")
    public void validateThatUserLandsOnTheSamsungAccountPage() {
        new OfferEducation(driver).validateThatUserLandsOnTheSamsungAccountPage();
        LOGGER.info("User will land on the Samsung Account Login page to complete the purchase");
    }
}
