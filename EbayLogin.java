


import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;


public class EbayLogin {
  private WebDriver driver;

  @BeforeClass(alwaysRun = true)
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testEbay(){
      openSite();

      driver.findElement(By.linkText("register")).click();

      fillFirstName();

      fillLastName();

      fillEmailField();

      fillPasswordField();
  }


    public void fillPasswordField() {
        driver.findElement(By.id("PASSWORD")).click();
        driver.findElement(By.id("PASSWORD")).clear();
        driver.findElement(By.id("PASSWORD")).sendKeys("kobe24");
    }

    public void fillEmailField() {
        driver.findElement(By.id("email")).click();
        driver.findElement(By.id("email")).clear();
        driver.findElement(By.id("email")).sendKeys("lipsky17+1@gmail.com");
    }

    public void fillLastName() {
        driver.findElement(By.id("lastname")).click();
        driver.findElement(By.id("lastname")).clear();
        driver.findElement(By.id("lastname")).sendKeys("Lipsky");
    }

    public void fillFirstName() {
        driver.findElement(By.id("firstname")).click();
        driver.findElement(By.id("firstname")).clear();
        driver.findElement(By.id("firstname")).sendKeys("Dmitry");
    }

    public void openSite() {
        driver.get("https://www.ebay.com/");
    }

    @AfterClass(alwaysRun = true)
  public void tearDown() {
    driver.quit();
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }
}
