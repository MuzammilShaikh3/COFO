
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author muzam
 */
public class table {
    MyConnection mycon=new MyConnection();
    public boolean addFood(String Name,String Quantity,String Price, String username){
        java.sql.PreparedStatement st;
      
        String addQuery="INSERT INTO `cofocart`( `Name`, `Quantity`, `Price`,`username`) VALUES (?,?,?,?)";
        try {
            st=MyConnection.getConnection().prepareStatement(addQuery);
            st.setString(1,Name );
            st.setString(2,Quantity );
            st.setString(3,Price );
            st.setString(4,username );
            
            if(st.executeUpdate()>0){
                return true;
                
            }else{
                return false;
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(table.class.getName()).log(Level.SEVERE, null, ex);
             return false;
        }
    
    }
    
    public void fillTable(JTable table)
    {
        java.sql.PreparedStatement st;
        ResultSet rs;
        String Query="SELECT * FROM `cofocart`";
        
        
        try {
            st=MyConnection.getConnection().prepareStatement(Query);
            
           rs = st.executeQuery();
           DefaultTableModel tableModel=(DefaultTableModel)table.getModel();
           Object[] row;
           while(rs.next())
           {
               row =new Object[5];
               row[0]=rs.getString(2);
               row[1]=rs.getString(3);
               row[2]=rs.getString(4);
               
               tableModel.addRow(row);
               
           }
        } catch (SQLException ex) {
            Logger.getLogger(table.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void fill(JTable table)
    {
        java.sql.PreparedStatement st;
        ResultSet rs;
        String Query="SELECT * FROM `cofocart`";
        
        int a=0;
        try {
            st=MyConnection.getConnection().prepareStatement(Query);
            
           rs = st.executeQuery();
           DefaultTableModel tableModel=(DefaultTableModel)table.getModel();
           Object[] row;
           
           
           while(rs.next())
           {
               row =new Object[5];
               if(a==0)
               {
                   row[0]=rs.getString(5);
                   a++;
               }
               
               row[1]=rs.getString(2);
               row[2]=rs.getString(3);
               
               tableModel.addRow(row);
           }
        } catch (SQLException ex) {
            Logger.getLogger(table.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public boolean delete()
    {
         java.sql.PreparedStatement st;
      
        String delQuery="TRUNCATE TABLE cofocart";
        try {
            st=MyConnection.getConnection().prepareStatement(delQuery);

                return (st.executeUpdate()>0);
                
            
            
        } catch (SQLException ex) {
            Logger.getLogger(table.class.getName()).log(Level.SEVERE, null, ex);
             return false;
        }
    }
}
