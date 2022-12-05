package page;

import element.Button;
import org.openqa.selenium.By;

public class MainPage extends BasePage {
    private static By pageLocator=By.xpath("//*[@class='p-body-main p-body-main--withSidebar ']");
    private  static String name="main page";
    private Button signInBTN=new Button(By.xpath("//a[contains(@class,'p-navgroup-link--logIn')]"),"sign in button");
    public MainPage() {
        super(pageLocator, name);
    }

    public boolean isPageOpen(){
        return super.isPageOpen();
    }
    public void clickButtonSignIn(){
        signInBTN.click();

    }

}
