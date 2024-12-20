import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

// Status Code 400 - Broken Links
//Status Code 400 less than 400 Broken Links

public class BrokenLinksExample {
    public static void main(String[] args) throws IOException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://camposcoffee.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        int noofBrokenLinks = 0;
        // capture all the element from the links
        List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println("Total Number of Links:" + links.size());

        for (WebElement linkElement : links) {
            String hrefvalue = linkElement.getAttribute("href");
            if (hrefvalue == null || hrefvalue.isEmpty()) {

                System.out.println("href value is null or empty so Not possible to check");
                continue;
            }
            // hit url to Server
            try {
                URL linkURL = new URL(hrefvalue); // converted href value from String to URL Format
                HttpURLConnection conn = (HttpURLConnection) linkURL.openConnection();// open connection to Server
                conn.connect();//connect to server and sent request to the server


                if (conn.getResponseCode() > 400) {
                    System.out.println(hrefvalue + "===>   Broken Link");
                    noofBrokenLinks++;
                } else {
                    System.out.println(hrefvalue + "===> NOt a Broken Link");
                }
            } catch (Exception e) {

            }
        }
        System.out.println("Number of Broken Links :"+ noofBrokenLinks );
    }
}
