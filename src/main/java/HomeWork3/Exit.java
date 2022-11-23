package HomeWork3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class Exit {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        options.addArguments("start-maximized");

        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.get("https://www.gastronom.ru");

        //Autorization.runAutoriz();

        WebElement button10 = driver.findElement(By.xpath(".//*[@class=\"new-user-panel__avatar\"]"));
        button10.click();

        WebElement area10 = driver.findElement(By.id("js-login-form__login"));
        area10.click();
        area10.sendKeys("QATest");

        WebElement area11 = driver.findElement(By.id("js-login-form__password"));
        area11.click();
        area11.sendKeys("3jJ@kHa6y3reDVD");

        WebElement button11 = driver.findElement(By.xpath(".//input[@value='ВОЙТИ']"));
        button11.click();


        WebElement button = driver.findElement(By.xpath("/html/body/header/div/div/div/div/span[1]/span[1]/img[1]"));
        button.click();

        WebElement button1 = driver.findElement(By.xpath(".//a[contains(text(),'Выход')]"));
        button1.click();

        driver.navigate().to("https://www.gastronom.ru");

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.navigate().to("https://www.gastronom.ru/user/edit/QATest");


        driver.quit();
    }
}
