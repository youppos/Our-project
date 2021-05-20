package Data;

public class RegisterAndLogin {
    Register register;
    Login login;
    HandleRegister hRegister;
    HandleLogin hLogin;
    RegisterAndLogin(){
        register=new Register();
        login=new Login();
        hRegister=new HandleRegister();
        hLogin=new HandleLogin();
    }
}
