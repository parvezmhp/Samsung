package page_objects;

import command_providers.ActOn;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import utilities.ReadConfigFiles;

public class HomePage {
    private static final Logger LOGGER = LogManager.getLogger(HomePage.class);

    public WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public HomePage homePage() {
        ActOn.browser(driver).openBrowser(ReadConfigFiles.getPropertyValues("SamsungUrl"));
        return this;
    }

    public void validateTitle(String title) {
    }
}
