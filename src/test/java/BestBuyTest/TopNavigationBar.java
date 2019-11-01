package BestBuyTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.util.List;

public class TopNavigationBar {

    // Junit Library
    // --> @Test : For test case run  ====> Same page, Multiple case creation.
    // ==> Assert.AssertTrue()   ====> Verify, compare actual, expected result
    // Actual : The one I create
    // Expected result : The one comes from Test

    // 3 Categories in a class
    // 1- Variable
    // 2- Method
    // 3- Global Variable

    WebDriver driver;

    // Methods
    // Locators



    public void NavigateToBestBuy() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.bestbuy.com/");

    }


    public void CloseBestBuy() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }

    public void EachNavigationGetText() throws InterruptedException {
        Thread.sleep(2000);
        String xPath = "//*[@id=\"header-block\"]/div[2]/div[2]/div/nav[1]/ul/li/button";
        List<WebElement> topButtons = driver.findElements(By.xpath(xPath));
        for (WebElement each : topButtons) {
            Thread.sleep(4000);
            System.out.println(each.getText());
            System.out.println("=================");
        }
    }

    public void EachNavigationClick() throws InterruptedException {
        String xPath = "//*[@id=\"header-block\"]/div[2]/div[2]/div/nav[1]/ul/li/button";
        List<WebElement> topButtons = driver.findElements(By.xpath(xPath));
        Thread.sleep(2000);
        for (WebElement each : topButtons) {
            Thread.sleep(5000);
            each.click();
            System.out.println("=================");
        }
    }

    public void SpecificNavigationClick(String TabName) throws InterruptedException {
        String xPath = "//*[@id=\"header-block\"]/div[2]/div[2]/div/nav[1]/ul/li/button";
        List<WebElement> topButtons = driver.findElements(By.xpath(xPath));
        Thread.sleep(2000);
        for (WebElement each : topButtons) {
            Thread.sleep(2000);
            if (each.getText().equalsIgnoreCase(TabName)) {
                each.click();
                Thread.sleep(3000);
            }
        }
    }



    @Test
    public void NavigationBarTabsGetText() throws InterruptedException {

        NavigateToBestBuy();
        EachNavigationGetText();
        CloseBestBuy();

    }

    @Test
    public void NavigationBarTabsClick() throws InterruptedException {

        NavigateToBestBuy();
        EachNavigationClick();
        CloseBestBuy();

    }

    @Test
    public void TopButtonsClickDynamic() throws InterruptedException {

        NavigateToBestBuy();
        SpecificNavigationClick("Deals");
        CloseBestBuy();


    }
}
