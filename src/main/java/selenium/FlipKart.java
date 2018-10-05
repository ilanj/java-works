package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class FlipKart {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

        driver.get("https://www.flipkart.com/");
        driver.findElement(By.xpath("//*[@id=\'container\']/div/header/div[1]/div/div/div/div[3]/div[1]/div/a")).click();

       driver.findElement(By.className("_2AkmmA _29YdH8")).click();
        System.out.println("exit");
//        driver.findElement(By.xpath("//*[@id=\'u_0_2\']")).click();

    }
}
