package Data;

import java.sql.*;

public class HandlePerson {
    Connection con;
    PreparedStatement preSql;

    public HandlePerson(String ip) {
        con = GetDBConnection.connectDB(ip);
        if (con == null) {
            return;
        }
    }

    public boolean insert(Person person) {
        int ok = 0;
        String sql = "insert into basicinformation values (?,?,?,?,?,?,?)";
        try {
            preSql = con.prepareStatement(sql);
            preSql.setString(1, person.getId());
            preSql.setString(2, person.getName());
            preSql.setString(3, person.getSex());
            preSql.setString(4, person.getAge());
            preSql.setString(5, person.getAddress());
            preSql.setString(6, person.getKey());
            preSql.setString(7, person.getIncomeLevel());
            ok = preSql.executeUpdate();
            con.close();
        } catch (SQLException e) {
        }
        if (ok != 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean delete(Person person) {
        int ok = 0;
        try {
            String sql = "delete from basicinformation where id=?";
            preSql = con.prepareStatement(sql);
            preSql.setString(1, person.getId());
            ok = preSql.executeUpdate();
            con.close();
        } catch (SQLException e) {
        }
        if (ok != 0) {
            return true;
        } else {
            return false;
        }
    }
}
