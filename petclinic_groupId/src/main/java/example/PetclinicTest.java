package example;
import java.io.File;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
   public class PetclinicTest {
     private WebDriver driver;
       @Test
       public void testPetClinic() {
         driver.get("http://localhost:8888/petclinic/");
         String title = driver.getTitle();
         Assert.assertTrue(title.contains("a Spring Frameworkk"));
       }
       @BeforeTest
       public void beforeTest() {
         File file = new File("geckodriver");
         System.setProperty("webdriver.gecko.driver", file.getAbsolutePath());
         
         
        driver = new FirefoxDriver();

       }
       @AfterTest
       public void afterTest() {
         driver.quit();
}
}
