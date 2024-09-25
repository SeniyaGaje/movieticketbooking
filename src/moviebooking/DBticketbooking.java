package moviebooking;


import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;

public class DBticketbooking {
      Connection conn=null;
      
public static Connection ConnecrDb(){
    try{
        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection conn =DriverManager.getConnection("jdbc:mysql://localhost/java_dbmovies","root","");
        return conn;
    }
    catch(Exception e)
    {
        System.out.println(e);
    }
    
return null;
}

   
}
