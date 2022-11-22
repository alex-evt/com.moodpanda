package model;

public class User {

    private String userEmail = "uyzyu@mailto.plus";
    private String userPassword = "12345678";

    public User() {
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public String getUserPassword() {
        return userPassword;
    }
}

