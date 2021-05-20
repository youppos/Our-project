package Data;

import java.sql.*;

public class HandleCul {
    Connection con;
    PreparedStatement preSql;
    ResultSet rs;
    public HandleCul(){
        con=GetDBConnection.connectDB();
        if(con==null){
            return;
        }
    }


    public void update(CultrueStructure cultrueStructure){
        long sum=0;
        String sql="select education from basicinformation";
        try{
            long num[]=new long[7];
            for (int i=0;i<num.length;i++){
                num[i]=0;
            }
            preSql=con.prepareStatement(sql);
            rs=preSql.executeQuery();
            while(rs.next()){
                String education=rs.getString(1);
                switch(education){
                    case "小学":
                        num[0]++;
                        break;
                    case "初中":
                        num[1]++;
                        break;
                    case "高中":
                        num[2]++;
                        break;
                    case "大专":
                        num[3]++;
                        break;
                    case "本科":
                        num[4]++;
                        break;
                    case "硕士":
                        num[5]++;
                        break;
                    case "博士":
                        num[6]++;
                        break;
                }
                sum++;
            }
            String per[]=new String[7];
            for (int i=0;i<per.length;i++){
                per[i]=String.format("%.2f",num[i]*1.0/sum*100)+"%";
            }
            cultrueStructure.setPer(per);
            preSql=con.prepareStatement("update culturestructure set number =? where name='小学'");
            preSql.setString(1,num[0]+"");
            preSql.executeUpdate();
            preSql=con.prepareStatement("update culturestructure set number =? where name='初中'");
            preSql.setString(1,num[1]+"");
            preSql.executeUpdate();
            preSql=con.prepareStatement("update culturestructure set number =? where name='高中'");
            preSql.setString(1,num[2]+"");
            preSql.executeUpdate();
            preSql=con.prepareStatement("update culturestructure set number =? where name='大专'");
            preSql.setString(1,num[3]+"");
            preSql.executeUpdate();
            preSql=con.prepareStatement("update culturestructure set number =? where name='本科'");
            preSql.setString(1,num[4]+"");
            preSql.executeUpdate();
            preSql=con.prepareStatement("update culturestructure set number =? where name='硕士'");
            preSql.setString(1,num[5]+"");
            preSql.executeUpdate();
            preSql=con.prepareStatement("update culturestructure set number =? where name='博士'");
            preSql.setString(1,num[6]+"");
            preSql.executeUpdate();


            preSql=con.prepareStatement("update culturestructure set proportion =? where name='小学'");
            preSql.setString(1,per[0]);
            preSql.executeUpdate();
            preSql=con.prepareStatement("update culturestructure set proportion =? where name='初中'");
            preSql.setString(1,per[1]);
            preSql.executeUpdate();
            preSql=con.prepareStatement("update culturestructure set proportion =? where name='高中'");
            preSql.setString(1,per[2]);
            preSql.executeUpdate();
            preSql=con.prepareStatement("update culturestructure set proportion =? where name='大专'");
            preSql.setString(1,per[3]);
            preSql.executeUpdate();
            preSql=con.prepareStatement("update culturestructure set proportion =? where name='本科'");
            preSql.setString(1,per[4]);
            preSql.executeUpdate();
            preSql=con.prepareStatement("update culturestructure set proportion =? where name='硕士'");
            preSql.setString(1,per[5]);
            preSql.executeUpdate();
            preSql=con.prepareStatement("update culturestructure set proportion =? where name='博士'");
            preSql.setString(1,per[6]);
            preSql.executeUpdate();
            con.close();
        }
        catch(SQLException e){}
    }
}
