package project1;
/**
 * Project-1 - Project Name: com-nopcommerce
 * BaseUrl = https://demo.nopcommerce.com/login?returnUrl=%2F
 * 1. Setup Chrome browser
 * 2. Open URL
 * 3. Print the title of the page
 * 4. Print the current url
 * 5. Print the page source
 * 6. Enter the email to email field
 * 7. Enter the password to password field
 * 8. Close the browser
 */


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by Jay Vaghani
 * Project-1 - Project Name: com-nopcommerce
 * BaseUrl = https://demo.nopcommerce.com/login?returnUrl=%2
 */
public class ChromeBrowserTesting {

    public static void main(String[] args) {
                String baseUrl = "https://demo.nopcommerce.com/login?returnUrl=%2F";
        // we are launching the Chrome browser
        WebDriver driver = new ChromeDriver();
        // we are opening the Url into browser
        driver.get(baseUrl);
        // maximize the size of window
        driver.manage().window().maximize();
        // get the title of the page
        String title = driver.getTitle();
        System.out.println("Title of the page :"+title);
        // get current Url
        driver.getCurrentUrl();
        System.out.println("Current Url is : " +driver.getCurrentUrl());
        // print the page source
        System.out.println("Page source is : " +driver.getPageSource());
        //Enter the email to email field
        WebElement emailField = driver.findElement(By.id("Email"));
        emailField.sendKeys("Khilenmodi2003@yahoo.com");
        // Enter the password to password field
        WebElement passwordField = driver.findElement(By.id("Password"));
        passwordField.sendKeys("Maharaj1234");
        // closing the browser
        driver.close();



    }

}
