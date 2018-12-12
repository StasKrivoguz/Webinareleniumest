package Testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Testng {
    @Test
  public static void Testng(){
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://mish.sheygam.com/#/wellcome");
        driver.quit();
    }
    @Test
    public static void accountCreation() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://mish.sheygam.com/#/wellcome");
        WebElement create_acc = driver.findElement(By.xpath("//span[contains(text(),'Create Account')]"));
        create_acc.click();
        WebElement email_field = driver.findElement(By.xpath("//input[@formcontrolname='email']"));
        WebElement password_field = driver.findElement(By.xpath("//input[@formcontrolname ='password']"));
        WebElement confirm_pass = driver.findElement(By.xpath("//input[@formcontrolname='passwordRep']"));
        email_field.click();
        email_field.sendKeys("vasya98@gmail.com");
        password_field.click();
        password_field.sendKeys("987456123");
        confirm_pass.click();
        confirm_pass.sendKeys("987456123");
        WebElement registration = driver.findElement(By.xpath("//span[contains(text(),'Registration')]"));
        registration.click();
        Thread.sleep(5000);


        driver.quit();
    }
}
