package FormyTest;

import BestBuyTest.TopNavigationBar;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;

public class smokeTestCases {

    @Test

    public void VerifyAllButtons() throws InterruptedException {

        Buttons button = new Buttons();
        button.Button();
        button.verifyPrimaryButton();
    }

    @Test

    public void VerifySubmitForm() throws InterruptedException{

    }
// Basically calling methods from different packages, and see what happens lol

@Test
    public void usingArraysToGetTexts() throws InterruptedException{

    WebDriverManager.chromedriver().setup();
    WebDriver driver = new ChromeDriver();

    driver.get("http://formy-project.herokuapp.com/buttons");

    // This locator is for more than one locator, it will store all locators in an array
    List<WebElement> arrayLocator = driver.findElements(By.xpath("/html/body/div/form/div[2]/div/div/div/button"));

    arrayLocator.get(0);
    arrayLocator.get(1);
    arrayLocator.get(2);

    // first way to for each loop to inside of array element and get //
    for (WebElement element : arrayLocator){
        Thread.sleep(2000);
        element.click();
        System.out.println(element.getText());
    }

    }


    @Test
    public void UsingArrayForTopSectionButton() throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://formy-project.herokuapp.com/buttons");
        List<WebElement> topButtons = driver.findElements(By.xpath("/html/body/div/form/div[1]/div/div/button"));

        for (int i=0; i<topButtons.size(); i++){

            Thread.sleep(2000);
            topButtons.get(i).click();
            System.out.println(topButtons.get(i).getText());

            if(topButtons.get(i).getText().equals("Warning")){
                topButtons.get(i).click();
                System.out.println(topButtons.get(i).getText());
                break;
            }
        }
    }


    @Test

    public void VerifyMiddleSectionButtonsWithArray() throws InterruptedException{

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://formy-project.herokuapp.com/buttons");
        List<WebElement> middleButtons = driver.findElements(By.xpath("/html/body/div/form/div[2]/div/div/div/button"));

        for (int i=0; i<middleButtons.size(); i++){

            Thread.sleep(2000);
            middleButtons.get(i).click();
            System.out.println(middleButtons.get(i).getText());

            if(middleButtons.get(i).getText().equals("Middle")){
                middleButtons.get(i).click();
                System.out.println(middleButtons.get(i).getText());
                break;
            }
        }


    }

    @Test
    public void BestBuyNavigationSpecificTab() throws InterruptedException {
        // Create an object or initiate an object
        // ClassName, objectName, new Keyword, Constructor

        TopNavigationBar object = new TopNavigationBar();
            object.SpecificNavigationClick("Deals");

    }

    @Test
    public void FormySpecificLink() throws InterruptedException {
        GetTitles object = new GetTitles();
            object.mainPage();
            object.sepecificLink("Buttons");
            object.closePage();

    }

}
