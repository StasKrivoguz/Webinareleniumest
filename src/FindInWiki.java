import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class FindInWiki {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.wikipedia.org/");
        System.out.println(driver.getTitle());
        WebElement search_field = driver.findElement(By.id("searchInput"));
        search_field.click();
        search_field.sendKeys("Java");
        search_field.sendKeys(Keys.ENTER);
        Thread.sleep(5000);
        driver.navigate().back();
        WebElement search_field2 = driver.findElement(By.name("search"));
        search_field2.click();
        search_field2.sendKeys("Veronica");
        search_field2.sendKeys(Keys.ENTER);
        Thread.sleep(5000);


        driver.quit();




    }
}
