package Data;

import BaseData.Person;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class HouseDao {
    /**
     * 操作结果：根据SQL语句执行数据库的增删改操作
     *
     * @param sql SQL语句
     * @return boolean 如果操作数据库成功返回true，否则返回false
     */
    public boolean dataChange(String sql) {
        Connection conn = null;
        Statement stmt = null;
        try {
            //获得数据的连接
            conn = JDBCUtils.getConnection();
            //获得Statement对象
            stmt = conn.createStatement();
            //发送SQL语句
            int num = stmt.executeUpdate(sql);
            return num > 0;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            JDBCUtils.release(stmt, conn);
        }
        return false;
    }

    /**
     * 操作结果：根据参数sql获取数据库记录数据
     *
     * @param sql SQL语句
     * @return List 返回包含记录Records对象的集合
     */
    public List getRecordsDataBySql(String sql) {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        List list = new ArrayList();
        try {
            //获得数据的连接
            conn = JDBCUtils.getConnection();
            //获得Statement对象
            stmt = conn.createStatement();
            //发送SQL语句
            rs = stmt.executeQuery(sql);
            while (rs.next()) {
                BaseData.House house = new BaseData.House();
                // 索引是从1开始的
                house.setAddress(rs.getString(1));
                house.setPrice(rs.getString(2));
                house.setArea(rs.getString(3));
                house.setFloor(rs.getString(4));
                house.setState(rs.getString(5));
                house.setClient(rs.getString(6));
                house.setClientId(rs.getString(7));
                house.setDecoration(rs.getString(8));
                house.setClientId(rs.getString(9));
                house.setHostName(rs.getString(10));
                house.setHostId(rs.getString(11));
                house.setHostPhone(rs.getString(12));
                list.add(house);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            JDBCUtils.release(rs, stmt, conn);
        }
        return list;
    }
}
