import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class TestStart {
    WebDriver driver;

    @BeforeEach
    public void setDriver(){
        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();
    }

    @AfterEach
    public void driveQuit(){
        driver.close();
        driver.quit();
    }

    @Test
    public void mainTest(){
        driver.get("https://www.google.pl/");
        String entryURL = "https://www.google.pl/";
        Assertions.assertEquals(entryURL,driver.getCurrentUrl(),"wrong side");
    }
}
