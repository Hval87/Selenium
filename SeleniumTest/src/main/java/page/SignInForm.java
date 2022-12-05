package page;

import element.Button;
import element.InputField;
import org.openqa.selenium.By;

public class SignInForm extends BasePage {
    private static By locator=By.xpath("//div[@data-url='https://t600-club.ru/login/']");
    private static String name="Sign in";

    private InputField userName=new InputField(By.xpath("//input[@name='login']"),"name user");
    private InputField userPassword=new InputField(By.xpath("//input[@name='password']"),"name user");
    private Button signInBTN=new Button(By.xpath("//button[contains(@class,'button--icon--login')]"),"signIn");
    public SignInForm() {
        super(locator, name);

    }
    public void signIn(String name, String password){
        userName.inputText(name);
        userPassword.inputText(password);
        signInBTN.click();
    }
}
