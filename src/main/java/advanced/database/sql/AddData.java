package advanced.database.sql;

import java.sql.*;

public class AddData {
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con= DriverManager.getConnection(
                    "jdbc:mysql://localhost:3307/ila","root","8xPm2vad" +
                            "");

            String query="insert into jpatest (id,name,location)"+ " values (?, ?, ?)";
            PreparedStatement preparedStmt = con.prepareStatement(query);
            preparedStmt.setInt (1, 36);
            preparedStmt.setString (2, "ila");
            preparedStmt.setString   (3, "shols");
            preparedStmt.execute();

//here sonoo is advanced.database name, root is username and password
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery("select * from jpatest");

            while(rs.next())
                System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));

            con.close();
        }catch(Exception e){ System.out.println(e);}
    }
}
