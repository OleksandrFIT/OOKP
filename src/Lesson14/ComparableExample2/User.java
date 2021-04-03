package Lesson14.ComparableExample2;

public class User implements Comparable<User>{
    private String userName;
    private int age;
    private String emailAddress;

    public User(String userName, int age, String emailAddress) {
        this.userName = userName;
        this.age = age;
        this.emailAddress = emailAddress;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", age=" + age +
                ", emailAddress='" + emailAddress + '\'' +
                '}';
    }


    @Override
    public int compareTo(User o) {
        int result = this.userName.compareTo(o.getUserName());
        if (result == 0){
            result = Integer.compare(this.age, o.getAge());
        }
        if (result == 0){
            result= this.emailAddress.compareTo(o.getEmailAddress());
        }
        return result;
    }
}
