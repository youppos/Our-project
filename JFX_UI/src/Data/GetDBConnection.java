package Data;

import java.sql.*;

public class GetDBConnection {
    public static Connection connectDB(String ip){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
        }
        catch(Exception e){

        }
        Connection con=null;
        String uri="jdbc:mysql://"+ip+":3306/ourproject?useSSL=false" +
                "&serverTimezone=GMT&characterEncoding=utf-8" +
                "&allowPublicKeyRetrieval=true";
        try{
            con= DriverManager.getConnection(uri,"root","qq123456");
        }
        catch(SQLException e1){
            System.out.println(e1);
        }
        return con;
    }
}
