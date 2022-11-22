package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class GlobalPage {
    private static final SelenideElement EDIT_POSTS_LINK = $(byXpath("//aside[contains(@class,'column')]//a[contains(@href, 'mydata')]"));

    public EditPostsPage clickEditPosts(){
        EDIT_POSTS_LINK.click();
        return new EditPostsPage();
    }
}
