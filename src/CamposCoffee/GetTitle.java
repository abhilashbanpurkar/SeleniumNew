package CamposCoffee;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


public class GetTitle {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://camposcoffee.com/product/campos-superior-blend/");
        //driver.findElement(By.xpath("//button[@title='Close']")).click();
       driver.findElement(By.xpath("//a[@class='newsletter__close newsletter__trigger']")).click();
        driver.manage().window().maximize();
       /* Actions action = new Actions(driver);
        Thread.sleep(3000);
        WebElement Shop = driver.findElement(By.xpath("//a[normalize-space()='Shop']"));
        WebElement coffee = driver.findElement(By.xpath("//a[text()='Coffee']"));
        ;
        action.moveToElement(Shop).click().moveToElement(coffee).click()
                .build().perform();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[normalize-space()='Roma Espresso Blend']")).click();*/

        WebElement drpitemele = driver.findElement(By.xpath("//select [@class='pa_weight']"));
        Select drpitem = new Select(drpitemele);

        drpitem.selectByIndex(3);
        driver.findElement(By.xpath("//label[@for='wholebeans-true']//*[name()='svg']")).click();
        driver.findElement(By.xpath("//input[@id='subscription-false']")).click();
        driver.findElement(By.xpath("//a[@class='button add-to-cart__button button--primary']"));
    }
}
