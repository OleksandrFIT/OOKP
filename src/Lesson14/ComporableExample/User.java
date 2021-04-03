package Lesson14.ComporableExample;

public class User implements Comparable<User>{

    private String firstName;
    private String lastName;
    private String email;
    private int age;
    private int phoneNumber;

    public User(String firstName, String lastName, String email, int age, int phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.age = age;
        this.phoneNumber = phoneNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                ", phoneNumber=" + phoneNumber +
                '}';
    }

    @Override
    public int compareTo(User o) {
        int ageResult = new Integer(this.age).compareTo(o.age);
        if (ageResult ==0){
            int nameResult = this.firstName.compareTo(o.firstName);
            if (nameResult ==0){
                return  0;
            }else {
                return nameResult;
            }
        } else {
            return ageResult;
        }

    }
}
