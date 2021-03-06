package Day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class FindChildren {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/muberracavli/Desktop/TechnoStudy/chrome driver/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.seleniumeasy.com/test/input-form-demo.html");
        // finds direct children only
        List<WebElement> directChildren = driver.findElements( By.cssSelector( "fieldset > div" ) );
        System.out.println( "directChildren:" + directChildren.size() );
        for(WebElement e : directChildren) {
            System.out.println( e.getAttribute( "class" ) );
        }
        System.out.println( "---------------------------------------" );
        // finds general children and grandchildren
        List<WebElement> generalChildren = driver.findElements( By.cssSelector( "fieldset div" ) );
        System.out.println( "generalChildren:" + generalChildren.size() );
        for(WebElement e : generalChildren) {
            System.out.println( e.getAttribute( "class" ) );
        }
        driver.quit();
    }
    }

