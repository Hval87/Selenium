package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.DriverManager;

import java.time.Duration;

abstract class BasePage {
    private By unicLocator;
    private String name;
    private WebDriver driver;
    public BasePage(By locator, String name){
        this.unicLocator =locator;
        this.name=name;

    }
    public boolean isPageOpen(){
        driver= DriverManager.getDriver();
        System.out.println(driver);
        return driver.findElement(unicLocator).isDisplayed();

    }


}
