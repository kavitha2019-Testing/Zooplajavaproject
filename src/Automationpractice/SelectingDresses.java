package Automationpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class SelectingDresses {
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
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("http://automationpractice.com/index.php?");
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.MILLISECONDS);
        driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.MILLISECONDS);
        Thread.sleep(5000);
        //SELECTING  WOMEN AND  T -SHIRTS
        driver.findElement(By.xpath("//div[@id='block_top_menu']//ul//li//a[@title='Women']")).click();
        System.out.println("Women icon selected");
        Thread.sleep(20000);
        driver.findElement(By.xpath("//a[@title='Return to Home']")).click();
        System.out.println("Return home page selected");
        Thread.sleep(15000);
        driver.findElement(By.xpath("//div[@id='block_top_menu']//ul//li[3]//a[@title='T-shirts']")).click();
        System.out.println("T-shirts icon selected");
        Thread.sleep(10000);
        driver.findElement(By.xpath("//div[@id='uniform-layered_id_attribute_group_1']")).click();
        Boolean b1 = driver.findElement(By.xpath("//div[@id='uniform-layered_id_attribute_group_1']")).isEnabled();
        System.out.println("small size selected : " + b1);
        Thread.sleep(10000);
        driver.findElement(By.xpath("//div[@id='uniform-layered_id_attribute_group_2']")).click();
        Boolean b2 = driver.findElement(By.xpath("//div[@id='uniform-layered_id_attribute_group_2']")).isDisplayed();
        System.out.println(" Medium size selected:" + b2);
        Thread.sleep(10000);
        driver.findElement(By.xpath("//a[@title='Return to Home']")).click();
        System.out.println("Return home page selected");
        System.out.println(" print changes");
    }
}