package Day7;
// click on the "Autocloseable success message" button
// then validate that "I'm an autocloseable success  message. I will hide in 5 seconds."
// disappears, wait at least 10 seconds for it to disappear

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Task4 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/muberracavli/Desktop/TechnoStudy/chrome driver/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.seleniumeasy.com/test/bootstrap-alert-messages-demo.html");
        driver.findElement( By.id("autoclosable-btn-success") ).click();
        WebDriverWait wait = new WebDriverWait(driver, 3);

        try {
            wait.until( ExpectedConditions.invisibilityOfElementLocated(By.className( "alert-autocloseable-success" )));
            System.out.println("Success!");
        } catch(Exception e) {
            System.out.println("Failure!");
        }

        driver.quit();
    }

    }

