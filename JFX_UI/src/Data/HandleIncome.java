package Data;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class HandleIncome {
    Connection con;
    PreparedStatement preSql;
    ResultSet rs;
    public HandleIncome(String ip){
        con=GetDBConnection.connectDB(ip);
        if(con==null){
            return;
        }
    }

    public void update(IncomeStructure incomeStructure){
        long sum=0;
        String sql="select incomeLevel from basicinformation";
        try{
            long num[]=new long[6];
            for (int i=0;i<num.length;i++){
                num[i]=0;
            }
            preSql=con.prepareStatement(sql);
            rs=preSql.executeQuery();
            while(rs.next()){
                int income=rs.getInt(1);
                if(income<1000){
                    num[0]++;
                }else if(income>=1000&&income<2000){
                    num[1]++;
                }else if(income>=2000&&income<3000){
                    num[2]++;
                }else if(income>=3000&&income<4000){
                    num[3]++;
                }else if(income>=4000&&income<6000){
                    num[4]++;
                }else{
                    num[5]++;
                }
                sum++;
            }
            incomeStructure.setNum(num);
            String per[]=new String[6];
            for (int i=0;i<per.length;i++){
                per[i]=String.format("%.2f",num[i]*1.0/sum*100)+"%";
            }
            preSql=con.prepareStatement("update incomestructure set number =? where name='1000以下'");
            preSql.setString(1,num[0]+"");
            preSql.executeUpdate();
            preSql=con.prepareStatement("update incomestructure set number =? where name='1000-2000'");
            preSql.setString(1,num[1]+"");
            preSql.executeUpdate();
            preSql=con.prepareStatement("update incomestructure set number =? where name='2000-3000'");
            preSql.setString(1,num[2]+"");
            preSql.executeUpdate();
            preSql=con.prepareStatement("update incomestructure set number =? where name='3000-4000'");
            preSql.setString(1,num[3]+"");
            preSql.executeUpdate();
            preSql=con.prepareStatement("update incomestructure set number =? where name='4000-6000'");
            preSql.setString(1,num[4]+"");
            preSql.executeUpdate();
            preSql=con.prepareStatement("update incomestructure set number =? where name='6000以上'");
            preSql.setString(1,num[5]+"");
            preSql.executeUpdate();


            preSql=con.prepareStatement("update incomestructure set proportion =? where name='1000以下'");
            preSql.setString(1,per[0]);
            preSql.executeUpdate();
            preSql=con.prepareStatement("update incomestructure set proportion =? where name='1000-2000'");
            preSql.setString(1,per[1]);
            preSql.executeUpdate();
            preSql=con.prepareStatement("update incomestructure set proportion =? where name='2000-3000'");
            preSql.setString(1,per[2]);
            preSql.executeUpdate();
            preSql=con.prepareStatement("update incomestructure set proportion =? where name='3000-4000'");
            preSql.setString(1,per[3]);
            preSql.executeUpdate();
            preSql=con.prepareStatement("update incomestructure set proportion =? where name='4000-6000'");
            preSql.setString(1,per[4]);
            preSql.executeUpdate();
            preSql=con.prepareStatement("update incomestructure set proportion =? where name='6000以上'");
            preSql.setString(1,per[5]);
            preSql.executeUpdate();
            con.close();
        }
        catch(SQLException e){}
    }
}
