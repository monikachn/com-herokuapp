package browsertest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

/**
 * BaseUrl:http://the-internet.herokuapp.com/login
 * 1. Setup chrome browser
 * 2. Open URL
 * 3. Print the title of the page
 * 4. Print the current url
 * 5. Print the page source
 * 6. Enter the email to email field
 * 7. Enter the password to password field
 * 8. Close the browser
 */
public class ChromeBrowserTest {
    public static void main(String[] args) {
        String baseUrl="http://the-internet.herokuapp.com/login";

        // launch the chrome browser
        WebDriver drive = new ChromeDriver();// responsible for open browser

        // open the url into browser
        drive.get(baseUrl);
        String title= drive.getTitle();
        System.out.println(title);

        // we give implicit time to waiting driver
        drive.manage().timeouts().implicitlyWait(Duration.ofSeconds(90));
        // get the current Url
        drive.getCurrentUrl();

        // print current url
        System.out.println("Current Url :" +drive.getCurrentUrl());
        // Print Current Url
        System.out.println("Page source :"+drive.getPageSource());

        // find the emailField
        WebElement emailField =drive.findElement(By.name("username"));
        emailField.sendKeys("Abc@gmail.com");
        WebElement passField = drive.findElement(By.name("password"));
        passField.sendKeys("123Prime");

        // Close the browser
        drive.close();





    }
}
