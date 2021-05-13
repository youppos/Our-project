import javax.swing.*;
import java.sql.*;

public class HandleRegister {
    Connection con=null;
    PreparedStatement preSql;
    public HandleRegister(String ip){
        con=GetDBConnection.connectDB(ip);
        if (con==null){
            System.out.println("连接失败！");
            return;
        }
    }
    public void writeRegister(Register user){
        String sql="insert into user values(?,?,?)";
        int ok=0;
        try{
            preSql=con.prepareStatement(sql);
            preSql.setString(1,user.getId());
            preSql.setString(2,user.getPassword());
            preSql.setString(3,user.getUserName());
            ok=preSql.executeUpdate();
            con.close();
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null,"id不能重复","警告", JOptionPane.WARNING_MESSAGE);
        }
        if (ok!=0){
            JOptionPane.showMessageDialog(null,"注册成功","恭喜",JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
