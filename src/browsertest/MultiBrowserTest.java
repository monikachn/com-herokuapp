package browsertest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultiBrowserTest {
    static String browser = "FireFox";
    static WebDriver driver;
    static String baseUrl = "http://the-internet.herokuapp.com/login";

    public static void main(String[] args) {
        if (browser.equalsIgnoreCase("Chrome")) {
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("FireFox")) {
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("Edge")) {
            driver = new EdgeDriver();
        } else {
            System.out.println("Wrong Browser name");
        }
        //Open URL
        driver.get(baseUrl);
        // Maximise the browser
        driver.manage().window().maximize();
        // Get the title of page
        System.out.println(driver.getTitle());
        // Get the current URL
        System.out.println("Current URL is: " + driver.getCurrentUrl());
        // Get the page source
        System.out.println("Page Source : " + driver.getPageSource());
        // Enter the email to email field
        WebElement emailField = driver.findElement(By.name("username"));
        emailField.sendKeys("Abc@gmail.com");
        // Enter the password to password field
        WebElement passField = driver.findElement(By.name("password"));
        passField.sendKeys("123Prime");
        // Close the browser
         driver.close();
    }
}
