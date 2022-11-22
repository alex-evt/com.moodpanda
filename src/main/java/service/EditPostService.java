package service;

import utils.RandomRating;
import pages.EditPostsPage;

public class EditPostService {

    EditPostsPage editPostsPage = new EditPostsPage();

    public EditPostsPage updateRating(String rating) {
        editPostsPage
                .setupRating(checkRating(rating))
                .clickUpdateButton();
        return new EditPostsPage();
    }

    public EditPostsPage updatePostMessage(String text){
        editPostsPage
                .inputTextarea(text)
                .clickUpdateButton();
        return new EditPostsPage();
    }

    public EditPostsPage addNewPostMessage(String rating, String text){
        editPostsPage
                .setupRating(rating)
                .inputTextarea(text)
                .clickAddButton();
        return new EditPostsPage();
    }

    public EditPostsPage deletePost(){
        editPostsPage.clickDeleteButton();
        return new EditPostsPage();
    }


    private String checkRating(String rating) {
        if (editPostsPage.currentRating().equals(rating)){
            return RandomRating.getRandomRating();
        }
        return rating;
    }


}
