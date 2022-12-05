import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import page.MainPage;
import page.SignInForm;
import utils.DataParser;
import utils.DriverManager;

public class TestSuite {
    private WebDriver driver;

    @BeforeTest
    void setUp() {
        driver = DriverManager.getDriver();
    }

    @Test
    public void suite() {
        driver.get(DataParser.getValueByKey("url"));
        MainPage mainPage = new MainPage();
        Assert.assertTrue(mainPage.isPageOpen());
        mainPage.clickButtonSignIn();
        SignInForm signInForm=new SignInForm();
        signInForm.signIn("hval","1355725");
        Assert.assertTrue(mainPage.isPageOpen());

    }

    @AfterTest
    public void tearsDown() {
       //driver.quit();
    }

}
