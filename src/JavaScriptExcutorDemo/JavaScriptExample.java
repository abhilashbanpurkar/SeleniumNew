package JavaScriptExcutorDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class JavaScriptExample {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();
        WebElement inputbox = driver.findElement(By.xpath("//input[@id ='name']"));

        // For Sending Keys to input Box
        JavascriptExecutor js = (JavascriptExecutor) driver; // Upcasting
        js.executeScript("arguments[0].setAttribute('Value','Ram')", inputbox);

        // for Clicking Radio Button- alternate of Click(()

        WebElement radiobtn = driver.findElement(By.xpath("//input[@id='male']"));
        js.executeScript("arguments[0].click()", radiobtn);

        //js.executeScript("window.scrollBy(0,3000)","");
        //System.out.println(js.executeScript("return window.pageYOffset;"));

        //Scroll page till element is visible

      /* WebElement ele= driver.findElement(By.xpath("//a[normalize-space()='merrymoonmary'] "));
        js.executeScript("arguments[0].scrollIntoView();",ele);
        System.out.println(js.executeScript("return window.pageYOffset;"));

       */

        // Scroll Till End of the Page
       /* js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
        System.out.println(js.executeScript("return window.pageYOffset;"));*/

        // Set Zoom level using java script to 50%
        js.executeScript("document.body.style.zoom='80%'");

        // Set Zoom level using java script to 80%
        js.executeScript("document.body.style.zoom='50%'");

    }
}

