package fr.aelion.user;

public class LoginManager {
    private String login;
    private String password;
    public LoginManager(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public String getLogin() {
        return login;
    }

    public void login() {}
    public void logout() {}
}
