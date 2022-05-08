package com.mycompany.jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

//Definition of driver - Driver is a set of classes through which we interact with different types of databases.
public class JdbcInsertDemo {
    public static void main(String[] args)
    {
        String dbURL = "jdbc:mysql://localhost:3306/foodapp";
        String username = "root";
        String password = "";

        try
        {
            Class.forName("com.mysql.jdbc.Driver");//Creates a driver object for interacting with mysql database
            // different databases have different types of drivers. Ex: Oracle will have a different driver
            Connection conn = DriverManager.getConnection(dbURL,username,password);//Creates a connection to mysql database server by taking dbURL, username, password parameters

            String sql = "INSERT INTO Users (username, password, fullname, email) VALUES (?, ?, ?, ?)";

            PreparedStatement statement = conn.prepareStatement(sql);
            /*
            statement.setString(1, "john");
            statement.setString(2, "secretpass");
            statement.setString(3, "John Doe");
            statement.setString(4, "john.doe@gmail.com");
            */

            statement.setString(1, "justin");
            statement.setString(2, "passwordhaibhai");
            statement.setString(3, "Justin Tripathy");
            statement.setString(4, "justin.tripathy@gmail.com");

            int rowsInserted = statement.executeUpdate();
            if(rowsInserted>0)
            {
                System.out.println("A new user was inserted successfully!");
            }

        }
        catch (SQLException ex) {
            ex.printStackTrace();
        }
        catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
    }
}
