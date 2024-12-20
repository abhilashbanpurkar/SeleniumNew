import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FindBookInaScrollingPage {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

       driver.get("https://www.booksbykilo.in/new-books");
        driver.manage().window().maximize();

        Actions act = new Actions(driver);
    }
}
