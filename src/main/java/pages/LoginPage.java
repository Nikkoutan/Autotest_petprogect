package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasePage{
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public static final By signInButton = By.xpath("//div[@class='sign-in-block']/button");
    public static final By signInText = By.xpath("//div[@class='sign-in-block']/p");
    public static final By loginEmail = By.xpath("//input[@id='email']");
    public static final By loginPassword = By.xpath("//input[@type='password']");
    public static final By loginEnterButton = By.xpath("//button[contains(@class,'register-form')]");

    public static final By errorText = By.xpath("//p[contains(@class,'error')]");

    public LoginPage enterEmail (String email){
        WebElement lgnEmail = driver.findElement(loginEmail);
        waitElementIsVisible(lgnEmail).sendKeys(email);

        return this;
    }

    public LoginPage enterPassword (String password){

        WebElement lgnPassword = driver.findElement(loginPassword);
        waitElementIsVisible(lgnPassword).sendKeys(password);

        return this;
    }

    public LoginPage logInWith (String email, String password){
        WebElement lgnEmail = driver.findElement(loginEmail);
        waitElementIsVisible(lgnEmail).sendKeys(email);

        WebElement lgnPassword = driver.findElement(loginPassword);
        waitElementIsVisible(lgnPassword).sendKeys(password);

        WebElement lgnEnterBtn = driver.findElement(loginEnterButton);
        waitElementIsVisible(lgnEnterBtn).click();

        return this;
    }
}
