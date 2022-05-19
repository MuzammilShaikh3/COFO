/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
 import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author muzam
 */
public class cartcon {
    public static Connection getConnection(){
            Connection cnx=null;
    
            MysqlDataSource datasource =new MysqlDataSource();
            datasource.setServerName("localhost");
            datasource.setUser("root");
            datasource.setPassword("");
            datasource.setDatabaseName("cofo");
            datasource.setPortNumber(3307);
            
        try {
            cnx= datasource.getConnection();
        } catch (SQLException ex) 
        {
            Logger.getLogger("Get Connection->" + MyConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
     
            return cnx; 
     }
    
}
