/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DatabaseClasses;

import java.sql.*;
import com.sun.jdi.connect.spi.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Ronewa.Muthivhi
 */
public class JDBCMySQL {
    
    public static void main(String[] args){
        
        String url="jdbc:mysql://localhost:3306/inventory_system";
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            Connection connection = DriverManager.getConnection(url)
        }catch(Exception e){
            
            System.out.print(e);
        }
    }
    
}
