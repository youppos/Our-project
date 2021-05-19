package Data;

import java.sql.*;


public class HandleAge {
    Connection con;
    PreparedStatement preSql;
    ResultSet rs;
    public HandleAge(String ip){
        con=GetDBConnection.connectDB(ip);
        if (con==null){
            return;
        }
    }

    public void update(AgeStructure ageStructure){
        long sum=0;
        String sql="select age from basicinformation";
        try{
            preSql=con.prepareStatement(sql);
            rs=preSql.executeQuery();
            long num[]= new long[5];
            for (int i=0;i<num.length;i++){
                num[i]=0;
            }
            while(rs.next()){
                long age=rs.getInt(1);
                if (age>0&&age<=6){
                    num[0]++;
                }else if(age>=7&&age<=17){
                    num[1]++;
                }else if(age>=18&&age<=45){
                    num[2]++;
                }else if(age>=46&&age<69){
                    num[3]++;
                }else{
                    num[4]++;
                }
                sum++;
            }
            String per[]=new String[5];
            for (int i=0;i<per.length;i++){
                per[i]=String.format("%.2f",num[i]*1.0/sum*100)+"%";
            }
            ageStructure.setPer(per);
            preSql=con.prepareStatement("update agestructure set number =? where name='婴儿'");
            preSql.setString(1,num[0]+"");
            preSql.executeUpdate();
            preSql=con.prepareStatement("update agestructure set number =? where name='青少年'");
            preSql.setString(1,num[1]+"");
            preSql.executeUpdate();
            preSql=con.prepareStatement("update agestructure set number =? where name='成年人'");
            preSql.setString(1,num[2]+"");
            preSql.executeUpdate();
            preSql=con.prepareStatement("update agestructure set number =? where name='中年人'");
            preSql.setString(1,num[3]+"");
            preSql.executeUpdate();
            preSql=con.prepareStatement("update agestructure set number =? where name='老年人'");
            preSql.setString(1,num[4]+"");
            preSql.executeUpdate();


            preSql=con.prepareStatement("update agestructure set proportion =? where name='婴儿'");
            preSql.setString(1,per[0]);
            preSql.executeUpdate();
            preSql=con.prepareStatement("update agestructure set proportion =? where name='青少年'");
            preSql.setString(1,per[1]);
            preSql.executeUpdate();
            preSql=con.prepareStatement("update agestructure set proportion =? where name='成年人'");
            preSql.setString(1,per[2]);
            preSql.executeUpdate();
            preSql=con.prepareStatement("update agestructure set proportion =? where name='中年人'");
            preSql.setString(1,per[3]);
            preSql.executeUpdate();
            preSql=con.prepareStatement("update agestructure set proportion =? where name='老年人'");
            preSql.setString(1,per[4]);
            preSql.executeUpdate();
            con.close();
        }
        catch(SQLException e){}

    }
}
