package Hotels;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class CreateAccount {
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
        driver.get("https://uk.hotels.com/");
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.MILLISECONDS);
        driver.manage().timeouts().pageLoadTimeout(50,TimeUnit.MILLISECONDS);
        Thread.sleep(5000);
        Boolean b= driver.findElement(By.xpath("//img[@class='logo']")).isEnabled();
        System.out.println("Image selcted : " + b);
        //EXPLICIT WAIT COMMAND

//        WebDriverWait wait=new WebDriverWait(driver,20);
//        WebElement element=wait. until(ExpectedConditions. visibilityOfElementLocated(By. xpath("//a[@id='hdr-create']")));
//        element.click();
//        driver.manage().deleteAllCookies();
        driver.findElement(By.xpath("//a[@id='hdr-create']")).click();
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.MILLISECONDS);
        System.out.println("Click on sign in button");

    }
}
