package page_objects;

import command_providers.ActOn;
import command_providers.AssertThat;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class TVandAudioFinancing extends NavigationBar {

    private final static By TVandAudioTab = By.xpath("//a/span[text()='TV & Audio']");
    private final static By OffersTab = By.cssSelector("#wrap > div.gnb.js-mobile-open.isHybrid > nav > div > div > div.gnb__menu-wrap.ae-exclude > div > div.gnb__main > ul > li:nth-child(2) > div > div.gnb__depth2-inner > ul > li:nth-child(6) > a.gnb__depth2-link > span");
// Tried several Xpaths but Offers Tab never loads...By.xpath("//a/span[text()='Offers']");
    private final static By SamsungFinancingTab = By.cssSelector("#wrap > div.gnb.js-mobile-open.isHybrid > nav > div > div > div.gnb__menu-wrap.ae-exclude > div > div.gnb__main > ul > li:nth-child(2) > div > div.gnb__depth2-inner > ul > li:nth-child(6) > div > div > ul > li:nth-child(3) > a > div");
// Same issue...By.xpath("//a/div[contains(@class, 'gnb__depth3')]");
    private final static By ApplyNowTab = By.xpath("//a[text()='APPLY NOW']");
    private final static By SamsungAccountLogInPage = By.xpath("//h1[text()='Sign in to your Samsung account']");

    private final static Logger LOGGER = LogManager.getLogger(TVandAudioFinancing.class);

    public TVandAudioFinancing(WebDriver driver) {
        super(driver);
    }

    public TVandAudioFinancing userHoversMouseToTvAudioTab() {
        ActOn.wait(driver, TVandAudioTab).waitForElementToBeVisible();
        ActOn.elements(driver, TVandAudioTab).mouseHover();
        LOGGER.debug("User hovers mouse to TV & Audio tab");
        return this;
    }

    public  TVandAudioFinancing userHoversMouseToOffersTab() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
        ActOn.elements(driver, OffersTab).mouseHover();
        LOGGER.info("User hovers mouse to Offers tab");
        return this;
    }

    public TVandAudioFinancing userClicksOnSamsungFinancingTab() {
        ActOn.wait(driver, SamsungFinancingTab).waitForElementToBeVisible();
        ActOn.elements(driver, SamsungFinancingTab).click();
        LOGGER.info("User clicks on Samsung Financing tab");
        return this;
    }

    public TVandAudioFinancing userClicksOnTheApplyNowTabOnPowerUpWithSamsungFinancingPage() {
        ActOn.wait(driver, ApplyNowTab).waitForElementToBeVisible();
        ActOn.elements(driver, ApplyNowTab).click();
        LOGGER.info("User clicks on the Apply Now tab on Power up with Samsung Financing page");
        return this;
    }

    public TVandAudioFinancing userLandsOnSignInToYourSamsungAccountPage() {
        ActOn.wait(driver, SamsungAccountLogInPage).waitForElementToBeVisible();
        AssertThat.elementAssertions(driver, SamsungAccountLogInPage).elementIsDisplayed();
        LOGGER.info("User lands on Sign In to Your Samsung Account page");
        return this;
    }
}
