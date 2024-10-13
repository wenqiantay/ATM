package old;

import java.io.Console;
public class ATM {

    public static void main(String[] args) {
        
        int accBal = 0;
        Console cons = System.console();
        System.out.println("Welcome to old.ATM");
        boolean programIsRunning = true;
        
        while(programIsRunning){
            String input = cons.readLine("Would you like to deposit, withdraw or check?\n");

            switch (input.trim().toLowerCase()) {

                case "deposit":
                    String amtDepo = cons.readLine("How much do you want to deposit?\n");
                    int amountdeposit = Integer.parseInt(amtDepo);
                    if (amountdeposit > 0) {
                        System.out.printf("You have deposited $%d !\n", amountdeposit);
                        accBal += amountdeposit;
                    } else {
                        System.out.println("You can only deposit positive amount!\n");
                    }
                    break;    

                case "withdraw":
                    String amtWth = cons.readLine("How much do you want to withdraw?\n");
                    int amountWithdraw = Integer.parseInt(amtWth);
                    if (amountWithdraw > accBal) {
                        System.out.println("You have insufficient funds to withdraw.\n");
                    } else if (amountWithdraw < 0) {
                        System.out.println("You can only withdraw positive amount!\n");
                    } else {
                        System.out.printf("You have withdrawed $%d.\n", amountWithdraw);
                        accBal -= amountWithdraw;
                    }
                break;

                case "check":
                    System.out.printf("You currently have $%d.\n", accBal);
                break;

                case "exit":
                programIsRunning = false;
                System.out.println("Thank you for using the old.ATM ! See you again ^^ ");
                break;

                default:
                System.out.println("Check if you have input the correct command!\n");
            }
    
        }
    }


}