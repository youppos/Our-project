package Data;

public class RegisterAndLogin {
    Register register;
    Login login;
    HandleRegister hRegister;
    HandleLogin hLogin;
    RegisterAndLogin(String ip){
        register=new Register();
        login=new Login();
        hRegister=new HandleRegister(ip);
        hLogin=new HandleLogin(ip);
    }
}
