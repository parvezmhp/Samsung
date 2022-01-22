package step_definitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import page_objects.ProductHelp;

public class ProductHelpSteps {

    private static final Logger LOGGER = LogManager.getLogger(ProductHelpSteps.class);
    WebDriver driver = Hooks.driver;

    @When("^User hovers mouse on Support and clicks on Product and selects specific product to get support$")
    public void userHoversMouseOnSupport() {
        new ProductHelp(driver)
                .userHoversMouseOnSupportTab()
                .userClicksOnProductHelpTab()
                .userClicksOnMobileAsProductType()
                .userClicksOnGalaxyS21UltraTab();
        LOGGER.info("User hovers mouse on Support and clicks on Product and selects specific product to get support");
    }

    @Then("^User lands on the Log In after clicking on Register Your Product$")
    public void userSelectsRegisterYourProduct() {
        new ProductHelp(driver)
                .userClicksOnRegisterYourProductTab()
                .validateUserIsOnSignInPageToRegisterProduct();
        LOGGER.info("User lands on the Log In after clicking on Register Your Product");
    }
}
