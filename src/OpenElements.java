import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class OpenElements {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://mish.sheygam.com/#/wellcome");
        WebElement button = driver.findElement(By.xpath("//span[contains(text(),'Go to Event list')]"));
        button.click();
        Thread.sleep(4000);

        driver.quit();




    }
}
