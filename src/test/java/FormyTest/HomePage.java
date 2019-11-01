package FormyTest;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomePage {

    public static void main(String[] args) {

    }


    @Test
    public void HomePageLogin(){
        WebDriver driver = new ChromeDriver();

        driver.get("http://formy-project.herokuapp.com/keypress");

        WebElement input = driver.findElement(By.id("name"));
        input.sendKeys("Mustafa");

        WebElement button = driver.findElement(By.id("button"));
        button.click();






    }

    public void HomePageNavigation(){

    }
}
