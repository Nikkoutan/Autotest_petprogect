package common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static config.Config.BROWSER_TYPE;

public class CommonActions {
    public static WebDriver createDriver() {

        WebDriver driver = null;

        switch (BROWSER_TYPE) {
            case "chrome" : {
                System.setProperty("webdriver.chrome.driver", "C:\\Tools\\webdriver\\chromedriver-win64\\chromedriver.exe");
                driver = new ChromeDriver();
                break;
            }
            default:
                System.out.println("Неподдерживаемый браузер: " + BROWSER_TYPE);
        }

        driver.manage().window().maximize();
        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        return driver;


    }
}
