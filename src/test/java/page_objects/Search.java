package page_objects;

import command_providers.ActOn;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class Search {
    private static final By SearchBox = By.id("ae_placeholder_desc");
    private static final By SearchButton = By.className("gnb__search");
    private static final By SearchIcon = By.xpath("//*[@id=\"wrap\"]/div[2]/section[2]/div[3]/div[1]/form/fieldset/div/button[3]");

    private static final Logger LOGGER = LogManager.getLogger(Search.class);

    public WebDriver driver;

    public Search (WebDriver driver) {
        this.driver = driver;
    }

    public Search clickOnSearchButton () {
        LOGGER.debug("Clicked On Search Button");
        ActOn.elements(driver,SearchButton).click();
        return this;
    }

    public Search typeProduct (String typeProduct) {
        LOGGER.debug("Typing Products");
        ActOn.wait(driver,SearchBox).waitForElementToBeVisible();
        ActOn.elements(driver,SearchBox).setValue(typeProduct);
        return this;
    }

    public Search clickOnSearchIcon () {
        LOGGER.debug("Clicked On Search icon");
        ActOn.elements(driver,SearchIcon).click();
        return this;
    }

    public Search validatePageTitle (String expectedTitle) throws InterruptedException {
        driver.wait(3000);
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle,expectedTitle);
        LOGGER.debug("Title is" + actualTitle);
        return this;
    }
}
