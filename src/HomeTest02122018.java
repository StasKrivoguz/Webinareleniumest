import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class HomeTest02122018 {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.wikipedia.org/");
        WebElement search_field = driver.findElement(By.id("searchInput"));
        search_field.click();
        search_field.sendKeys("Selenium");
        search_field.sendKeys(Keys.ENTER);
        Thread.sleep(5000);
        driver.navigate().back();
        WebElement search_field1 = driver.findElement(By.name("search"));
        search_field1.click();
        search_field1.sendKeys("Tester");
        search_field1.sendKeys(Keys.ENTER);
        Thread.sleep(5000);



        driver.quit();




    }
}
