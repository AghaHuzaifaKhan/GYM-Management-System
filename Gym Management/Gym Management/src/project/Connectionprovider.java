/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;
import java.sql.*;
/**
 *
 * @author umust
 */
public class Connectionprovider {
    public static Connection getCon() 
    {
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/g","root","12345");
            return con;
        }
        catch (Exception e)
        {
            return null;
        }
        
    }
}
