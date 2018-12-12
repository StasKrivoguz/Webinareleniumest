import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Main {

    public static void main(String[] args) throws InterruptedException{
        //System.out.println("Hello World!");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://mish.sheygam.com/#/wellcome");
        System.out.println(driver.getTitle());
        driver.get("https://www.google.ru/");
        System.out.println(driver.getTitle());
        driver.navigate().back();
        System.out.println(driver.getTitle());
        driver.navigate().forward();
        System.out.println(driver.getTitle());


        driver.quit();
      /*  WebDriver driver = new FirefoxDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        driver.quit();*/
       /* WebDriver driver = new FirefoxDriver();
        driver.get("https://mish.sheygam.com/#/eventlist");
        driver.manage().window().maximize();
        driver.quit();*/



    }
}
