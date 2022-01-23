package page_objects;

import command_providers.ActOn;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MultipleCategories {
    private final By SelectComputing = By.xpath("//*/li[5]/a/span[text()='Computing']");
    private final By Item = By.xpath("//*[text()='Galaxy Tab A8']");
    private final By SelectFeatured= By.linkText("Featured");
    private static final By Cookies = By.xpath(" //*[@id='header']/div[2]/div/div/div[2]/a");

    private static final Logger LOGGER = LogManager.getLogger(MultipleCategories.class);
    public WebDriver driver;

    public MultipleCategories(WebDriver driver) {
        this.driver = driver;
    }

    public MultipleCategories MouseHoverToComputing() {
        ActOn.wait(driver, Cookies).waitForElementToBeVisible();
        ActOn.elements(driver, Cookies).mouseHover();
        ActOn.elements(driver, Cookies).click();
        ActOn.wait(driver,SelectComputing).waitForElementToBeVisible();
        ActOn.elements(driver,SelectComputing).mouseHover();
        ActOn.wait(driver,SelectFeatured).waitForElementToBeVisible();
        ActOn.elements(driver,SelectFeatured).click();
        LOGGER.debug("User Clicked On Computing");
        return this;
    }

    public MultipleCategories ItemSelect (String item) {
        ActOn.wait(driver,By.xpath("//*[text()=" + item)).waitForElementToBeVisible();
        ActOn.elements(driver,By.xpath("//*[text()=" + item)).click();
        LOGGER.debug("User Chose " + item);
        return this;
    }

    public MultipleCategories TitleValidation(String titleContain){
        String actualTitle = driver.getTitle();
        if (!actualTitle.contains(titleContain)){
            Assert.fail("Title Did not match");
        }
        LOGGER.debug("Title Contain "+ actualTitle);
        return this;
    }
}
