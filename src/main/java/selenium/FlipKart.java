package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class FlipKart {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

        driver.get("https://www.flipkart.com/");
        List<WebElement> links=new ArrayList<>();
        links=driver.findElements(By.tagName("a"));

       links.forEach(a-> System.out.println(a.getText()));
        System.out.println("exit");
//        driver.findElement(By.xpath("//*[@id=\'u_0_2\']")).click();

    }
}
