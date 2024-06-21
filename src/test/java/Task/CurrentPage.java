package Task;

import org.openqa.selenium.firefox.FirefoxDriver;

public class CurrentPage {
    public static void main(String[] args) {

        // initiate the web driver
        FirefoxDriver driver = new FirefoxDriver();
        //maximize the window
        driver.manage().window().maximize();
        //navigate the window
        driver.get("https://www.google.com");
        //get currentUrl
        String url = driver.getCurrentUrl();
        System.out.println(url);
        //reload the page
        driver.navigate().refresh();
        //close the browser
        driver.quit();

    }
}
