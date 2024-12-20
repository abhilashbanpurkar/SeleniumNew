package mouseactionpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


import java.time.Duration;

public class MouseActionJioMartSolution {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.jiomart.com/");
        driver.manage().window().maximize();

        WebElement Electronics = driver.findElement(By.xpath("//a[text()='Electronics']"));
        WebElement Mob_Tab = driver.findElement(By.xpath("//a[@id='nav_link_757']"));
        WebElement Mobiles = driver.findElement(By.xpath("//a[@ id='nav_level3_32118']"));

        Actions act = new Actions(driver);
        act.moveToElement(Electronics)
                .moveToElement(Mob_Tab)
                .moveToElement(Mobiles)
                .click()
                .build().perform();


    }
}