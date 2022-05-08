package com.mycompany.jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JdbcDeleteDemo {
    public static void main(String[] args)
    {
        String dbURL = "jdbc:mysql://localhost:3306/foodapp";
        String username = "root";
        String password = "";

        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection(dbURL,username,password);
            String sql = "DELETE FROM Users WHERE username=?";

            PreparedStatement statement = conn.prepareStatement(sql);
            //statement.setString(1, "bill");
            statement.setString(1, "john");

            int rowsDeleted = statement.executeUpdate();
            if(rowsDeleted>0)
            {
                System.out.println("A user was deleted successfully!");
            }
            else
            {
                System.out.println("Sorry! This user is not present");
            }
        }
        catch (SQLException ex)
        {
            ex.printStackTrace();
        }
        catch (ClassNotFoundException ex)
        {
            ex.printStackTrace();
        }
        finally
        {

        }
    }
}
