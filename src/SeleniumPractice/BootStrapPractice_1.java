package SeleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BootStrapPractice_1 {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.get("https://upsc.gov.in/");
        driver.manage().window().maximize();

        WebElement dropDownElement = driver.findElement(By.xpath("//a[normalize-space()='Recruitment']"));

        Thread.sleep(5000);
        Select sel = new Select(dropDownElement); // Syntax for Accessing DropDown
        List<WebElement> allElement = sel.getOptions();

        for (WebElement e : allElement) {
            System.out.println(e.getText());

        }
        driver.close();
    }
}


