package atm;

import static java.lang.String.format;

public class Account {
    public int accBal;

    public Account() {
        this.accBal = 0;
    }

    public void withdraw(int amount) {
        if (amount > this.accBal) {
            System.out.println("You have insufficient funds to withdraw.\n");
            return;
        }
        if (amount < 0) {
            System.out.println("You can only withdraw positive amount!\n");
            return;
        }

        this.accBal -= amount;
        System.out.printf("You have withdrawn $%d\n", amount);
    }

    public void deposit(int amount) {
        if (amount < 0) {
            System.out.println("You can only deposit positive amount!\n");
            return;
        }
        this.accBal += amount;
        System.out.printf("You have deposited $%d\n", amount);
    }

    public int getAccBal() {
        return this.accBal;
    }
}
