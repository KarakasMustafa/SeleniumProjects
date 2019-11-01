package FormyTest;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Buttons {

    WebDriver driver;
    @Test
    public void Button() throws InterruptedException {
        //Setting up ChromeDriver via Maven dependencies.
        WebDriverManager.chromedriver().setup();
        //Creating object of ChromeDriver
        driver = new ChromeDriver();
        //Using get method to open the given url
        driver.get("http://formy-project.herokuapp.com");
        //To give time delay for page loading or any date.
        Thread.sleep(2000);
        //Locating the target element.
        driver.findElement(By.xpath("/html/body/div/div/li[2]/a")).click();
        //Time delay for elements to load
        //Thread.sleep(3000);
        //Retrieve the page title.
        String title = driver.getTitle();
        //Printing the page title
        System.out.println(title);

// Verify primary button

        Thread.sleep(3000);
        String primaryPath = "/html/body/div/form/div[1]/div/div/button[1]";
        WebElement primaryElement = driver.findElement(By.xpath(primaryPath));
        driver.findElement(By.xpath(primaryPath)).click();
        Thread.sleep(3000);
        System.out.println(primaryElement.getText());
        Thread.sleep(3000);
        driver.getTitle();

// verify success button

        Thread.sleep(3000);
        String successPath = "/html/body/div/form/div[1]/div/div/button[2]";
        WebElement successButton = driver.findElement(By.xpath(successPath));
        successButton.click();
        Thread.sleep(3000);
        successButton.getText();
        System.out.println(successButton.getText());

// verify info
        WebElement infoElement = driver.findElement(By.xpath("/html/body/div/form/div[1]/div/div/button[3]"));
        String infoPath = "/html/body/div/form/div[1]/div/div/button[3]";

        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(infoPath)));

        infoElement.click();
        System.out.println(infoElement.getText());
// warning button

        String Warningpath = "/html/body/div/form/div[1]/div/div/button[3]";
        WebDriverWait wait2 = new WebDriverWait(driver, 10);
        WebElement element2 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Warningpath)));
        element2.click();
        System.out.println(element2.getText());
    }

    @Test
    public void verifyPrimaryButton() throws InterruptedException{
        Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body/div/form/div[1]/div/div/button[1]")).click();
        WebElement primary = driver.findElement(By.xpath("/html/body/div/form/div[1]/div/div/button[1]"));
        System.out.println(primary.getText());
        Thread.sleep(3000);
        primary.click();
        driver.getTitle();

        Thread.sleep(3000);
        String successPath = "/html/body/div/form/div[1]/div/div/button[2]";
        WebElement successButton = driver.findElement(By.xpath(successPath));
        successButton.click();
        Thread.sleep(4000);
        successButton.getText();
        System.out.println(successButton.getText());

    // verify info


        WebElement infoElement = driver.findElement(By.xpath("/html/body/div/form/div[1]/div/div/button[3]"));
        String infoPath = "/html/body/div/form/div[1]/div/div/button[3]";

        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(infoPath)));

        infoElement.click();
        System.out.println(infoElement.getText());

        // Warning

        String Warningpath = "/html/body/div/form/div[1]/div/div/button[3]";
        WebDriverWait wait2 = new WebDriverWait(driver, 10);
        WebElement element2 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Warningpath)));
        element2.click();
        System.out.println(element2.getText());



    }

}
