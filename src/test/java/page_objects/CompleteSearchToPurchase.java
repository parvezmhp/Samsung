package page_objects;

import command_providers.ActOn;
import command_providers.AssertThat;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CompleteSearchToPurchase extends NavigationBar {

    private static final By SearchIcon = By.className("gnb__search");
    private static final By SearchBox = By.id("gnb-search-keyword");
    private static final By SearchTab = By.xpath("//*[@id=\"wrap\"]/div[2]/section[2]/div[3]/div[1]/form/fieldset/div/button[3]");
    private static final By SortBy = By.cssSelector("#search-result-react > div > div > div > div:nth-child(1) > div.ControlBar__spaceBetween___oNusb.ControlBar__top___ecqil > div.Sorts__container___3SUFO > span");
    private static final By Newest = By.xpath("//div/span[text()='Newest']");
    private static final By PreferredTV = By.cssSelector("#search-result-react > div > div > div > div.SearchContainer__dynamicGrid___34CEz > div.SearchContainer__productHolder___36vUw.SearchContainer__lg___277jm > div:nth-child(1) > div > div:nth-child(3) > div > div.ProductCard__top___1ZjFw > div.ProductCard__image___1oPPW > div:nth-child(1) > div > div > img");
    private static final By AddToCart = By.xpath("//a[text()='ADD TO CART']");
    private static final By CheckOutPage = By.xpath("//a[contains(@class, 'gnb__logo center-logo')]");

    private static final Logger LOGGER = LogManager.getLogger(CompleteSearchToPurchase.class);

    public CompleteSearchToPurchase(WebDriver driver) {
        super(driver);
    }

    public CompleteSearchToPurchase userClicksOnSearchIcon() {
        ActOn.wait(driver, SearchIcon).waitForElementToBeVisible();
        ActOn.elements(driver, SearchIcon).click();
        LOGGER.debug("User clicks on the Search Icon");
        return this;
    }

    public CompleteSearchToPurchase userSearchForSmartTv() {
        ActOn.wait(driver, SearchBox).waitForElementToBeVisible();
        driver.findElement(SearchBox).clear();
        driver.findElement(SearchBox).sendKeys("Smart TV");
        LOGGER.debug("User clicks on the Search Icon");
        return this;
    }

    public CompleteSearchToPurchase userClicksOnSearchTab() {
        ActOn.wait(driver, SearchTab).waitForElementToBeVisible();
        ActOn.elements(driver, SearchTab).click();
        LOGGER.debug("User clicks on Search tab");
        return this;
    }

    public CompleteSearchToPurchase userClicksOnSortBy() {
        ActOn.wait(driver, SortBy).waitForElementToBeVisible();
        ActOn.elements(driver, SortBy).click();
        LOGGER.debug("User clicks on Sort By tab");
        return this;
    }

    public CompleteSearchToPurchase userSelectsNewestAsOption() {
        ActOn.wait(driver, Newest).waitForElementToBeVisible();
        ActOn.elements(driver, Newest).click();
        LOGGER.debug("User selects Newest as option from drop down menu");
        return this;
    }

    public CompleteSearchToPurchase userSelectsPreferredTV() {
        ActOn.wait(driver, PreferredTV).waitForElementToBeVisible();
        ActOn.elements(driver, PreferredTV).click();
        LOGGER.debug("User selects 85” Class The Frame QLED 4K Smart TV as preferred TV");
        return this;
    }

    public CompleteSearchToPurchase userClicksOnAddToCart() {
        ActOn.wait(driver, AddToCart).waitForElementToBeVisible();
        ActOn.elements(driver, AddToCart).click();
        LOGGER.debug("User clicks on Add To Cart to proceed to buy");
        return this;
    }

    public CompleteSearchToPurchase userIsOnTheCheckOutPage() {
        ActOn.wait(driver, CheckOutPage).waitForElementToBeVisible();
        AssertThat.elementAssertions(driver, CheckOutPage).elementIsDisplayed();
        LOGGER.debug("User is on the Check Out page to complete purchase");
        return this;
    }
}