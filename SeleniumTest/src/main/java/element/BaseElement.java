package element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.DriverManager;

abstract class BaseElement {
    private By locator;
    private String name;
    private WebDriver driver= DriverManager.getDriver();

    public BaseElement(By locator, String name) {
        this.locator = locator;
        this.name = name;
    }
    public  void click(){
        driver.findElement(locator).click();
    }
    public boolean isDisplayed(){
        return driver.findElement(locator).isDisplayed();
    }

}
