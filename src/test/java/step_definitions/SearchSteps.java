package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.Search;

public class SearchSteps {
    private static final Logger LOGGER = LogManager.getLogger(SearchSteps.class);
    WebDriver driver = Hooks.driver;

    @Then("^User clicks on search button$")
    public void userClicksOnSearchButton() {
       new Search(driver)
               .clickOnSearchButton();
        LOGGER.info("User clicked on search button");
    }

    @And("^Types the products name \"(.+?)\"$")
    public void TypeTheProductsName(String ProductName) {
        driver.findElement(By.id("gnb-search-keyword")).clear();
        driver.findElement(By.id("gnb-search-keyword")).sendKeys(ProductName);
        LOGGER.info("User typing" +ProductName);
    }

    @Then("^Clicks on Search icon$")
    public void clickOnSearchIcon() {
        new Search(driver)
                .clickOnSearchIcon();
        LOGGER.info("User Clicked On Search Icon");
    }

    @When("^User click on search icon user will go to the product page and see page title \"(.+?)\"$")
    public void userClickOnSearchIconUserWillGoToTheProductPageAndSeePageTitle(String PageTitle) throws InterruptedException {

        new Search(driver)
                .validatePageTitle(PageTitle);
        LOGGER.info("Title is" +PageTitle);
    }
}
