package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import java.time.Duration;
import java.util.List;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class EditPostsPage {
    private static final int TIME_OUT = 8;

    private static final List<SelenideElement> RATING_SELECT = $$(byXpath("//td//select"));
    private static final List<SelenideElement> UPDATE_BUTTON = $$(byXpath("//button[contains(@class, 'is-outdlined')]"));
    private static final SelenideElement SUCCESS_MESSAGE_UPDATED = $(byXpath("//*[contains(text(), 'Post updated')]"));
    private static final SelenideElement SUCCESS_MESSAGE_POSTED = $(byXpath("//*[contains(text(), 'Posted')]"));
    private static final SelenideElement SUCCESS_MESSAGE_DELETE = $(byXpath("//*[contains(text(), 'deleted')]"));

    private static final List<SelenideElement> POST_TEXTAREA = $$(byXpath("//td//textarea"));
    private static final List<SelenideElement> ADD_BUTTON = $$(byXpath("//table[contains(@class, 'is')]//button[contains(text(), 'Add')]"));
    private static final List<SelenideElement> DELETE_BUTTON = $$(byXpath("//table[contains(@class, 'is')]//button[contains(text(), 'Delete')] "));



    private static final int POSITION = 0;
//    private static final int POSITION_UPDATE_BUTTON = 0;
//    private static final int POSITION_DELETE_BUTTON = 0;



    public EditPostsPage clickDeleteButton(){
        DELETE_BUTTON.get(POSITION).click();
        return this;
    }
    public EditPostsPage setupRating(String rating){
        RATING_SELECT.get(POSITION).selectOptionByValue(rating);
        return this;
    }
    public EditPostsPage clickUpdateButton(){
        UPDATE_BUTTON.get(POSITION).click();
        return this;
    }



    public EditPostsPage inputTextarea(String text){
        POST_TEXTAREA.get(POSITION).clear();
        POST_TEXTAREA.get(POSITION).sendKeys(text);
        return this;
    }

    public EditPostsPage clickAddButton(){
        ADD_BUTTON.get(POSITION).click();
        return this;
    }

    public String currentRating(){
        return RATING_SELECT.get(POSITION).getSelectedOptionValue();
    }

    public boolean isSuccessMessageUpdatedDisplayed(){
        return SUCCESS_MESSAGE_UPDATED.shouldBe(Condition.visible, Duration.ofSeconds(TIME_OUT)).isDisplayed();
    }

    public boolean isSuccessMessagePostedDisplayed(){
        return SUCCESS_MESSAGE_POSTED.shouldBe(Condition.visible, Duration.ofSeconds(TIME_OUT)).isDisplayed();
    }

    public boolean isSuccessMessageDeletedDisplayed(){
        return SUCCESS_MESSAGE_DELETE.shouldBe(Condition.visible, Duration.ofSeconds(TIME_OUT)).isDisplayed();
    }
}
