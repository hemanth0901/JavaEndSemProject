package org.BMLMunjal.DatabaseConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {
    private volatile static Connection connection;
    private DbConnection(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/sunita_milk_dairy","root", "root");
            System.out.println("Database is connected successfully!");
        }
        catch (Exception e){
            e.getStackTrace();
        }

    }
    public static Connection getDbConnection(){
        if(connection == null){
            synchronized (DbConnection.class){
                if(connection == null){
                    var dbConnection = new DbConnection();
                    connection = dbConnection.connection;
                }
            }
        }
        return connection;
    }
    public static boolean closeDbConnection()  {
        try{
            do{
                connection.close();
            }while(!connection.isClosed());
            return true;
        }catch (Exception e){
            e.getStackTrace();
        }
        return false;
    }
}
