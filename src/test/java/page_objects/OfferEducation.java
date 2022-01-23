package page_objects;

import command_providers.ActOn;
import command_providers.AssertThat;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class OfferEducation extends NavigationBar{

    private static final By OffersTab = By.cssSelector("#wrap > div.gnb.js-mobile-open.isHybrid > nav > div > div > div.gnb__menu-wrap.ae-exclude > div > div.gnb__main > ul > li:nth-child(6) > a > span");
    private static final By OfferProgramTab = By.xpath("//a[1]/span[text()='Offer Programs']");
    private static final By EducationOffersProgramTab = By.xpath("//a/div[text()='Education Offers Program']");
    private static final By Cookies = By.xpath(" //*[@id='header']/div[2]/div/div/div[2]/a");
    private static final By AllStudentOffersTab = By.cssSelector("#filterContainer > div:nth-child(1) > div > div.Filters__imgWrapper___GF1S7 > img");
    private static final By SamsungGalaxySmartTagTab = By.xpath("//*/div[2][text()='Samsung Galaxy SmartTag, 1-Pack, Black']");
    private static final By BuyNowTab = By.xpath("//a/p[contains(@class, 'type-p2')]");
    private static final By SamsungAccountPage = By.xpath("//h1/img[contains(@alt, 'Samsung account')]");

    private static final Logger LOGGER = LogManager.getLogger(OfferEducation.class);

    public OfferEducation(WebDriver driver) {
        super(driver);
    }

    public OfferEducation MouseHoverToCookiesTab() {
        ActOn.wait(driver, Cookies).waitForElementToBeVisible();
        ActOn.elements(driver, Cookies).mouseHover();
        LOGGER.debug("User MouseHover on Cookies");
        return this;
    }

    public OfferEducation clicksToCookiesTab() {
        ActOn.wait(driver, Cookies).waitForElementToBeVisible();
        ActOn.elements(driver, Cookies).click();
        LOGGER.debug("User clicks on Cookies");
        return this;
    }

    public OfferEducation MouseHoverToOffersTab() {
        ActOn.wait(driver, OffersTab).waitForElementToBeVisible();
        ActOn.elements(driver, OffersTab).mouseHover();
        LOGGER.debug("User MouseHover to Offers tab");
        return this;
    }

    public OfferEducation MouseHoverToOfferPrograms() {
        ActOn.wait(driver, OfferProgramTab).waitForElementToBeVisible();
        ActOn.elements(driver,OfferProgramTab).mouseHover();
        LOGGER.debug("User MouseHover to Offer Programs");
        return this;
    }

    public OfferEducation ClicksOnEducationOffersProgram() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
        ActOn.elements(driver, EducationOffersProgramTab).click();
        LOGGER.debug("User clicks on Education Offers Program");
        return this;
    }

    public OfferEducation clicksOnTheAllStudentOffers() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
        ActOn.elements(driver, AllStudentOffersTab).click();
        LOGGER.debug("User clicks on the All Student Offer tab");
        return this;
    }

    public OfferEducation clicksOnSamsungGalaxySmartTag() {
        ActOn.wait(driver, SamsungGalaxySmartTagTab).waitForElementToBeVisible();
        ActOn.elements(driver, SamsungGalaxySmartTagTab).click();
        LOGGER.debug("User chose the Samsung Galaxy Tag");
        return this;
        }

    public OfferEducation clicksOnTheBuyNowTab() {
        ActOn.wait(driver, BuyNowTab).waitForElementToBeVisible();
        ActOn.elements(driver, BuyNowTab).click();
        LOGGER.debug("User clicks on the Buy On tab to add on the cart");
        return this;
        }

    public void validateThatUserLandsOnTheSamsungAccountPage() {
        ActOn.wait(driver, SamsungAccountPage).waitForElementToBeVisible();
        AssertThat.elementAssertions(driver, SamsungAccountPage).elementIsDisplayed();
        LOGGER.debug("User will land on the Samsung Account Login page to complete the purchase");
    }
}

