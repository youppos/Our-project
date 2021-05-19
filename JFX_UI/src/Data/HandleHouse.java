package Data;

import java.sql.*;

public class HandleHouse {
    Connection con;
    PreparedStatement preSql;
    ResultSet rs;

    HandleHouse(String ip) {
        con = GetDBConnection.connectDB(ip);
        if (con == null) {
            return;
        }
    }

    public void query(House house) {
        String sql = "select * from housinginformation where state='未出租'";
        try {
            preSql=con.prepareStatement(sql);
            rs = preSql.executeQuery();
            while (rs.next()) {


            }

            con.close();
        } catch (SQLException e) {
        }
    }

    public boolean rent(House house){
        boolean ok=false;
        int num;
        String sql="select * from housinginformation where" +
                "address =? and area=? and floor=? and state='未出租'" +
                "and decoration =? and name=? and sex=? and phone=?" +
                "and id=?";
        try{
            preSql=con.prepareStatement(sql);
            preSql.setString(1,house.getAddress());
            preSql.setString(2,house.getArea());
            preSql.setString(3,house.getFloor());
            preSql.setString(4,house.getDecoration());
            preSql.setString(5,house.getName());
            preSql.setString(6,house.getSex());
            preSql.setString(7,house.getPhone());
            preSql.setString(8,house.getId());
            rs=preSql.executeQuery();
            if(rs.next()){
                ok=true;
                num=rs.getInt(1);
                preSql=con.prepareStatement("update housinginformation set state ='已出租'" +
                        "where num=?");
                preSql.setInt(1,num);
                preSql.executeUpdate();
            }else{
                ok=false;
            }
            con.close();
        }
        catch(SQLException e){}
        if (ok) {
            return true;
        }else{
            return false;
        }

    }
    public boolean out(House house){
        int ok=0;
        String sql="update housinginformation set state ='未出租'" +
                "where num=?";
        try{
            preSql=con.prepareStatement(sql);
            preSql.setInt(1,house.getNum());
            ok=preSql.executeUpdate();
        }
        catch(SQLException e){}
        if (ok!=0){
            return true;
        }else{
            return false;
        }
    }

//    public boolean change(House house){
//
//    }
}
