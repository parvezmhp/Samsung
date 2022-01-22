//package page_objects;
//
//import command_providers.ActOn;
//import io.cucumber.java.en_old.Ac;
//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//
//public class SignIn extends NavigationBar {
//
//    private static final By SignInButton = By.xpath("//a[contains(@class, 'gnb__login-btn')]");
//    private static final By SignIn = By.xpath("//a[contains(@class, 'gnb__utility-link')]");
//    private static final By Email = By.id("lblLgnPlnID");
//    private static final By Password = By.id("iptLgnPlnPD");
//    private static final By SignInTab = By.id("signInButton");
////            By.xpath("//*[@id='login']/span");
//    private static final By NotNowButton = By.id("btnNotNow");
////    private static final By ErrorMsg = By.xpath("//*[@id='__next']/div[2]/div/div[1]/div/div[2]/div/div");
//
//    private static final Logger LOGGER = LogManager.getLogger(SignIn.class);
//
//    public SignIn(WebDriver driver) {
//        super(driver);
//    }
//
//    public SignIn mouseHoversToSignInButton() {
//        ActOn.wait(driver, SignInButton).waitForElementToBeVisible();
//        ActOn.elements(driver, SignInButton).mouseHover();
//        LOGGER.debug("User hovers mouse on Sign In button");
//        return this;
//    }
//
//    public SignIn clicksOnSignIn() {
//        ActOn.wait(driver, SignIn).waitForElementToBeVisible();
//        ActOn.elements(driver, SignIn).click();
//        LOGGER.debug("User clicks on the Sign In from drop down menu");
//        return this;
//    }
//
//    public SignIn entersEmailAndPassword(String email, String password) {
//        ActOn.wait(driver, Email).waitForElementToBeVisible();
//        ActOn.elements(driver, Email).setValue(email);
//        ActOn.elements(driver, Password).setValue(password);
//        LOGGER.debug("User enters credentials to Sign In");
//        return this;
//    }
//
//    public SignIn clicksOnSignInTab() {
//        ActOn.wait(driver, SignInTab).waitForElementToBeVisible();
//        ActOn.elements(driver, SignInTab).click();
//        LOGGER.debug("User clicks on the SignIn tab");
//        return this;
//    }
//
//    public SignIn clicksOnNotNowButton() {
//        ActOn.wait(driver, NotNowButton).waitForElementToBeVisible();
//        ActOn.elements(driver, NotNowButton).click();
//        LOGGER.debug("User clicks on the NoT Now to skip Two steps verification");
//        return this;
//    }
//
//   }
//
//
