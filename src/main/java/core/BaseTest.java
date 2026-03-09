package core;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import utils.ConfigLoader;

public abstract class BaseTest {

    @BeforeMethod(alwaysRun = true)
    public void setUp() {
        Configuration.browser = ConfigLoader.get("browser", "chrome");
        Configuration.baseUrl = ConfigLoader.get("base.url", "");
        Configuration.browserSize = ConfigLoader.get("browser.size", "390x844");
        Configuration.headless = Boolean.parseBoolean(ConfigLoader.get("headless", "false"));
        Configuration.timeout = Long.parseLong(ConfigLoader.get("timeout", "10000"));
        Configuration.pageLoadTimeout = Long.parseLong(ConfigLoader.get("page.load.timeout", "30000"));

        if (SelenideLogger.hasListener("AllureSelenide")) {
            SelenideLogger.removeListener("AllureSelenide");
        }
        SelenideLogger.addListener(
                "AllureSelenide",
                new AllureSelenide()
                        .screenshots(true)
                        .savePageSource(true)
        );
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown() {
        Selenide.closeWebDriver();
    }
}
