package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static config.Config.PageURLs.HOME_URL;

public class HomePage extends BasePage{


    public HomePage(WebDriver driver){
        super(driver);
    }


    private final By search = By.xpath("//span[text()='Поиск']/..");
    private final By searchExp = By.xpath("//input[@id='search-input']");


    public HomePage open(){
        driver.get(HOME_URL);
        return this;

    }


    public HomePage searchCourse(String input){
        WebElement searchField = driver.findElement(search);
        waitElementIsVisible(searchField).click();
        WebElement searchFieldExpanded = driver.findElement(searchExp);
        waitElementIsVisible(searchFieldExpanded);
        searchFieldExpanded.sendKeys(input, Keys.ENTER);

        return this;
    }



    }


