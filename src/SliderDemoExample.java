import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SliderDemoExample {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
        driver.manage().window().maximize();

        Actions act = new Actions(driver);
 // Min Slider
        WebElement min_slider = driver.findElement(By.xpath("//div[@class='price-range-block']//span[1]"));
        min_slider.getLocation();
        System.out.println("Location of the minimum slider:" + min_slider.getLocation()); //x 86 y 233

        act.dragAndDropBy(min_slider,50,233).perform();

        System.out.println("Location of the after moving slider:" + min_slider.getLocation()); //x 86 y 233

        // Max Slider

        WebElement max_slider = driver.findElement(By.xpath("//span[2]"));
        min_slider.getLocation();
        System.out.println("Location of the maximum slider:" + max_slider.getLocation()); //x 544 y 289

       act.dragAndDropBy(max_slider,-70,289).perform();

     System.out.println("Location of the after moving slider:" + max_slider.getLocation());


    }
}
