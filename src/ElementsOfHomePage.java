import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementsOfHomePage {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://mish.sheygam.com/#/wellcome");
        WebElement button_go_to = driver.findElement(By.className("mat-button-wrapper"));
        System.out.println("Text of button:"+button_go_to.getText());
        WebElement button_xpath_go_to = driver.findElement(By.xpath("//span[contains(text(),'Go to Event list')]"));
        System.out.println(button_xpath_go_to.getText());
        WebElement button_css_go_to = driver.findElement(By.cssSelector("div.container-fluid " +
                "div.row.alignVertical.justify-content-center " +
                "div.col-sm-10 div.row.justify-content-center:nth-child(6)" +
                " button.mat-stroked-button > span.mat-button-wrapper"));
        System.out.println(button_css_go_to.getText());
        WebElement button_login_xpath = driver.findElement(By.xpath("//span[contains(text(),'Login')]"));
        System.out.println(button_login_xpath.getText());

       WebElement button_login_css = driver.findElement(By.cssSelector(""));
        System.out.println(button_login_css.getText());

        WebElement button_create_xpath = driver.findElement(By.xpath("//span[contains(text(),'Create Account')]"));
        System.out.println(button_create_xpath.getText());
        /*
        WebElement button_create_css = driver.findElement(By.cssSelector("div.container-fluid" +
        " div.row mat-toolbar.mat-toolbar.mat-toolbar-multiple-rows mat-toolbar-row.mat-toolbar-row " +
        "a.paddingLeft.hover.but.mat-button.ng-star-inserted:nth-child(4) span.mat-button-wrapper > " +
        "span.mat-button-wrapper"));
        System.out.println(button_create_css.getText());
        */


        Thread.sleep(5000);


        driver.quit();
    }
}
