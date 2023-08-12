import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)

public class MyJunitTesting {
     WebDriver driver;
     @BeforeAll
     public void setup(){
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

    }
    @Test
    public void getTitle(){
         driver.get("https://www.digitalunite.com/practice-webform-learners");
         String actual_title=driver.getTitle();
         String expected_title="Practice webform for learners";
         System.out.println(actual_title);
         Assertions.assertTrue(actual_title.contains(expected_title));

     }
     @Test
     public void checkIfImgExist(){
         driver.get("https://www.digitalunite.com/practice-webform-learners");
         boolean isExists=driver.findElement(By.cssSelector("[src=\"/sites/default/files/group-3%403x.jpg\"]")).isDisplayed();
         Assertions.assertTrue(isExists);
     }
     @Test
     public void GiveName(){
         driver.get("https://www.digitalunite.com/practice-webform-learners");
         List<WebElement> textBoxElement=driver.findElements(By.id("edit-name"));
         textBoxElement.get(0).sendKeys("samia");
             driver.findElement(By.id("edit-submit"));
     }
    @Test
   public void GivePhnNO(){
        driver.get("https://www.digitalunite.com/practice-webform-learners");
        driver.findElements(By.xpath("//input[@id='edit-number']"));
        List<WebElement> textBoxElement=driver.findElements(By.id("edit-number"));
        textBoxElement.get(0).sendKeys("58532655224");
         driver.findElement(By.id("edit-submit"));
   }
    @Test
    public void DateOfBirth(){
        driver.get("https://www.digitalunite.com/practice-webform-learners");
        driver.findElements(By.xpath("//input[@id='edit-date']"));
        List<WebElement> textBoxElement=driver.findElements(By.id("edit-date"));
        textBoxElement.get(0).sendKeys("07/03/2001");
        driver.findElement(By.id("edit-submit"));

    }
    @Test
    public void Email(){
        driver.get("https://www.digitalunite.com/practice-webform-learners");
        driver.findElements(By.id("edit-email"));
        List<WebElement> textBoxElement=driver.findElements(By.id("edit-email"));
        textBoxElement.get(0).sendKeys("amara@gmail.com");
        driver.findElement(By.id("edit-submit"));

       // Utils.doScroll(driver);
    }
    @Test
    public void AboutYourself(){
        driver.get("https://www.digitalunite.com/practice-webform-learners");
        driver.findElements(By.id("edit-tell-us-a-bit-about-yourself-"));
        List<WebElement> textBoxElement=driver.findElements(By.id("edit-tell-us-a-bit-about-yourself-"));
        textBoxElement.get(0).sendKeys("hi, i am a student. i want to learn something new.");
        driver.findElement(By.id("edit-submit"));

       // Utils.doScroll(driver);
    }

    @AfterAll
     public void closeDriver(){
         driver.close();
     }

}
