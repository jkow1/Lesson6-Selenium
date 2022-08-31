import io.github.bonigarcia.wdm.WebDriverManager;
import logger.LogbackLoggerHandler;
import logger.TestResultLoggerExtension;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.assertj.core.api.Assertions.assertThat;

@TestMethodOrder(MethodOrderer.MethodName.class)
@ExtendWith(TestResultLoggerExtension.class)
public class WebsitesTitleTests {

    WebDriver driver;
    private static Logger logger = LoggerFactory.getLogger(WebsitesTitleTests.class);
    private static String methodName;

    @BeforeAll
    static void setDriver() {
        methodName = (new Throwable().getStackTrace())[0].getMethodName();
        LogbackLoggerHandler.logMethodStart(logger, methodName);
        WebDriverManager.chromedriver().setup();
        LogbackLoggerHandler.logMethodEnd(logger, methodName);
    }

    @BeforeEach
    void setUp() {
        methodName = (new Throwable().getStackTrace())[0].getMethodName();
        LogbackLoggerHandler.logMethodStart(logger, methodName);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        LogbackLoggerHandler.logMethodEnd(logger, methodName);
    }

    @AfterEach
    void tearDown() {
        methodName = (new Throwable().getStackTrace())[0].getMethodName();
        LogbackLoggerHandler.logMethodStart(logger, methodName);
        driver.quit();
        LogbackLoggerHandler.logMethodEnd(logger, methodName);
    }

    @ParameterizedTest(name = "Checking title for sii.pl")
    @DisplayName("Checking title for sii.pl")
    @ValueSource(strings = {"Rozwiązania i usługi IT, inżynierii i BPO - Sii Polska"})
    @Tag("regresja")
    @Tag("sii")
    void checkTitleForSiiPl(String expectedTitle) {
        methodName = (new Throwable().getStackTrace())[0].getMethodName();
        LogbackLoggerHandler.logMethodStart(logger, methodName);
        driver.get("https://www.sii.pl");
        String actualTitle = driver.getTitle();
        LogbackLoggerHandler.logAssertedValues(logger, actualTitle, expectedTitle);
        assertThat(actualTitle).isEqualTo(expectedTitle);
        LogbackLoggerHandler.logMethodEnd(logger, methodName);
    }

    @ParameterizedTest(name = "Checking title for onet.pl")
    @ValueSource(strings = {"Onet – Jesteś na bieżąco"})
    @Tag("regresja")
    @Tag("onet")
    @DisplayName("Checking title for onet.pl")
    void checkTitleForOnetPl(String expectedTitle) {
        methodName = (new Throwable().getStackTrace())[0].getMethodName();
        LogbackLoggerHandler.logMethodStart(logger, methodName);
        driver.get("https://www.onet.pl");
        String actualTitle = driver.getTitle();
        LogbackLoggerHandler.logAssertedValues(logger, actualTitle, expectedTitle);
        assertThat(actualTitle).isEqualTo(expectedTitle);
        LogbackLoggerHandler.logMethodEnd(logger, methodName);
    }

    @ParameterizedTest(name = "Checking title for kotuszkowo.pl")
    @ValueSource(strings = {"Kotuszkowo- blog o kotach"})
    @Tag("regresja")
    @Tag("kotuszkowo")
    @DisplayName("Checking title for kotuszkowo.pl")
    void checkTitleForKotuszkowoPl(String expectedTitle) {
        methodName = (new Throwable().getStackTrace())[0].getMethodName();
        LogbackLoggerHandler.logMethodStart(logger, methodName);
        driver.get("http://kotuszkowo.pl/");
        String actualTitle = driver.getTitle();
        LogbackLoggerHandler.logAssertedValues(logger, actualTitle, expectedTitle);
        assertThat(actualTitle).isEqualTo(expectedTitle);
        LogbackLoggerHandler.logMethodEnd(logger, methodName);
    }

    @ParameterizedTest(name = "Checking title for filmweb.pl")
    @ValueSource(strings = {"Filmweb - filmy takie jak Ty!"})
    @Tag("regresja")
    @Tag("filmweb")
    @DisplayName("Checking title for filmweb.pl")
    void checkTitleForFilmwebPl(String expectedTitle) {
        methodName = (new Throwable().getStackTrace())[0].getMethodName();
        LogbackLoggerHandler.logMethodStart(logger, methodName);
        driver.get("https://www.filmweb.pl/");
        String actualTitle = driver.getTitle();
        LogbackLoggerHandler.logAssertedValues(logger, actualTitle, expectedTitle);
        assertThat(actualTitle).isEqualTo(expectedTitle);
        LogbackLoggerHandler.logMethodEnd(logger, methodName);
    }

    @ParameterizedTest(name = "Checking title for selenium.dev")
    @ValueSource(strings = {"WebDriver | Selenium"})
    @Tag("regresja")
    @Tag("selenium")
    @DisplayName("Checking title for selenium.dev")
    void checkTitleForSeleniumDev(String expectedTitle) {
        methodName = (new Throwable().getStackTrace())[0].getMethodName();
        LogbackLoggerHandler.logMethodStart(logger, methodName);
        driver.get("https://www.selenium.dev/documentation/en/webdriver/");
        String actualTitle = driver.getTitle();
        LogbackLoggerHandler.logAssertedValues(logger, actualTitle, expectedTitle);
        assertThat(actualTitle).isEqualTo(expectedTitle);
        LogbackLoggerHandler.logMethodEnd(logger, methodName);
    }
}
