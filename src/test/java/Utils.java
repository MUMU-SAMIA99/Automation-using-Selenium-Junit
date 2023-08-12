import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class Utils {
    public static void doScroll(WebDriver driver){
        JavascriptExecutor js= (JavascriptExecutor) driver;
        js.executeScript("Window.ScrollBy(0,Document.Body.ScrollHeight)");
    }
}
