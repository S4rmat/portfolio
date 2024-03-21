package pos_restaurant;


/**
 *
 * @author Admin
 */
import java.sql.*;
import javax.swing.*;

public class conn_db {
    
    Connection conn=null;
    public static Connection conn_jdb(){
        
        try{
            Class.forName("org.sqlite.JDBC");
            Connection conn =DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Admin\\Downloads\\sqlite\\dbases\\restpos.sqlite");
            //JOptionPane.showMessageDialog(null, "Connection to database is successful");
            
            return conn;
           
            
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
        
    }
}
