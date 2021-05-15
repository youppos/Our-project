import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        String ip="localhost";
        Scanner input=new Scanner(System.in);
        Register register1 = new Register();
        System.out.println("注册");
        System.out.print("输入账号：");
        String id1=input.nextLine();
        register1.setId(id1);
        System.out.print("\n输入密码：");
        String password1=input.nextLine();
        register1.setPassword(password1);
        System.out.print("\n输入用户名：");
        String userName=input.nextLine();
        register1.setUserName(userName);
        HandleRegister handleRegister1=new HandleRegister(ip);
        handleRegister1.writeRegister(register1);
        Login login1=new Login();
        System.out.println("\n登陆");
        System.out.print("输入账号：");
        String id2=input.nextLine();
        login1.setId(id1);
        System.out.print("\n输入密码：");
        String password2=input.nextLine();
        login1.setPassword(password2);
        HandleLogin handleLogin1=new HandleLogin(ip);
        handleLogin1.verify(login1);
        //这是一个更新的标记！！！
        //这也是个更新的标记！！！！！！！！！
    }
}
