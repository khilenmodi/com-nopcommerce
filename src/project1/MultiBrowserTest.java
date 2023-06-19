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
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultiBrowserTest{

    static String browser = "Chrome";

    static String baseUrl = "https://demo.nopcommerce.com/login?returnUrl=%2F";

    static WebDriver driver;

    public static void main(String[] args) {

            if(browser.equalsIgnoreCase("Edge")){
                    driver = new EdgeDriver();
            } else if (browser.equalsIgnoreCase("Chrome")) {
                driver = new ChromeDriver();
            } else if (browser.equalsIgnoreCase("Firefox")) {
                driver = new FirefoxDriver();
            } else  {
                System.out.println("Invalid browser name");
            }

            driver.get(baseUrl);
            driver.manage().window().maximize();
            // get the title of the web page
        System.out.println("Title of the page :" + driver.getTitle());
            // get the source of the page
        System.out.println("Page of the source :" + driver.getPageSource());
            // get the current Url
        System.out.println("Current Url is :" + driver.getCurrentUrl());
            // enter the email address to emailField
        WebElement emailFiled = driver.findElement(By.id("Email"));
        emailFiled.sendKeys("Khilenmodi2003@yahoo.com");
        // enter the password to passwordField
        WebElement passwordField = driver.findElement(By.id("Password"));
        passwordField.sendKeys("Maharaj1234");
        // closing the browser
        driver.close();

    }
}
