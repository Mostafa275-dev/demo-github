import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("http://demo.guru99.com/test/simple_context_menu.html");
        Actions actions = new Actions(driver);
        //Double Click.
        actions.doubleClick(driver.findElement(By.xpath("//button[@ondblclick='myFunction()']"))).perform();

    }
}
