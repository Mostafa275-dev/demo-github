import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class TabHandling {
    public static void main(String[] args){
        WebDriver driver = new ChromeDriver();
        driver.get("https://ebay.com");

        WebElement product = driver.findElement(By.xpath("//div[@class='absolute bg-neutral-800 inset-0 opacity-5 hover:opacity-10 [transition:opacity_var(--motion-duration-short-3)_var(--motion-easing-continuous)] rounded-100']"));
        product.click();

        String currentTab = driver.getWindowHandle();
        System.out.println(driver.getTitle());
        Set<String> allTaps =driver.getWindowHandles();

        for (String a : allTaps){
            if (a != currentTab){
                driver.switchTo().window(a);
            }
        }
        System.out.println(driver.getTitle());
    }
}

