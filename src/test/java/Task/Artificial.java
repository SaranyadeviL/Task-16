package Task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Artificial {
    public static void main(String[] args) {
        // initialize the driver
        ChromeDriver driver = new ChromeDriver();

        // maximize the window
        driver.manage().window().maximize();

        //navigate the browser
        driver.get("https://www.wikipedia.org");

        //Locate the search input field
        WebElement searchInput = driver.findElement(By.id("searchInput"));

        //search query
        searchInput.sendKeys("Artificial Intelligence");

        //Locate and click the search button
        WebElement Button = driver.findElement(By.xpath("//button[@type='submit']"));
        Button.click();

        //wait for search results to load
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement History = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@id='History']")));
        History.click();

        //wait for the history to visible
        WebElement hSection = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("History")));
        //print the title of the history section
        System.out.println("Section Title:" + hSection.getText());
    driver.quit();

    }
}
