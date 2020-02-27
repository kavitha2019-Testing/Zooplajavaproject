package Automationpractice;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class OpenAccoount {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:/Users/kavitha/Desktop/softwareFolder/chromedriver_win32/chromedriver.exe");
        //System.setProperty("webdriver.chrome.driver" ,"./Drivers/chromedriver.exe" );
        ChromeOptions options = new ChromeOptions();

        options.setPageLoadStrategy(PageLoadStrategy.NONE);
        options.addArguments("enable-automation");
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-infobars");
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--disable-browser-side-navigation");
        options.addArguments("--disable-gpu");
        // driver = new ChromeDriver(options);
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("http://automationpractice.com/index.php?");
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.MILLISECONDS);
        driver.manage().timeouts().pageLoadTimeout(50,TimeUnit.MILLISECONDS);
        Thread.sleep(10000);
        driver.findElement(By.xpath("//a[@title='Log in to your customer account']")).click();
        Thread.sleep(5000);
        System.out.println("Sign in button clicked");
        // TO CLICK BUTTON USING JAVASCRIPT EXECUTOR
        WebElement lgnbutton =  driver.findElement(By.xpath("//input[@name='email_create']"));
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].click;",lgnbutton);
        System.out.println(" Email button clicked");

        lgnbutton.sendKeys("kavitha_abburi@yahoo.com");
        System.out.println("Email  entered successfully");

        driver.findElement(By.xpath("//i[@class='icon-user left']")).click();
       System.out.println(" create account button clicked");
       Thread.sleep(5000);
        driver.findElement(By.xpath("//input[@id='id_gender2']")).click();
        System.out.println("Mrs radio button clicked");
       // ENTERING DETAILS
        driver.findElement(By.xpath("//form[@id='account-creation_form']//div//div//label//div//span//input[@id='id_gender1']")).click();
        System.out.println("radio button clicked");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//input[@name='customer_firstname']")).sendKeys("Lakshmi");
        System.out.println("Name entered successfully");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//input[@name='customer_lastname']")).sendKeys("Malineni");
        System.out.println("LastName entered successfully");
        driver.findElement(By.xpath("//input[@name='passwd']")).sendKeys("Malineni1");
        System.out.println("password entered successfully");

//      SELECTING DATE BY USING SELECT COMMAND FROM DROP DOWN LIST
        Select dates = new Select(driver.findElement(By.xpath("//select[@id='days']")));
                dates.selectByValue("16");
               // dates.selectByIndex(16);
        System.out.println("day selected");
        Select month = new Select(driver.findElement(By.xpath("//select[@id='months']")));
        month.selectByValue("3");
        month.selectByIndex(3);
        System.out.println("month selected");
        Select year = new Select(driver.findElement(By.xpath("//select[@id='years']")));
        year.selectByValue("1982");
       // year.selectByIndex(3);
        System.out.println("year selected");

    }
}

//