package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import page_objects.MultipleCategories;

public class MultipleCategoriesSteps {
    WebDriver driver = Hooks.driver;

    @When("^The user clicks on Computing$")
    public void the_user_clicks_on_computing() {
        new MultipleCategories(driver)
                .MouseHoverToComputing();
    }

    @And("^Choose \"(.+?)\"$")
    public void chose(String item) {
        new MultipleCategories(driver)
                .ItemSelect(item);
    }

    @Then("^Validates the Page Title Contain \"(.+?)\"$")
    public void validate_the_page_title_contain(String title) {
        new MultipleCategories(driver)
                .TitleValidation(title);
    }
}
