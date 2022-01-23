package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import page_objects.MultipleCategories;

public class MultipleCategoriesSteps {
    WebDriver driver = Hooks.driver;

    @When("^The user clicks on Computing$")
    public void userClicksOnComputing() {
        new MultipleCategories(driver)
                .MouseHoverToComputing();
    }

    @And("^Choose \"(.+?)\"$")
    public void chose(String item) {
        new MultipleCategories(driver)
                .ItemSelect(item);
    }

    @Then("^Validates the Page Title Contain \"(.+?)\"$")
    public void validateThePageTitleContain(String title) {
        new MultipleCategories(driver)
                .TitleValidation(title);
    }
}
