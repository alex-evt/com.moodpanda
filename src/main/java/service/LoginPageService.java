package service;

import model.User;
import pages.LoginPage;

public class LoginPageService {

    LoginPage loginPage = new LoginPage();

    public GlobalPageService login(User user) {
        loginPage.openPage().
                fillInEmail(user.getUserEmail()).
                fillInPassword(user.getUserPassword()).
                clickLoginButton();
        return new GlobalPageService();
    }
}
