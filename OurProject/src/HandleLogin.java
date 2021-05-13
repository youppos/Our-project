import javax.swing.*;
import java.sql.*;


public class HandleLogin {
    Connection con=null;
    PreparedStatement preSql;
    ResultSet rs;
    public HandleLogin(String ip){
        con=GetDBConnection.connectDB(ip);
        if (con==null){
            System.out.println("连接失败！");
            return;
        }
    }
    public void verify(Login user){
        String id=user.getId();
        String password=user.getPassword();
        String sql="select id,password from user where id=? and password =?";
        try{
            preSql=con.prepareStatement(sql);
            preSql.setString(1,id);
            preSql.setString(2,password);
            rs=preSql.executeQuery();
            if(rs.next()==true){
                user.setLoginSuccess(true);
                JOptionPane.showMessageDialog(null,"登陆成功","恭喜",JOptionPane.INFORMATION_MESSAGE);
            }else{
                user.setLoginSuccess(false);
                JOptionPane.showMessageDialog(null,"登陆失败","登陆失败，请重新登陆",JOptionPane.WARNING_MESSAGE);
            }
            con.close();
        }
        catch(SQLException e){

        }

    }
}
