package Data;

public class Login {
    private String id;
    private String password;
    boolean loginSuccess=false;

    public void setId(String id) {
        this.id = id;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setLoginSuccess(boolean loginSuccess) {
        this.loginSuccess = loginSuccess;
    }

    public String getId() {
        return id;
    }

    public String getPassword() {
        return password;
    }

    public boolean isLoginSuccess() {
        return loginSuccess;
    }
}
