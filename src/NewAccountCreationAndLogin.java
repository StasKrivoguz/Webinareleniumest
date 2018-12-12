import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class NewAccountCreationAndLogin {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://mish.sheygam.com/#/wellcome");
        Thread.sleep(5000);
        List<WebElement> topLinks = driver.findElements(By
                .xpath("//span[@class='mat-button-wrapper']//span[@class='mat-button-wrapper']"));
        driver.manage().window().maximize();
        WebElement loginButton = topLinks.get(0);
        WebElement createAccountButton = topLinks.get(1);
        System.out.println("Login: " + loginButton.getText());
        System.out.println("Create Account: " + createAccountButton.getText());
        WebElement logoImg = driver
                .findElement(By.xpath("//img[@class='img-responsive']"));
        System.out.println(logoImg.getAttribute("class"));
        WebElement logoImg_css = driver
                .findElement(By.cssSelector("img.img-responsive"));
        System.out.println(logoImg_css.getAttribute("class"));
        createAccountButton.click();
        WebElement emailField = driver.findElement(By
                .cssSelector("input[formcontrolname='email']"));
        emailField.click();
        emailField.sendKeys("xxx32@gmail.com");
        WebElement passwordField = driver.findElement(By
                .cssSelector("input[formcontrolname='password']"));
        passwordField.click();
        passwordField.sendKeys("123456");
        WebElement passwordFieldRep = driver.findElement(By
                .cssSelector("input[formcontrolname='passwordRep']"));
        passwordFieldRep.click();
        passwordFieldRep.sendKeys("123456");

        WebElement registrationButton = driver
                .findElement(By.xpath("//button[@type='submit']"));
        registrationButton.click();
        Thread.sleep(8000);
        WebElement cancelButton = driver.findElement(By
                .xpath("//button[@type='button']/span[contains(text(),'Cancel')]/.."));
        cancelButton.click();
        Thread.sleep(3000);
        WebElement menu = driver
                .findElement(By.xpath("//mat-icon[@class='but mat-icon material-icons']"));
        menu.click();
        Thread.sleep(2000);
        WebElement logoutMenu = driver.findElement(By.xpath("//span[@class='marginLeft']"));
        logoutMenu.click();
        System.out.println("----------Login created user----------");

        WebElement login = driver.findElement(By.xpath("//span[contains(text(),'Login')]"));
        login.click();
        System.out.println(login.getText());

        WebElement emailReg = driver.findElement(By.xpath("//input[@formcontrolname='email']"));
        emailReg.click();
        emailReg.sendKeys("xxx32@gmail.com");
        Thread.sleep(2000);

        WebElement passReg =  driver.findElement(By.xpath("//input[@formcontrolname='password']"));
        passReg.click();
        passReg.sendKeys("123456");

        WebElement log_In = driver.findElement(By.xpath("//span[contains(text(),'Log in')]"));
        log_In.click();
       /* WebElement cancel_button = driver.findElement(By.xpath("//span[contains(text(),'Cancel')]"));
        cancel_button.click();*/
        WebElement cancel_button = driver.findElement(By.cssSelector("class.btn margin mat-raised-button Cancel"));
        cancel_button.click();

        Thread.sleep(8000);
        Thread.sleep(3000);


        driver.quit();
    }
}

