/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javainventoryapplication;

/**
 *
 * @author Ronewa.Muthivhi
 */
public class JDBCDemo {
    
    public void main(String[]args){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
