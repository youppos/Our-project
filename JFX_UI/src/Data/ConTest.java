package Data;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConTest {

    private static final String driver = "com.mysql.cj.jdbc.Driver";


    private static final String url = "jdbc:mysql://192.168.1.101:3306/mytest?useUnicode=true&characterEncoding=UTF-8";

    private static final String username = "root";

    private static final String password = "qq123456";


    private static Connection conn = null;



    static {
        try {
            Class.forName(driver);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }



    public static Connection getConnection() throws Exception {
        if (conn == null) {
            conn = DriverManager.getConnection(url, username, password);
            return conn;
        }
        return conn;

    }


    public static void main(String[] args) {

        try {
            Connection conn = ConTest.getConnection();
            if (conn != null) {
                System.out.println("Successed!");
            } else {
                System.out.println("Failed!");
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

}