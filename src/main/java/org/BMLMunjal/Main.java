package org.BMLMunjal;

import org.BMLMunjal.DatabaseConnection.DbConnection;

import java.awt.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Application app = new Application(sc);
        System.out.println("\n\t\t\tWanna log-in[1] or Register[2]");
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
            }
        }
        Menu menu = new Menu(sc, app.getUser());
        menu.menu();
        sc.close();
        DbConnection.closeDbConnection();
    }
}