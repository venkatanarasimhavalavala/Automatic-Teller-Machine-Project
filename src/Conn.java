//For JDBC connection we have 5 steps
//Register the driver, create connection, create statement, execute query,  close connection
import java.sql.*;
public class Conn {
    Connection c;
    Statement s;
    public Conn(){
        try{ 
            c = DriverManager.getConnection("jdbc:mysql:///bankmanagementsystem","root","Narsi@1117");
            s=c.createStatement();
        
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}

