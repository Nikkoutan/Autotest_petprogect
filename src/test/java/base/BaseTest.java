package base;

import common.CommonActions;
import org.apache.tools.ant.taskdefs.Java;
import org.junit.jupiter.api.AfterEach;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.BasePage;
import pages.HomePage;
import pages.LoginPage;

import java.util.concurrent.TimeUnit;

import static config.Config.CLEAR_COOKIES_AND_LOCAL_STORAGE;
import static config.Config.QUIT_BROWSER;

public class BaseTest {

    protected WebDriver driver = CommonActions.createDriver();
    protected BasePage basePage = new BasePage(driver);
    protected HomePage homePage = new HomePage(driver);
    protected LoginPage loginPage = new LoginPage(driver);

    public String waitAndGetText (WebElement element){
        final String text = basePage.waitElementIsVisible(element).getText();

        return text;
    }

    @AfterEach
    public void clearCookiesAndLocalStorage(){
        if(CLEAR_COOKIES_AND_LOCAL_STORAGE)
        {
            JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;

            driver.manage().deleteAllCookies();
            javascriptExecutor.executeScript("window.sessionStorage.clear()");
        }
    }

    //костыль, закрывающий окна при отладке тестов
    @AfterEach
    public void quitBrowserAfterTest(){
        if (QUIT_BROWSER){
            System.out.println("Закрытие браузера...");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            driver.quit();
        }
    }
}
