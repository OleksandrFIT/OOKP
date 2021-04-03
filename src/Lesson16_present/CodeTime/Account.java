package Lesson16_present.CodeTime;

import java.util.Objects;

public class Account {
    private int id;
    private int password;
    private String login;

    public Account(int id, int password, String login) {
        this.id = id;
        this.password = password;
        this.login = login;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", password=" + password +
                ", login='" + login + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return id == account.id && password == account.password && Objects.equals(login, account.login);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, password, login);
    }
}
