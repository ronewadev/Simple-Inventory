/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DatabaseClasses;

import java.sql.*;

public class DatabaseConnector {
    
    public static void main(String[]args){
        
        
    }
    private Connection connection;

    public DatabaseConnector() {
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/inventory_system", "username", "password");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Connection getConnection() {
        return connection;
    }

    public void closeConnection() {
        try {
            if (connection != null && !connection.isClosed()) {
                connection.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
}