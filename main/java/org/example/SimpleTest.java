package org.example;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.security.Key;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class SimpleTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        //driver.manage().window().maximize();
        driver.get("https://www.amazon.co.za/?&tag=zatxtabkgode-21&ref=pd_sl_7rwefcbkep_e&adgrpid=172901824200&hvpone=&hvptwo=&hvadid=721507631414&hvpos=&hvnetw=g&hvrand=7150344193810213043&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9214271&hvtargid=kwd-10573980&hydadcr=9973_2328983&mcid=&language=en_ZA&gad_source=1");
        WebElement laptop = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
        laptop.sendKeys("laptop");
        laptop.sendKeys(Keys.ENTER);
        driver.findElement(By.xpath("//button[@id='a-autoid-3-announce']")).click();
        Thread.sleep(3000);
        WebElement element = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", element);
        driver.findElement(By.xpath("//span[starts-with(@class,'nav-cart')]")).click();
        Thread.sleep(3000);
        WebElement text =driver.findElement(By.xpath("//span[@class='a-truncate-cut'][contains(text(),'ASUS Vivobook Go 15 (E1504G) Intel N100® 8GB RAM 2')]"));
        text.getText();
        System.out.println(text);
        WebElement price =driver.findElement(By.xpath("//span[contains(@class,'a-size-medium a-color-base sc-price sc-white-space-nowrap')]"));
        price.getText();
        System.out.println(price);
        driver.quit();
    }
}
