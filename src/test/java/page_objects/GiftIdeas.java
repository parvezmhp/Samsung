package page_objects;

import command_providers.ActOn;
import command_providers.AssertThat;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class GiftIdeas extends NavigationBar{

    private static final By GiftIdeasTab = By.xpath("//a/span[text()='Gift Ideas']");
    private static final By Cookies = By.xpath(" //*[@id='header']/div[2]/div/div/div[2]/a");
    private static final By ForTheGamerTab = By.xpath("//a/picture/img[contains(@title, 'For the gamer')]");
    private static final By BuyNowTab = By.xpath("//div/a[contains(@aria-label, 'Buy now')]");
    private static final By AddToCartTab = By.xpath("//a[contains(@class, 'product-top-nav')]");
    private static final By CheckOutButton = By.xpath("//div/button[contains(@class, 'btn btn-rounded')]");

    public static final Logger LOGGER = LogManager.getLogger(GiftIdeas.class);

    public GiftIdeas(WebDriver driver) {
        super(driver);
    }

    public GiftIdeas navigateToHomePage() {
        new HomePage(driver)
                .homePage();
        LOGGER.info("User is on the Home Page to see Gift Ideas");
        return this;
    }

    public GiftIdeas userClicksOnCookiesTab() {
        ActOn.wait(driver, Cookies).waitForElementToBeVisible();
        ActOn.elements(driver, Cookies).click();
        LOGGER.debug("User clicks on cookies tab");
        return this;
    }

    public GiftIdeas clickOnGiftIdeasTab() {
        ActOn.wait(driver, GiftIdeasTab).waitForElementToBeVisible();
        ActOn.elements(driver, GiftIdeasTab).click();
        LOGGER.debug("User Clicks on the Gift Ideas Tab");
        return this;
    }

    public GiftIdeas userClicksOnForTheGamerTab() {
        ActOn.wait(driver, ForTheGamerTab).waitForElementToBeVisible();
        ActOn.elements(driver, ForTheGamerTab).click();
        LOGGER.debug("User clicks on For The Gamer tab");
        return this;
    }

    public GiftIdeas userClicksOnBuyNowTab() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        ActOn.elements(driver, BuyNowTab).click();
        LOGGER.debug("User clicks on Buy Now for the preferred monitor");
        return this;
    }

    public GiftIdeas userClicksOnAddToCartTab() {
        ActOn.wait(driver, AddToCartTab).waitForElementToBeVisible();
        ActOn.elements(driver, AddToCartTab).click();
        LOGGER.debug("User clicks on Add To Cart tab");
        return this;
    }

    public GiftIdeas validateThatUserCanSeeCheckOutButton() {
        ActOn.wait(driver, CheckOutButton).waitForElementToBeVisible();
        AssertThat.elementAssertions(driver, CheckOutButton).elementIsDisplayed();
        LOGGER.debug("Validate that user can see the Check Out tab to buy the monitor ");
        return this;
    }
}
