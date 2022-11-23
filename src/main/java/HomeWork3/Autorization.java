package HomeWork3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

public class Autorization {

    public static void main(String[] args) {

        runAutoriz();

    }

        public static void runAutoriz () {

            WebDriverManager.chromedriver().setup();
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--incognito");
            options.addArguments("start-maximized");

            WebDriver driver = new ChromeDriver(options);
            driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
            driver.get("https://www.gastronom.ru");

            WebElement button = driver.findElement(By.xpath(".//*[@class=\"new-user-panel__avatar\"]"));
            button.click();

            WebElement area = driver.findElement(By.id("js-login-form__login"));
            area.click();
            area.sendKeys("QATest");

            WebElement area1 = driver.findElement(By.id("js-login-form__password"));
            area1.click();
            area1.sendKeys("3jJ@kHa6y3reDVD");

            WebElement button1 = driver.findElement(By.xpath(".//input[@value='ВОЙТИ']"));
            button1.click();

//            try {
//                Thread.sleep(10000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }

            //driver.navigate().to("https://www.gastronom.ru/");

            //driver.quit();
        }


    }
