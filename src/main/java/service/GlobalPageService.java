package service;

import pages.GlobalPage;

public class GlobalPageService {

    GlobalPage globalPage = new GlobalPage();

    public EditPostService openEditPostPage() {
        globalPage.clickEditPosts();
        return new EditPostService();
    }
}
