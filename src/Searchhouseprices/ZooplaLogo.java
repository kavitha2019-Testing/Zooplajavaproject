package Searchhouseprices;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class ZooplaLogo {
    public static void main(String[] args) throws InterruptedException {

            System.setProperty("webdriver.chrome.driver", "C:/Users/kavitha/Desktop/softwareFolder/chromedriver_win32/chromedriver.exe");
            //System.setProperty("webdriver.chrome.driver" ,"./Drivers/chromedriver.exe" );
            WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.zoopla.co.uk/");
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.MILLISECONDS);
        driver.manage().timeouts().pageLoadTimeout(50,TimeUnit.MILLISECONDS);
        Thread.sleep(5000);
        boolean b =  driver.findElement(By.xpath("//img[@class='icon--logo']")).isSelected();
        System.out.println( "image selected : "+ b);
        Thread.sleep(5000);
       driver.findElement(By.xpath("//a[@id='search-tabs-to-rent']")).click();
        //driver.findElement(By.xpath("//a[@id='search-tabs-house-prices']")).click();
        System.out.println("To rent selected");
        driver.findElement(By.xpath("//span[@class='search-input-location-placeholder']")).click();
        driver.findElement(By.xpath("//span[@class='search-input-location-placeholder']")).clear();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//span[@class='search-input-location-placeholder']")).sendKeys("Rm8 1ps");
        System.out.println(" post code selected");
       List<WebElement> L = driver.findElements(By.xpath("//select[@id='forsale_price_min']"));
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].click();", L);
        int  i = L.size();
        for ( int k= 0;k< i;k++) {
            String d = L.get(i).getText();
            System.out.println("print values are :" + d);


        }

        }
    }
