package org.BMLMunjal;

import java.util.Scanner;

class Info {
    public String name;
    public int no;
    public int fat;
    public float milk;
    public String day;
    private Scanner sc;

    Info(Scanner sc){
        this.sc = sc;
    }
    public String getName() {
        return name;
    }

    public int getNo() {
        return no;
    }

    public int getFat() {
        return fat;
    }

    public float getMilk() {
        return milk;
    }

    public String getDay() {
        return day;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public void setFat(int fat) {
        this.fat = fat;
    }

    public void setMilk(float milk) {
        this.milk = milk;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public void getData() {
        System.out.print("\nEnter Your Name (without space): ");
        name = sc.nextLine();
        System.out.print("\nEnter Your No.: ");
        no = sc.nextInt();
        System.out.print("\nEnter Morning OR Evening: ");
        day = sc.next();
        System.out.print("\nEnter Milk in liters: ");
        milk = sc.nextFloat();
        System.out.print("\nEnter Milk fat: ");
        fat = sc.nextInt();
    }

    public void putData() {
        float fatRate = 6.43f;
        float fatT = fat * fatRate;
        float total = (fat * fatRate) * milk;
        System.out.println("\n\tYOUR BILL-");
        System.out.println("\n\t\t  ====================================");
        System.out.println("\n\t\t|          SUNITA milk dairy           |");
        System.out.println("\n\t\t  Name : " + name + "       No:" + no);
        System.out.println("\n\t\t  Milk session: " + day);
        System.out.println("\n\t\t  Milk : " + milk + " Litre" + "      Fat: " + fat);
        System.out.println("\n\t\t| Fat rate: " + fatT + "     Total: " + total + "rs  |");
        System.out.println("\n\t\t  ====================================");
    }
}