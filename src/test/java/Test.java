import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.assertj.core.api.Assertions.assertThat;

public class Test {

    WebDriver driver;

    @BeforeAll
    static void setDriver() {
        WebDriverManager.chromedriver().setup();
    }

    @BeforeEach
    void setUp() {
        driver = new ChromeDriver();
    }

    @AfterEach
    void tearDown() {
        driver.quit();
    }

    @ParameterizedTest
    @ValueSource(strings = {"Rozwiązania i usługi IT, inżynierii i BPO - Sii Polska"})
    @Tag("regresja")
    @Tag("sii")
    @DisplayName("Checking title for sii.pl")
    void checkTitleForSiiPl(String expectedTitle){
        driver.get("https://www.sii.pl");
        driver.manage().window().maximize();
        String actualTitle = driver.getTitle();
        assertThat(actualTitle).isEqualTo(expectedTitle);
    }

    @ParameterizedTest
    @ValueSource(strings = {"Onet – Jesteś na bieżąco"})
    @Tag("regresja")
    @Tag("onet")
    @DisplayName("Checking title for onet.pl")
    void checkTitleForOnetPl(String expectedTitle){
        driver.get("https://www.onet.pl");
        driver.manage().window().maximize();
        String actualTitle = driver.getTitle();
        assertThat(actualTitle).isEqualTo(expectedTitle);
    }

    @ParameterizedTest
    @ValueSource(strings = {"Kotuszkowo- blog o kotach"})
    @Tag("regresja")
    @Tag("kotuszkowo")
    @DisplayName("Checking title for kotuszkowo.pl")
    void checkTitleForKotuszkowoPl(String expectedTitle){
        driver.get("http://kotuszkowo.pl/");
        driver.manage().window().maximize();
        String actualTitle = driver.getTitle();
        assertThat(actualTitle).isEqualTo(expectedTitle);
    }

    @ParameterizedTest
    @ValueSource(strings = {"Filmweb - filmy takie jak Ty!"})
    @Tag("regresja")
    @Tag("filmweb")
    @DisplayName("Checking title for filmweb.pl")
    void checkTitleForFilmwebPl(String expectedTitle){
        driver.get("https://www.filmweb.pl/");
        driver.manage().window().maximize();
        String actualTitle = driver.getTitle();
        assertThat(actualTitle).isEqualTo(expectedTitle);
    }

    @ParameterizedTest
    @ValueSource(strings = {"WebDriver | Selenium"})
    @Tag("regresja")
    @Tag("selenium")
    @DisplayName("Checking title for selenium.dev")
    void checkTitleForSeleniumDev(String expectedTitle){
        driver.get("https://www.selenium.dev/documentation/en/webdriver/");
        driver.manage().window().maximize();
        String actualTitle = driver.getTitle();
        assertThat(actualTitle).isEqualTo(expectedTitle);
    }

}
