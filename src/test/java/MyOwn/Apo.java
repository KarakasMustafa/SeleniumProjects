package MyOwn;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Apo {

    @Test
    public void ApoTest() throws InterruptedException{

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");

        String userName = "//*[@id=\"email\"]";
        String passWord = "//*[@id=\"pass\"]";
        String logInButton = "//*[@id=\"u_0_2\"]";
        WebElement element = driver.findElement(By.xpath(userName));
        element.sendKeys("m.isik02");
        WebElement element2 = driver.findElement(By.xpath(passWord));
        element2.sendKeys("fuckthemeksikans");
        WebDriverWait wait3 = new WebDriverWait(driver, 10);
        WebElement element3 = wait3.until(ExpectedConditions.elementToBeClickable(By.xpath(logInButton)));
        element3.click();

        String search = "//*[@id=\"u_9_2\"]/input[2]";
        WebDriverWait wait4 = new WebDriverWait(driver, 10);
        WebElement element4 = wait4.until(ExpectedConditions.elementToBeClickable(By.xpath(search)));

        element4.sendKeys("aponun amk lmfao");
    }

}

