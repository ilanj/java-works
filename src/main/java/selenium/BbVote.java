package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BbVote {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","./chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com/search?q=bbtamil+vote&ie=utf-8&oe=utf-8&client=firefox-b-ab");
        driver.findElement(By.xpath("//*[@id='dimg_17']")).click();

    }
}
