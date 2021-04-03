package Lesson15;

public class User {
    private String userEmail;

    public User(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getEmailAddress() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    @Override
    public String toString() {
        return "User{" +
                "userEmail='" + userEmail + '\'' +
                '}';
    }
}
