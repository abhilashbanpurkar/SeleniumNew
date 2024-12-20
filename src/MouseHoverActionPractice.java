import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class MouseHoverActionPractice {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://demo.opencart.com/");
        driver.manage().window().maximize();

        WebElement Desk = driver.findElement(By.xpath("//a[text()='Desktops']"));
        WebElement Mac = driver.findElement(By.xpath("//a[normalize-space()='Mac (1)']"));

        // Mouse Hover
        Actions act =new Actions(driver);
        act.moveToElement(Desk).moveToElement(Mac).click().build().perform();

    }
}