package element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.DriverManager;

public class InputField extends BaseElement {
    private WebDriver driver;
    private By locator;
    private String name;

    public InputField(By locator, String name) {
        super(locator, name);
        this.locator = locator;
        this.name = name;
    }
    public void inputText(String text) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver = DriverManager.getDriver();
        driver.findElement(locator).sendKeys(text);
    }

}
