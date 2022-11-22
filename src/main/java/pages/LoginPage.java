package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class LoginPage {

    private static final String LOGIN_URL = "https://moodpanda.com/login";
    private static final SelenideElement EMAIL_INPUT = $(byXpath("//input[@placeholder='MoodPanda registered email ']"));
    private static final SelenideElement PASSWORD_INPUT = $(byXpath("//input[@name='password']"));
    private static final SelenideElement LOGIN_BUTTON = $(byXpath("//button[contains(@class, 'button')]"));


    public LoginPage openPage(){
        open(LOGIN_URL);
        return this;
    }

    public LoginPage fillInEmail(String email){
        EMAIL_INPUT.sendKeys(email);
        return this;
    }
    public LoginPage fillInPassword(String password){
        PASSWORD_INPUT.sendKeys(password);
        return this;
    }

    public void clickLoginButton(){
        LOGIN_BUTTON.click();
    }

}
