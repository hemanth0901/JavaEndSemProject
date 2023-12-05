package org.BMLMunjal;

import java.util.Scanner;

class Info {
    private String name;
    private int no;
    private int fat;
    private float milk;
    private String day;
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
        setName(sc.nextLine());
        System.out.print("\nEnter Your No.: ");
        setNo(sc.nextInt());
        System.out.print("\nEnter Morning OR Evening: ");
        setDay(sc.next());
        System.out.print("\nEnter Milk in liters: ");
        setMilk(sc.nextFloat());
        System.out.print("\nEnter Milk fat: ");
        setFat(sc.nextInt());
    }

    public void putData() {
        float fatRate = 6.43f;
        float fatT = fat * fatRate;
        float total = (fat * fatRate) * milk;
        System.out.println("\n\tYOUR BILL-");
        System.out.println("\n\t\t  ====================================");
        System.out.println("\n\t\t|          SUNITA milk dairy           |");
        System.out.println("\n\t\t  Name : " + getName() + "       No:" + getNo());
        System.out.println("\n\t\t  Milk session: " + getDay());
        System.out.println("\n\t\t  Milk : " + getMilk() + " Litre" + "      Fat: " + getFat());
        System.out.println("\n\t\t| Fat rate: " + fatT + "     Total: " + total + "rs  |");
        System.out.println("\n\t\t  ====================================");
    }
}