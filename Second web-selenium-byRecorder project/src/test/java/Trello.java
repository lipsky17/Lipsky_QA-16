import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static org.testng.Assert.fail;

public class Trello {
    private WebDriver driver;

    @BeforeClass(alwaysRun = true)
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @Test
    public void testTrello() {
        //openSite
        openSite();

        driver.findElement(By.xpath("//*[@href='/signup']")).click();

        fillNameField();

        fillEmailField();

        fillPasswordField();

        clickOnSignUpButton();
    }

    public void clickOnSignUpButton() {
        driver.findElement(By.id("signup")).click();
    }

    public void fillPasswordField() {
        driver.findElement(By.id("password")).click();
        driver.findElement(By.id("password")).clear();
        driver.findElement(By.id("password")).sendKeys("12345678");
    }

    public void fillEmailField() {
        driver.findElement(By.id("email")).click();
        driver.findElement(By.id("email")).clear();
        driver.findElement(By.id("email")).sendKeys("lipsky17+4@gmail.com");
    }

    public void fillNameField() {
        driver.findElement(By.id("name")).click();
        driver.findElement(By.id("name")).clear();
        driver.findElement(By.id("name")).sendKeys("Dmitry");
    }

    public void openSite() {
        driver.get("https://trello.com/");
    }

    @AfterClass(alwaysRun = true)
    public void tearDown()throws Exception {
        //Thread.sleep(3000);
        driver.quit();
    }

    private boolean isElementPresent(By locator) {
        try {
            driver.findElement(locator);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

}
