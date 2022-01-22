package page_objects;

import command_providers.ActOn;
import command_providers.AssertThat;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class SupportTab extends NavigationBar {

    private static final By Cookies = By.xpath(" //*[@id='header']/div[2]/div/div/div[2]/a");
    private static final By SupportTab = By.xpath("//a/span[text()='Support']");
    private static final By ContactUsTab = By.xpath("//a/span[text()='Contact Us']");
    private static final By MobileTab = By.xpath("//a[contains(@data-product_name, 'Mobile')]");
    private static final By GalaxyS21Ultra5GTab = By.xpath("//a[contains(@data-product_name, 'Galaxy S21 Ultra 5G')]");
    private static final By ScreenIsCrackedTab = By.xpath("//a[contains(@data-symptom_name, 'Screen Is Cracked')]");
    private static final By RecommendedSolutionsPage = By.xpath("//*[@id='su11-link-card__api-content']/div/h2");

    private static final Logger LOGGER = LogManager.getLogger(SupportTab.class);

    public SupportTab(WebDriver driver) {
        super(driver);
        LOGGER.debug("User is on the Samsung Homepage to explore Support Tab");
    }

    public SupportTab userHoversMouseOnSupportTab() {
        ActOn.wait(driver, SupportTab ).waitForElementToBeVisible();
        ActOn.elements(driver, SupportTab).mouseHover();
        LOGGER.debug("User hovers mouse on Support tab");
        return this;
    }

     public SupportTab userClicksOnContactUsTab() {
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
        ActOn.wait(driver, ContactUsTab).waitForElementToBeVisible();
        ActOn.elements(driver, ContactUsTab).click();
        LOGGER.debug("User clicks on Contact Us tab");
        return this;
    }

    public SupportTab userSelectsMobileAsProductCategory() {
        ActOn.wait(driver, MobileTab).waitForElementToBeVisible();
        ActOn.elements(driver, MobileTab).click();
        LOGGER.debug("User selects phone as Product Category");
        return this;
    }

    public SupportTab userSelectsGalaxyS21Ultra5gAsDevice() {
        ActOn.wait(driver, GalaxyS21Ultra5GTab).waitForElementToBeVisible();
        ActOn.elements(driver, GalaxyS21Ultra5GTab).click();
        LOGGER.debug("User selects Galaxy S21 Ultra 5G as Device");
        return this;
    }

    public SupportTab userSelectsScreenIsCrackedAsIssueWithThePhone() {
        ActOn.wait(driver, ScreenIsCrackedTab).waitForElementToBeVisible();
        ActOn.elements(driver, ScreenIsCrackedTab).click();
        LOGGER.debug("User selects Screen Is Cracked as issue with the phone");
        return this;
    }

    public SupportTab validateThatUserLandsOnTheRecommendedSolutionsPage() {
//        ActOn.wait(driver, RecommendedSolutionsPage).waitForElementToBeVisible();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
        AssertThat.elementAssertions(driver, RecommendedSolutionsPage).elementIsDisplayed();
        LOGGER.debug("User lands on the Recommended Solutions page");
        return this;
    }
}



