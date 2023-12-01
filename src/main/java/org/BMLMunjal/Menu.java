package org.BMLMunjal;

import java.util.Scanner;
import java.util.Date;

public class Menu{
    private Scanner sc;
    private int opt;
    private String user;

    Menu(Scanner sc, String user){
        this.sc = sc;
        this.user = user;
    }
    public void menu(){
        System.out.println("\n\n\t\tWelcome to SUNITA milk dairy [ " + this.user + " ]");
        System.out.println("\t    DATE: " + new Date());
        System.out.println("\n\n\t\t\t1. Milk");
        System.out.println("\t\t\t2. Animal MEAL");
        System.out.println("\t\t\t3. Apply loan");
        System.out.println("\t\t\t4. About our Dairy");
        System.out.println("\t\t\t5. Logout");
        System.out.print("\n\n\t\t\tEnter option: ");
        opt = sc.nextInt();
        switch (opt) {
            case 1:
                depositMilk();
                break;
            case 2:
                meal();
                break;
            case 3:
                loan();
                break;
            case 4:
                about();
                break;
            case 5:
                System.out.println("\n\t\tThank you | keep visiting");
                System.exit(0);
            default:
                break;
        }
    }
    public void depositMilk() {
        Info n = new Info(sc);
        int animal;
        char back;
        System.out.println("\n\n__________________________________________\n");
        System.out.println("Enter your Milk animal NO. from below");
        System.out.println("\n\n\t|1. BUFFALO |2. COW |\n");
        animal = sc.nextInt();
        if (animal == 1)
            System.out.println("\nYou choose 'BUFFALO' \n");
        else if (animal != 1 && animal != 2) {
            System.out.println("\nError! Choose only option [1/2] .....");
            try {
                Thread.sleep(2500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            depositMilk();
        } else
            System.out.println("\nYou choose 'COW' \n");
        n.getData();
        n.putData();
        System.out.print("\nWant to go back to the Menu [y/n]-");
        back = sc.next().charAt(0);
        if (back == 'y' || back == 'Y') {
            menu();
        } else {
            depositMilk();
        }
    }
    public void meal() {
        long prod, how;
        char go;
        long totalVal;
        System.out.println("\n\t\t\t-- OUR ANIMAL MEAL PRODUCTS --");
        System.out.println("\n\t\t ============================================");
        System.out.println("\n\t\t| 1.Mahalakshmi Animal MEAL        - 1100rs  |");
        System.out.println("\n\t\t| 2.Mahalakshmi Bhusa              - 1000rs  |");
        System.out.println("\n\t\t| 3.For growth in Milk-Products    - 350rs   |");
        System.out.println("\n\t\t ============================================");
        System.out.print("\n\n\t*Enter Any Above Option for buying Products: ");
        prod = sc.nextLong();
        switch ((int) prod) {
            case 1:
                System.out.println("\n\n\tYou choose - Mahalakshmi Animal MEAL");
                System.out.print("\n\n\tEnter how many meal bags you want :- ");
                how = sc.nextLong();
                totalVal = 1100 * how;
                System.out.println("\n\tYour Bill-");
                System.out.println("\n\t\t _________________________________________");
                System.out.println("\n\t\t|           SUNITA MILK DAIRY                |");
                System.out.println("\n\n\t\t  Product name                Quantity   ");
                System.out.println("\n\n\t\t  *Mahalakshmi Animal MEAL       " + how);
                System.out.println("\n\n\t\t          Total Bill-" + totalVal + "rs");
                System.out.println("\n\t\t|_________________________________________|");
                break;
            case 2:
                System.out.println("\nYou choose - Mahalakshmi Bhusa ");
                System.out.print("\n\nEnter how many bhusa bags you want :- ");
                how = sc.nextLong();
                totalVal = 1000 * how;
                System.out.println("\n\tYour Bill-");
                System.out.println("\n\t\t _________________________________________");
                System.out.println("\n\t\t|           SUNITA MILK DAIRY             |");
                System.out.println("\n\n\t\t  Product name                 Quantity   ");
                System.out.println("\n\n\t\t  *Mahalakshmi Animal Bhusa       " + how);
                System.out.println("\n\n\t\t          Total Bill-" + totalVal + "rs");
                System.out.println("\n\t\t|_________________________________________|");
                break;
            case 3:
                System.out.println("\nYou choose - Milk growth products ");
                System.out.print("\n\nEnter how many product you want :- ");
                how = sc.nextLong();
                totalVal = 350 * how;
                System.out.println("\n\tYour Bill-");
                System.out.println("\n\t\t _________________________________________");
                System.out.println("\n\t\t|          SUNITA MILK DAIRY              |");
                System.out.println("\n\n\t\t   Product name                Quantity   ");
                System.out.println("\n\n\t\t  *growth in Milk-Product        " + how);
                System.out.println("\n\n\t\t          Total Bill-" + totalVal + "rs");
                System.out.println("\n\t\t|_________________________________________|");
                break;
            default:
                System.out.println("\n\t\tPlz Enter option between 1 to 3");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                meal();
                break;
        }
        System.out.print("\n\nWant to go back to the main menu [y/n] : ");
        go = sc.next().charAt(0);
        if (go == 'y' || go == 'Y')
            menu();
        else
            meal();
    }

    public void loan() {
        int loanOpt;
        long principal, tenure, emi;
        long interest, totalDue;
        char goBack;
        System.out.println("\n\t\t ----*loan*-----------*rate*----");
        System.out.println("\n\t\t| 1.Home loan          12%      |");
        System.out.println("\n\t\t| 2.Car loan           10%      |");
        System.out.println("\n\t\t| 3.Agriculture loan    7%      |");
        System.out.println("\n\t\t -------------------------------");
        System.out.print("\n\tEnter which loan option you choose: ");
        loanOpt = sc.nextInt();
        switch (loanOpt) {
            case 1:
                System.out.println("\n\nYou Choose- Home loan");
                System.out.print("\n\nEnter loan amount: ");
                principal = sc.nextLong();
                if (principal > 1000000) {
                    System.out.println("\n\t\tError! Maximum amount of loan is 10,00,000 rs");
                    try {
                        Thread.sleep(2600);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    loan();
                }
                System.out.print("\nEnter tenure(in years): ");
                tenure = sc.nextLong();
                interest = (principal * 12 * tenure) / 100;
                totalDue = principal + interest;
                emi = totalDue / (tenure * 12);
                System.out.println("\n\tYour Loan receipt-");
                System.out.println("\n\t\t _________________________________________");
                System.out.println("\n\t\t|         SUNITA MILK DAIRY--           |");
                System.out.println("\n\n\t\t   Home loan[on 12%]  -" + principal + "rs");
                System.out.println("\n\n\t\t   Interest           -" + interest + "rs");
                System.out.println("\n\n\t\t   Total loan due     -" + totalDue + "rs");
                System.out.println("\n\n\t\t          YOUR EMI -" + emi + "rs");
                System.out.println("\n\t\t|_________________________________________|");
                break;
            case 2:
                System.out.println("\n\nYou Choose- Car loan");
                System.out.print("\n\nEnter loan amount: ");
                principal = sc.nextLong();
                if (principal > 1000000) {
                    System.out.println("\nMaximum amount of loan is 10,00,000 rs");
                    try {
                        Thread.sleep(2600);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    loan();
                }
                System.out.print("\nEnter tenure(in years): ");
                tenure = sc.nextLong();
                interest = (principal * 10 * tenure) / 100;
                totalDue = principal + interest;
                emi = totalDue / (tenure * 10);
                System.out.println("\n\tYour Loan receipt-");
                System.out.println("\n\t\t _________________________________________");
                System.out.println("\n\t\t|         SUNITA MILK DAIRY--           |");
                System.out.println("\n\n\t\t   Car loan[on 10%]   -" + principal + "rs");
                System.out.println("\n\n\t\t   Interest           -" + interest + "rs");
                System.out.println("\n\n\t\t   Total loan due     -" + totalDue + "rs");
                System.out.println("\n\n\t\t         YOUR EMI   -" + emi + "rs");
                System.out.println("\n\t\t|_________________________________________|");
                break;
            case 3:
                System.out.println("\n\nYou Choose- Agriculture loan");
                System.out.print("\n\nEnter loan amount: ");
                principal = sc.nextLong();
                if (principal > 1000000) {
                    System.out.println("\nMaximum amount of loan is 10,00,000 rs");
                    try {
                        Thread.sleep(2600);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    loan();
                }
                System.out.print("\nEnter tenure(in years): ");
                tenure = sc.nextLong();
                interest = (principal * 7 * tenure) / 100;
                totalDue = principal + interest;
                emi = totalDue / (tenure * 7);
                System.out.println("\n\tYour Loan receipt-");
                System.out.println("\n\t\t _________________________________________");
                System.out.println("\n\t\t|        SUNITA MILK DAIRY--           |");
                System.out.println("\n\n\t\t Agriculture loan[on 7%] -" + principal + "rs");
                System.out.println("\n\n\t\t      Interest           -" + interest + "rs");
                System.out.println("\n\n\t\t      Total loan due     -" + totalDue + "rs");
                System.out.println("\n\n\t\t           YOUR EMI -" + emi + "rs");
                System.out.println("\n\t\t|_________________________________________|");
                break;
            default:
                System.out.println("\nEnter option between 1 to 3");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                loan();
                break;
        }
        System.out.print("\n\nWant to go back to the main menu [y/n] : ");
        goBack = sc.next().charAt(0);
        if (goBack == 'y' || goBack == 'Y')
            menu();
        else
            loan();
    }

    public void about() {
        System.out.println("\n\n\t\tAbout SUNITA milk dairy");
        System.out.println("\n\t\t ============================================");
        System.out.println("\n\t\t|  SUNITA milk dairy is a leading dairy      |");
        System.out.println("\n\t\t|  in the region, providing quality dairy   |");
        System.out.println("\n\t\t|  products to our customers. We are        |");
        System.out.println("\n\t\t|  committed to delivering fresh and        |");
        System.out.println("\n\t\t|  nutritious milk products.                |");
        System.out.println("\n\t\t ============================================");
        System.out.print("\nPress 'M' to go back to the main menu: ");
        char back = sc.next().charAt(0);
        if (back == 'M' || back == 'm')
            menu();
        else
            about();
    }
}
