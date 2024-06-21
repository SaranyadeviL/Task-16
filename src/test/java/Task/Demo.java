package Task;

import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
    public static void main(String[] args) {
        // initialize the web driver
        ChromeDriver driver = new ChromeDriver();

        // maximize window
        driver.manage().window().maximize();

        // navigate the window
        driver.get("https://www.demoblaze.com");

        // get the title of the page
        String pageTitle = driver.getTitle();

        //verify the tile of the page
        if(pageTitle.equals("STORE")) {
            System.out.println("Page landing on correct website");
        } else {
            System.out.println("Page not landing on correct website");
        }
        //close the browser
        driver.quit();


    }


}
