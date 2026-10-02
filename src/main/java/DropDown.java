import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class DropDown {
    public static void main(String[] args) {
            WebDriver driver = new ChromeDriver();
            driver.get("https://ebay.com");
            driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
            WebElement dropdown = driver.findElement(By.xpath("//select[@id='gh-cat']"));
            Select select = new Select(dropdown);
            driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
            //Books is Index 4
            select.selectByIndex(4);
        }
    }

