package page_objects;

import command_providers.ActOn;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NavigationBar {
    private static final By SamsungLogo = By.id("ae-skip-to-anchor");
    private static final Logger LOGGER = LogManager.getLogger(NavigationBar.class);

    public WebDriver driver;

    public NavigationBar(WebDriver driver) {
        this.driver = driver;
    }

    //Navigate to Homepage
    public HomePage NavigateToHome() {
        ActOn.elements(driver, SamsungLogo).click();
        return new HomePage(driver);
    }
}
