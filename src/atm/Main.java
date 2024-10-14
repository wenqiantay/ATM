package atm;

import java.io.Console;

public class Main {
    public static void main(String[] args) {
        Account myAcc = new Account();
        ATM dbsATM = new ATM(myAcc);

        Console cons = System.console();
        System.out.println("Welcome to ATM");
        boolean programIsRunning = true;

        while(programIsRunning) {
            String input = cons.readLine("Would you like to deposit, withdraw or check?\n");
            programIsRunning = dbsATM.actions(cons, input);
        }


    }
}
