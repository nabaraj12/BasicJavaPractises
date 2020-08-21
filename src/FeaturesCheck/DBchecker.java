/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FeaturesCheck;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author lll
 */
public class DBchecker {
    
    public static void main(String args[])
    {
        getConnection();
    }
    public static Connection getConnection()
    {
        Connection con=null;
        try
        {
            //step1 load the driver class  
            Class.forName("oracle.jdbc.driver.OracleDriver"); 
        } 
        catch (Exception e) 
        {
        System.out.println(e);
                return con;
        }
	try 
        {
            con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","games","games");
            return con;
        }
	catch (Exception e) 
        {
            // TODO: handle exception
            System.out.println(e);
                return con;
        }
    }
}
