package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DriverManager {
    private static WebDriver driver=null;
    private DriverManager(){}
    public static WebDriver getDriver(){
        if(driver==null){
            ChromeOptions options=new ChromeOptions();
            options.addArguments("-incognito");
            System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\chromedriver.exe");
            driver= new ChromeDriver(options);
            driver.manage().window().maximize();
            return driver;
        }
        else
            return driver;

    }
}
