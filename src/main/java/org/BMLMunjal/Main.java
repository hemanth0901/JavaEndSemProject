package org.BMLMunjal;

import org.BMLMunjal.DatabaseConnection.DbConnection;

import java.awt.*;
import java.util.Scanner;
import java.io.File;

public class Main {
    public static void main(String[] args) {
        Scanner sc;
        Application app = new Application();
        try{
            sc = new Scanner(new File("C:\\\\Users\\\\maral\\\\Desktop\\\\java project\\\\JavaEndSemProject\\\\input.txt"));
            System.out.println("\n\t\t\t"+sc.nextLine());
            sc.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
        sc = new Scanner(System.in);

        int option = sc.nextInt();
        if(option == 1) {
            boolean didLogin = app.login();
            while(!didLogin){
                didLogin = app.login();
            }
        }
        else {
            boolean didRegister = app.register();
            if(didRegister){
                System.out.println("\t\t\tYou are successfully registered");
                app.login();
            }
            else{
                System.out.println("Please register again");
                app.register();
            }
        }
        Menu menu = new Menu(sc, app.getUser());
        menu.menu();
        sc.close();
        app.sc.close();
        DbConnection.closeDbConnection();
    }
}