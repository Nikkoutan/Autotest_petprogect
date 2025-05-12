package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static config.Constants.TimeoutConstants.WAIT_SECONDS;

public class BasePage {
   protected WebDriver driver;

   public BasePage(WebDriver driver){
      this.driver = driver;
   }

    private final By loginButton = By.xpath("//button[contains(@class,'login-btn')]");

   public WebElement waitElementIsVisible(WebElement element){

       WebElement waitUntilVisible = new WebDriverWait(driver, WAIT_SECONDS).until(ExpectedConditions.visibilityOf(element));
       return element;
   }


// нажатие на кнопку "Войти" в правом верхнем углу страниц
    public BasePage clickToLogin(){
        WebElement lgnBtn = driver.findElement(loginButton);
        waitElementIsVisible(lgnBtn).click();

        return this;
    }

//   public WebElement findElement(){
//
//
//   }


}
