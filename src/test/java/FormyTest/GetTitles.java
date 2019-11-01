package FormyTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class GetTitles {

    WebDriver driver;

    String xPath ="/html/body/div/div/li/a";


    @Test
    public void mainPage(){

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://formy-project.herokuapp.com/");
    }

    public void sepecificLink(String link) throws InterruptedException {
        List<WebElement> list = driver.findElements(By.xpath(xPath));
        for (WebElement each : list){
            Thread.sleep(2000);
            System.out.println(each.getText());
            if (each.getText().equalsIgnoreCase(link)){
                each.click();
                break;
            }
        }
    }

    public void closePage(){
        driver.quit();
    }


    @Test
    public void getTitlesTest() throws InterruptedException {
        mainPage();
        sepecificLink("Drag and Drop");
        closePage();
    }
}