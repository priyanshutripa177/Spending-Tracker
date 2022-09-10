
package db;
import java.sql.*;
import javax.swing.JOptionPane;
public class DBConnect {
    public static Connection c;
    public static Statement st;
    static{
        try{
            c=DriverManager.getConnection("jdbc:mysql://localhost:3306/spendingdb"
                    + ""+"?openSSL=false","root","123456");
            st=c.createStatement();

        }
            catch(Exception ex){
            JOptionPane.showMessageDialog(null,ex);
        } 
    }
}
