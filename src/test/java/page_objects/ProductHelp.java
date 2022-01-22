package page_objects;

import command_providers.ActOn;
import command_providers.AssertThat;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductHelp extends NavigationBar {

    private static final By Cookies = By.xpath("//*[@id='header']/div[2]/div/div/div[2]/a");
    private static final By SupportTab = By.xpath("//a/span[text()='Support']");
    private static final By ProductHelpTab = By.xpath("//a/span[text()='Product Help']");
    private static final By MobileTab = By.xpath("//a[contains(@groupengname, 'Mobile')]");
    private static final By GalaxyS21UltraTab = By.xpath("//a[contains(@data-link_id, 'Galaxy S21 Ultra 5G')]");
    private static final By RegisterYourProductTab = By.xpath("//a[3][contains(@data-link_id, 'Galaxy S21 Ultra 5G')]");
    private static final By SignInToRegisterPage = By.cssSelector("#ae-main-content > div > div > div > section.account-login.section.aem-GridColumn.aem-GridColumn--default--12 > section > div.login-container > div > div > div.login-inner__right.login-sign-in-inner-phase > div.login-section-block.left-aligned.column-divided.last.second-part.registration > h2");

    private static final Logger LOGGER = LogManager.getLogger(page_objects.SupportTab.class);

    public ProductHelp(WebDriver driver) {
        super(driver);
        LOGGER.debug("User is on the Samsung Homepage to explore Support Tab");
    }

    public ProductHelp userHoversMouseOnSupportTab() {
        ActOn.wait(driver, SupportTab).waitForElementToBeVisible();
        ActOn.elements(driver, SupportTab).mouseHover();
        LOGGER.debug("User hovers mouse on Support tab");
        return this;
    }

    public ProductHelp userClicksOnProductHelpTab() {
        ActOn.wait(driver, ProductHelpTab).waitForElementToBeVisible();
        ActOn.elements(driver, ProductHelpTab).click();
        LOGGER.debug("User clicks on Product Help tab");
        return this;
    }

    public ProductHelp userClicksOnMobileAsProductType() {
        ActOn.wait(driver, MobileTab).waitForElementToBeVisible();
        ActOn.elements(driver, MobileTab).click();
        LOGGER.debug("User clicks on Mobile tab");
        return this;
    }

    public ProductHelp userClicksOnGalaxyS21UltraTab() {
        ActOn.wait(driver, GalaxyS21UltraTab).waitForElementToBeVisible();
        ActOn.elements(driver, GalaxyS21UltraTab).click();
        LOGGER.debug("User selects Galaxy S21 Ultra as product");
        return this;
    }

    public ProductHelp userClicksOnRegisterYourProductTab() {
        ActOn.wait(driver, RegisterYourProductTab).waitForElementToBeVisible();
        ActOn.elements(driver, RegisterYourProductTab).click();
        LOGGER.debug("User selects Register Your Product tab");
        return this;
    }

    public ProductHelp validateUserIsOnSignInPageToRegisterProduct() {
        ActOn.wait(driver, SignInToRegisterPage).waitForElementToBeVisible();
        AssertThat.elementAssertions(driver, SignInToRegisterPage).elementIsDisplayed();
        return this;
    }
}
