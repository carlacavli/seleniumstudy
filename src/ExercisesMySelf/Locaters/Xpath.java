package ExercisesMySelf.Locaters;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {
    public static void main(String[] args) {
        /*
        absolute xpath is finding an absolute location of the element but if the html is changed then this will not work
        using single slash /

        relative xpath is you can strat finding from the middle of the page even though html change this will work
        using double slash //

        what is differences ; single slash for absolute xpath , html is chaged not work but relative is works using double slash
        xpath types are ;
        basic xpath
        contains
        text()
        child parent
        parent child
        following - siblings ::
        preceding - siblings ::

         */

        System.setProperty("webdriver.chrome.driver", "/Users/muberracavli/Desktop/TechnoStudy/chrome driver/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get( "https://demoqa.com/accordion/" );


    }
}
