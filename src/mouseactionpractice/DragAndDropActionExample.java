package mouseactionpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class DragAndDropActionExample {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
        driver.manage().window().maximize();

        Actions act = new Actions(driver);
      WebElement rome = driver.findElement(By.xpath("//div[@id='box6']"));
        WebElement italy = driver.findElement(By.xpath("//div[@id='box106']"));

        // drag and Drop
        act.dragAndDrop(rome,italy).perform();
        

    }
}

