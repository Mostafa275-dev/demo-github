import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandLing {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/frames");

        WebElement iframe01 = driver.findElement(By.xpath("//div[@id='frameWrapper']/iframe"));

        WebElement title = driver.findElement(By.cssSelector("[id='sampleHeading']"));
        System.out.println(title);
    }

}
