package org.BMLMunjal;

import org.BMLMunjal.DatabaseConnection.DbConnection;

import java.awt.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Application {
    private String user;
    private final Scanner sc;
    private final Connection connection;
    Application(Scanner sc){
        this.sc = sc;
        this.connection = DbConnection.getDbConnection();
    }
    public String getUser(){
        return this.user;
    }
    public boolean login(){
        System.out.println("\n\n\t\t\t|--------------LOGIN----------------|");
        System.out.print("\n\t\t\t Enter User_name: ");
        this.user = sc.next();
        System.out.print("\n\t\t\t Enter Password: ");
        String pass = sc.next();
        try{
            PreparedStatement ps = connection.prepareStatement("SELECT Username, password_hashcode FROM users WHERE Username=? AND password_hashcode=? ");
            ps.setString(1, user);
            ps.setInt(2, pass.hashCode());
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                return true;
            }
            else{
                System.out.println("\n\t\t\t Please enter your correct credentials!");
                return login();
            }
        }
        catch(Exception e){
            e.getStackTrace();
        }
        return false;
    }
    public boolean register(){
        int intResult = 0;
        System.out.println("\n\n\t\t\t|--------------REGISTER----------------|");
        System.out.print("\n\t\t\t Enter User_name: ");
        user = sc.next();
        String pass = "pass";
        String repass = "repass";
        while(!repass.equals(pass)){
            System.out.println("\n\t\t\t Enter the Password: ");
            sc.nextLine();
            pass = sc.nextLine();
            System.out.println("\n\t\t\t Reenter the password");
            repass = sc.nextLine();
            if(!repass.equals(pass)){
                System.out.println("\n\t\t\t the passwords are not matching!");
            }
        }
        try{
            var ps = connection.prepareStatement("INSERT INTO users (Username, password_hashcode) VALUES(?, ?);");
            ps.setString(1, user);
            ps.setInt(2, pass.hashCode());
            intResult = ps.executeUpdate();
        }
        catch (Exception e){
            e.getStackTrace();
        }
        return intResult>0;
    }
}
