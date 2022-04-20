import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.logevents.SelenideLogger;
import config.ProjectProvider;
import helpers.AllureAttach;
import helpers.DriverSettings;
import helpers.DriverUtils;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;

public class TestBase {

    @BeforeAll
    static void setup() {
        Selenide.clearBrowserCookies();
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
        DriverSettings.configure();
    }

    @AfterEach
    public void afterTest() {

        String sessionId = DriverUtils.getSessionId();

        AllureAttach.addScreenshotAs("Last screenshot");
        AllureAttach.addPageSource();
        AllureAttach.addBrowserConsoleLogs();
        Selenide.closeWebDriver();

        if (ProjectProvider.isVideoOn()) {
            AllureAttach.addVideo(sessionId);
        }
    }
    }

