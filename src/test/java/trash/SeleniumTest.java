package trash;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class SeleniumTest {

    @Test
    public void test_1() {

        System.setProperty("webdriver.chrome.driver", "C:\\Tools\\webdriver\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement foundElement = driver.findElement(By.xpath("//input[contains(@aria-label, \"Мне\")]"));
        foundElement.click();

        WebElement waiting = (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.id("123")));

    }

    @Test
    public void test_2() {
        System.setProperty("webdriver.chrome.driver", "C:\\Tools\\webdriver\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://avito.ru/rossiya/avtomobili");
        WebElement audi = driver.findElement(By.xpath("//a[@title='Audi'][1]"));
        String attr = audi.getAttribute("offsetWidth");
        System.out.println(attr);


    }

    @Test
    public void test_3() {
        System.setProperty("webdriver.chrome.driver", "C:\\Tools\\webdriver\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://avito.ru/rossiya/avtomobili");
        WebElement element = driver.findElement(By.cssSelector(".popular-rubricator-count-BwKhh"));
        String attr = element.getText();
        System.out.println(attr);


    }

    @Test
    public void test_4() {

        System.setProperty("webdriver.chrome.driver", "C:\\Tools\\webdriver\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://timeweb.com/ru/community/articles/luchshie-servisy-i-sayty-dlya-poiska-raboty-v-it");

        WebElement foundElement = driver.findElement(By.xpath("//a[text()='Войти']"));
        String par = foundElement.getCssValue("display");

        System.out.println(par);

    }

    @Test
    public void test_5() {

        System.setProperty("webdriver.chrome.driver", "C:\\Tools\\webdriver\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://skillbox.ru");

        WebElement element = driver.findElement(By.xpath("//div[contains(@id,\"app\")]/header/div[1]/div/button"));
        element.click();

        WebElement element2 = driver.findElement(By.xpath("//input[@name='search']"));
        element2.sendKeys("Java", Keys.ENTER);

    }

    @Test
    public void test_6() {

        System.setProperty("webdriver.chrome.driver", "C:\\Tools\\webdriver\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://crossbrowsertesting.github.io/drag-and-drop");
        WebElement wait = new WebDriverWait(driver, 10).until(ExpectedConditions.
                presenceOfElementLocated(By.id("draggable")));

        WebElement element = driver.findElement(By.id("draggable"));
        WebElement element2 = driver.findElement(By.id("droppable"));

        Actions action = new Actions(driver);

        //action.dragAndDrop(element, element2).build().perform();
        //или
        action.moveToElement(element).clickAndHold().moveToElement(element2).release().build().perform();

    }
}
