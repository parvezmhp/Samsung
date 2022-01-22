//package step_definitions;
//
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;
//import org.openqa.selenium.WebDriver;
//import page_objects.HomePage;
//import page_objects.SignIn;
//
//public class SignInSteps {
//    private static final Logger LOGGER = LogManager.getLogger(SignInSteps.class);
//    WebDriver driver = Hooks.driver;
//
//    @Given("^User is on Home Page$")
//    public void userIsOnHomeForSignIn() {
//        new HomePage(driver)
//            .homePage();
//        LOGGER.info("User is on Home Page");
//}
//    @And("^User hovers mouse on Sign In button and clicks on Sign In from dropdown menu$")
//    public void userHoversMouseOnSignInButtonAndClicksOnSignIn() {
//        new SignIn(driver).mouseHoversToSignInButton().clicksOnSignIn();
//        LOGGER.info("User hovers mouse on Sign In button and clicks on Sign In from dropdown menu");
//    }
//
//    @When("^User enters Email \"(.+?)\" and password \"(.+?)\" and clicks on Sign In$")
//    public void userEntersCredentialsAndClicksOnSignInTab(String Email, String password) {
//        new SignIn(driver).entersEmailAndPassword();
//
//
//           }
//
//
//    @Then("^User will click on Not Now tab and will be signed in$")
//    public void user_navigated_to_home_page(String title) throws InterruptedException {
//        new HomePage(driver)
//                .validateTitle(title);
//        LOGGER.info("User See The Home Page Title");
//    }
//
//
////    @When("^User clicked on Login Use See  Error Msg")
////    public void userSeeErrorMsg(String errorMsg) {
////        new SignIn(driver)
////                .validateErrorMsg(errorMsg);
////        LOGGER.info("User See The Error Msg");
////    }
//
//}
