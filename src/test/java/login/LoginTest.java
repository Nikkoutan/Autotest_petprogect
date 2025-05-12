package login;
import base.BaseTest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import org.openqa.selenium.WebElement;

import static config.Config.CreditsInfo.MAIL;
import static config.Config.CreditsInfo.PASSWORD;
import static pages.LoginPage.*;

public class LoginTest extends BaseTest{


    @Test
    @DisplayName("Смена текстовок регистрация/логин")
    public void  test_3(){

        homePage.open().clickToLogin();
        WebElement signInTxt = driver.findElement(signInText);
        WebElement signInBtn = driver.findElement(signInButton);


        Assertions.assertEquals("Не зарегистрированы?", waitAndGetText(signInTxt));
       Assertions.assertEquals("Регистрация", waitAndGetText(signInBtn));

        signInBtn.click();

        Assertions.assertEquals("Уже зарегистрированы?", waitAndGetText(signInTxt));
        Assertions.assertEquals("Вход", waitAndGetText(signInBtn));

    }


    @Test
    @DisplayName("Успешный логин")
    @Tag("e2e")
    public void  test_2(){

        homePage.open().clickToLogin();
        loginPage.logInWith(MAIL, PASSWORD);

// дописать ассерты
    }

    @Test
    @DisplayName("Логин с неверным паролем")
    @Tag("e2e")
    public void  test_4(){
        homePage.open().clickToLogin();
        loginPage.logInWith(MAIL, "PASSWORD");

        WebElement errorTxt = driver.findElement(errorText);
        Assertions.assertEquals("Неправильный email или пароль.", waitAndGetText(errorTxt));

    }
}


