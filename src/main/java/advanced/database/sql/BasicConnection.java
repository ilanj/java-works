package advanced.database.sql;

import java.sql.*;


public class BasicConnection {
    public static void main(String args[]){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con= DriverManager.getConnection(
                    "jdbc:mysql://localhost:3307/world","root","8xPm2vad" +
                            "");


//here sonoo is advanced.database name, root is username and password
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery("select * from city");

            while(rs.next())
                System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));

            con.close();
        }catch(Exception e){ System.out.println(e);}
    }
}
