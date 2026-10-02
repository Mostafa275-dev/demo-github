import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElement {
    public static void main(String[] args){
        WebDriver driver = new ChromeDriver();
        driver.get("https://ebay.com");

        //WebElement a =driver.findElement(By.xpath("//input[@title='Search']"));
    }

}
