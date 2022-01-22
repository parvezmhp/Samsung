package page_objects;

import command_providers.ActOn;
import command_providers.AssertThat;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ExploreOption extends NavigationBar {
    private static final By ExploreButton = By.xpath("//a/span[text()='Explore']");
    private static final By WellbeingTab = By.xpath("//a/span[text()='Wellbeing']");
    private static final By WellbeingArticlesTab = By.xpath("//a/div[text()='Wellbeing Articles']");
    private static final By Cookies = By.xpath(" //*[@id='header']/div[2]/div/div/div[2]/a");
    private static final By KidsFirstPhoneRuleArticleLink = By.xpath("//h2/a[contains(@title, 'Kids')]");
    private static final By KidsFirstPhoneFullArticle = By.xpath("//h2[contains(@role, 'heading')]");

    private static final Logger LOGGER = LogManager.getLogger(ExploreOption.class);

    public ExploreOption(WebDriver driver) {
        super(driver);
    }

    public ExploreOption userHoversMouseOnExploreButton() {
        ActOn.wait(driver, ExploreButton).waitForElementToBeVisible();
        ActOn.elements(driver, ExploreButton).mouseHover();
        LOGGER.debug("User hovers mouse on Explore button");
        return this;
    }

    public ExploreOption userHoversMouseOnWellbeingTab () {
        ActOn.wait(driver, WellbeingTab).waitForElementToBeVisible();
        ActOn.elements(driver, WellbeingTab).mouseHover();
        LOGGER.debug("User hovers mouse on Wellbeing tab");
        return this;
    }

    public ExploreOption userClicksOnWellbeingArticlesTab () {
        ActOn.wait(driver, WellbeingArticlesTab).waitForElementToBeVisible();
        ActOn.elements(driver, WellbeingArticlesTab).click();
        LOGGER.debug("User Clicks on Wellbeing Articles tab");
        return this;
    }

    public ExploreOption userClicksOnKidsFirstPhonesArticleLink () {
        ActOn.wait(driver, KidsFirstPhoneRuleArticleLink).waitForElementToBeVisible();
        ActOn.elements(driver, KidsFirstPhoneRuleArticleLink).click();
        return this;
    }

    public ExploreOption validateUserIsAbleToReadKidsFirstPhonesArticle() {
        ActOn.wait(driver, KidsFirstPhoneFullArticle).waitForElementToBeVisible();
        AssertThat.elementAssertions(driver, KidsFirstPhoneFullArticle);
        return this;
    }
}