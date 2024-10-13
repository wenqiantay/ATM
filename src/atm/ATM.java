package atm;

import java.io.Console;

public class ATM {
    public Account account;

    public ATM(Account account){
        this.account = account;
    }

    public boolean actions(Console cons, String action) {
        boolean keepRunning = true;

        switch(action.trim().toLowerCase()) {
            case "deposit": {
                String amt = cons.readLine("How much do you want to deposit?\n");
                int amountDeposit = Integer.parseInt(amt);
                this.account.deposit(amountDeposit);
                break;
            }
            case "withdraw": {
                String amt = cons.readLine("How much do you want to withdraw?\n");
                int amountWithdraw = Integer.parseInt(amt);
                this.account.withdraw(amountWithdraw);
                break;
            }
            case "check": {
                System.out.printf("You currently have $%d.\n", this.account.getAccBal());
                break;
            }
            case "exit":
                System.out.println("Thank you for using the old.ATM ! See you again ^^ ");
                keepRunning = false;
                break;

            default: {
                System.out.println("Check if you have input the correct command!");
                return true;
            }
        }
        return keepRunning;
    }
}
