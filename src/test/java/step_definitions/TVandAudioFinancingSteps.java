package step_definitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import page_objects.TVandAudioFinancing;

public class TVandAudioFinancingSteps {


    public static final Logger LOGGER = LogManager.getLogger(TVandAudioFinancingSteps.class);
    WebDriver driver = Hooks.driver;

    @When("^User hovers mouse to TV & Audio and Offer tab and clicks on Samsung Financing tab$")
    public void userHoversMouseToTvAudioTab() {
        new TVandAudioFinancing(driver)
                .userHoversMouseToTvAudioTab()
                .userHoversMouseToOffersTab()
                .userClicksOnSamsungFinancingTab();
        LOGGER.info("User hovers mouse to TV & Audio and Offer tab and clicks on Samsung Financing tab");
    }

    @Then("^User will land on Sign In to Your Samsung Account page after clicking on Apply Now to apply for financing$")
    public void userClicksOnTheApplyNowTabOnPowerUpWithSamsungFinancingPage() {
        new TVandAudioFinancing(driver)
                .userClicksOnTheApplyNowTabOnPowerUpWithSamsungFinancingPage()
                .userLandsOnSignInToYourSamsungAccountPage();
        LOGGER.info("User will land on Sign In to Your Samsung Account page after clicking on Apply Now to apply for financing");
    }
}
