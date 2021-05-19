package Data;


import java.sql.*;

public class HandleLogin {
    Connection con=null;
    PreparedStatement preSql;
    ResultSet rs;
    public HandleLogin(String ip){
        con=GetDBConnection.connectDB(ip);
        if (con==null){
            return;
        }
    }
    public boolean verify(Login user){
        boolean ok=false;
        String id=user.getId();
        String password=user.getPassword();
        String sql="select id,password from user where id=? and password =?";
        try{
            preSql=con.prepareStatement(sql);
            preSql.setString(1,id);
            preSql.setString(2,password);
            rs=preSql.executeQuery();
            if(rs.next()){
                ok=true;
            }else{
                ok=false;
            }
            con.close();
        }
        catch(SQLException e){

        }
        if(ok){
            return true;
        }else{
            return false;
        }
    }
}
