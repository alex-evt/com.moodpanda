package tests;

import model.User;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import service.EditPostService;
import service.GlobalPageService;
import service.LoginPageService;

public class EditPostsTest extends BaseTest {

    EditPostService editPostService;

    @BeforeClass
    public void loginAndOpenEditPostPage() {
        User user = new User();
        LoginPageService loginPageService = new LoginPageService();
        GlobalPageService globalPageService = new GlobalPageService();

        loginPageService.login(user);
        globalPageService.openEditPostPage();
    }

    @Test (priority = 1, description = "Check that new message has been added")
    public void checkAddNewMessageTest(){
        editPostService = new EditPostService();
        String message = "My new message";
        String rating = "4";
        boolean isPostedDisplayed = editPostService.
                addNewPostMessage(rating, message)
                .isSuccessMessagePostedDisplayed();
        Assert.assertTrue(isPostedDisplayed);
    }

    @Test (priority = 2, description = "Check that rating has been updated (if current rating is the same as updating rating then randomly chooses another rating)")
    public void checkUpdateRatingTest() {
        editPostService = new EditPostService();
        String rating = "10";
        boolean isUpdatedDisplayed = editPostService
                .updateRating(rating)
                .isSuccessMessageUpdatedDisplayed();
        Assert.assertTrue(isUpdatedDisplayed);
    }

    @Test (priority = 3, description = "Check that post field message has been updated and 'Post updated' message appears")
    public void checkUpdateMessageTest(){
        editPostService = new EditPostService();
        String message = "My updated message";
        boolean isUpdatedDisplayed = editPostService
                .updatePostMessage(message)
                .isSuccessMessageUpdatedDisplayed();
        Assert.assertTrue(isUpdatedDisplayed);
    }

    @Test (priority = 4, description = "Check post deletion")
    public void checkDeletePostTest(){
        editPostService = new EditPostService();
        boolean isDeletedDisplayed = editPostService.
                deletePost()
                .isSuccessMessageDeletedDisplayed();
        Assert.assertTrue(isDeletedDisplayed);
    }
}
